import os
from pathlib import Path
from typing import Optional
from typer import Argument, Option, Typer

from pysysml2 import __version__
from pysysml2.modeling import Model
from pysysml2.cli.ui import console

app = Typer()


@app.callback()
def main():
    """PySysML2 CLI tools."""
    pass


@app.command()
def export(
    input: Path = Argument(
        ...,
        metavar="MODEL_FILE",
        help="The sysml2 model file.",
        exists=True,
        readable=True,
        resolve_path=True,
    ),
    format: str = Option(
        "json",
        "--format",
        help="One or more comma-separated output file formats. "
        "Supported formats: json,txt,csv,xlsx,dot,png",
    ),
    out_dir: Optional[Path] = Option(
        None,
        "-o",
        "--output-dir",
        help="The output directory for the generated file(s). Defaults to current "
        "directory.",
        resolve_path=True,
    ),
):
    """Export a SysML v2 model to various file formats."""
    model = Model()  # Create Model object
    model.from_sysml2_file(input)  # Parse the textual model

    # Create output directory if not exist
    out_dir = out_dir or Path.cwd()
    os.makedirs(out_dir, exist_ok=True)

    console.print(f"Using output directory: {out_dir}")

    fmts = _parse_format_arg(format)
    for fmt in fmts:
        _serialize_model(model, fmt, out_dir)


def _parse_format_arg(format: str):
    return format.split(",")


def _serialize_model(model: Model, format: str, out_dirpath: Path):
    format = format.lower()
    out_dir = str(out_dirpath)

    if format == "json":
        console.print(f"Exporting to JSON...")
        model.to_JSON(out_dir)

    elif format == "csv":
        console.print(f"Exporting to csv...")
        model.to_csv(out_dir)

    elif format == "txt":
        console.print(f"Exporting to txt...")
        model.to_txt(out_dir)

    elif format in ("excel", "xlsx"):
        console.print(f"Exporting to xlsx...")
        model.to_excel(out_dir)

    elif format == "png":

        try:
            console.print(f"Exporting to png...")
            model.to_png(out_dir)

        except FileNotFoundError as e:
            if "No such file or directory: 'dot'" in str(e):
                console.error(
                    message="Unable to export to png. "
                    "Graphviz `dot` command not found."
                )
            else:
                raise e

    elif format == "dot":
        console.print(f"Exporting to dot...")
        model.to_dot(out_dir)

    else:
        raise ValueError(f"Unknown format '{format}'")
