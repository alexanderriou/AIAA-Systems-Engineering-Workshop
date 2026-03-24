import json
from pathlib import Path

import pytest
import pandas as pd

from pysysml2.modeling.model import Model

from ..utils import (
    assert_dicts_equal,
    assert_dataframes_equal,
    requires_graphviz,
    requires_openpyxl,
)


def assert_model_output_json_equal(output_path: Path, expect_path: Path):
    assert output_path.exists()

    with open(output_path) as f:
        output_data = json.load(f)
    with open(expect_path) as f:
        expect_data = json.load(f)

    assert_dicts_equal(
        output_data, expect_data, ignore_keys=("uuid", "uuid_parent", "input_file")
    )


def assert_model_output_csv_equal(output_path: Path, expect_path: Path):
    assert output_path.exists()

    output_df = pd.read_csv(output_path)
    expect_df = pd.read_csv(expect_path)

    assert_dataframes_equal(
        output_df, expect_df, ignore_columns=("uuid", "uuid_parent", "parent")
    )


def assert_model_output_txt_equal(output_path: Path, expect_path: Path):
    assert output_path.exists()

    output_txt = output_path.read_text()
    expect_txt = expect_path.read_text()

    assert output_txt == expect_txt


def assert_model_output_excel_equal(output_path: Path, expect_path: Path):
    assert output_path.exists()

    output_df = pd.read_excel(output_path)
    expect_df = pd.read_excel(expect_path)

    assert_dataframes_equal(
        output_df, expect_df, ignore_columns=("uuid", "uuid_parent", "parent")
    )


@pytest.fixture
def expect_datadir(shared_datadir: Path):
    return shared_datadir / "expect" / "output"


@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model1_load(model_name: str, shared_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))

    # TODO: asserts


@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model_to_json(model_name: str, shared_datadir: Path, output_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))
    model.to_JSON(output_datadir)

    output_name = f"{model_name}.json"
    expect_datadir = shared_datadir / "expect" / "output"
    expect_path = expect_datadir / output_name
    output_path = output_datadir / output_name
    assert_model_output_json_equal(output_path, expect_path)


@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model_to_csv(model_name: str, shared_datadir: Path, output_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))
    model.to_csv(output_datadir)

    output_name = f"{model_name}.csv"
    expect_datadir = shared_datadir / "expect" / "output"
    expect_path = expect_datadir / output_name
    output_path = output_datadir / output_name
    assert_model_output_csv_equal(output_path, expect_path)


@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model_to_txt(model_name: str, shared_datadir: Path, output_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))
    model.to_txt(output_datadir)

    output_name = f"{model_name}.txt"
    expect_datadir = shared_datadir / "expect" / "output"
    expect_path = expect_datadir / output_name
    output_path = output_datadir / output_name
    assert_model_output_txt_equal(output_path, expect_path)


@requires_openpyxl
@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model_to_excel(model_name: str, shared_datadir: Path, output_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))
    model.to_excel(output_datadir)

    output_name = f"{model_name}.xlsx"
    expect_datadir = shared_datadir / "expect" / "output"
    expect_path = expect_datadir / output_name
    output_path = output_datadir / output_name
    assert_model_output_excel_equal(output_path, expect_path)


@requires_graphviz(python_only=True)
@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model_to_dot(model_name: str, shared_datadir: Path, output_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))
    model.to_dot(output_datadir)

    output_name = f"{model_name}.dot"
    output_path = output_datadir / output_name
    assert output_path

    # TODO: check contents of generated file


@requires_graphviz
@pytest.mark.parametrize("model_name", ["model_1", "model_2"])
def test_model_to_png(model_name: str, shared_datadir: Path, output_datadir: Path):

    model_path = shared_datadir / "models" / f"{model_name}.sysml2"
    model = Model()
    model.from_sysml2_file(str(model_path))
    model.to_png(output_datadir)

    output_name = f"{model_name}.png"
    output_path = output_datadir / output_name
    assert output_path

    # TODO: check contents of generated file
