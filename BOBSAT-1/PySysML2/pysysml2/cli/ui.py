from typing import Optional
import click

try:
    import rich
    import rich.console

except ImportError:  # pragma: nocover
    rich = None  # type: ignore


class Console:
    def __init__(self):
        if rich:
            self._rconsole = rich.console.Console()
        else:
            self._rconsole = None

    def print(self, message: Optional[str] = None, nl: bool = True, err: bool = False):
        if self._rconsole:
            self._rconsole.print(message)
        else:
            click.echo(message, nl=nl, err=err)

    def error(self, ename: str = "Error", message: str = ""):
        if self._rconsole:
            message = f"[red]{ename}:[/red] {message}"
            self._rconsole.print(message)
        else:
            message = f"{ename}: {message}"
            click.echo(message, err=True)


console = Console()
