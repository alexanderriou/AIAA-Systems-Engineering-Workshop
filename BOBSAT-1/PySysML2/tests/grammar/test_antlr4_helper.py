from pysysml2.grammar.distpy.SysML2Parser import SysML2Parser

from pysysml2.grammar.antlr4_helper import (
    build_parser_context_names_enum,
)


def test_build_parser_context_names_enum():
    parser_contexts = build_parser_context_names_enum(
        SysML2Parser, "ParserContextsEnum"
    )
    for kw in parser_contexts:
        assert kw.name == kw.value
