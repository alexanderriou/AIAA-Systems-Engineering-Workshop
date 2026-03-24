import os
from pathlib import Path
import pytest


@pytest.fixture
def shared_models_datadir(shared_datadir: Path):
    return shared_datadir / "models"


@pytest.fixture
def output_datadir(datadir: Path):
    """Temporary output data diretory for a test case."""
    output_dir = datadir / "__output__"
    os.makedirs(output_dir, exist_ok=True)
    return output_dir
