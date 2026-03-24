from antlr4 import Lexer, Parser
from enum import Enum


def build_lexer_literal_enum(lexer: Lexer, enum_name, prefix="KW_"):
    dd = {
        k: lexer.literalNames[getattr(lexer, k)].strip("'")
        for k in dir(lexer)
        if k.startswith(prefix)
    }
    return Enum(enum_name, dd)


def build_parser_context_names_enum(parser: Parser, enum_name, contains="Context"):

    dd = {k: k for k in dir(parser) if contains in k and k[0].isupper()}
    return Enum(enum_name, dd)


def get_overridden_methods(cls):
    """_summary_
    Get all overridden methods of a class
    Source: https://stackoverflow.com/questions/58540997/get-overridden-functions-of-subclass
    Returns:
        _type_: _description_
    """
    # collect all attributes inherited from parent classes
    parent_attrs = set()
    for base in cls.__bases__:
        parent_attrs.update(dir(base))

    # find all methods implemented in the class itself
    methods = {name for name, thing in vars(cls).items() if callable(thing)}

    # return the intersection of both
    return parent_attrs.intersection(methods)
