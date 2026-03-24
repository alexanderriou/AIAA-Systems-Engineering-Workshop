grammar SysML2;

// A model is a set of elements that runs until the end of the file
model: element* EOF;
// An element is anything that can be a part of a model
element : namespace | feature | comment | doc | statement;

// A namespace is an element with a scope defined by curly braces
namespace   : sysml2_package | part | use_case_def | comment | doc;
//------------------------------------------------------------------------------
sysml2_package: KW_PACKAGE ID '{' namespace* '}';

// Parts
part_blk: (feature | comment | doc | part_def_specializes);
part: (part_def | part_def_specializes);
part_def: ((KW_PART KW_DEF ID '{' part_blk* '}')|(KW_PART KW_DEF ID';'));
part_def_specializes: KW_PART KW_DEF? ID (KW_SPECIALIZES
                                          | KW_SYM_SUBSETS) ID (',' ID)*?
                                          ('{' part_blk* '}' | ';');

// Use Cases
use_case_blk: part_blk | objective_def;
use_case_def: KW_USE KW_CASE KW_DEF ID '{' use_case_blk* '}';
part_objective_blk: doc;
objective_def: KW_OBJECTIVE '{' part_objective_blk '}';

// A feature is an element that is part of a namespace
feature : feature_attribute_def | feature_attribute_redefines
        | feature_part_specializes
        | feature_part_specializes_subsets
        | feature_item_def
        | feature_item_ref
        | feature_actor_specializes
        ;

// Attributes
feature_attribute_def: KW_ATTRIBUTE ID ':' TYPE ';';
feature_attribute_redefines: KW_ATTRIBUTE (KW_REDEFINES | KW_SYM_REDEFINES | KW_SYM_SUBSETS) ID (':' TYPE)? '=' CONSTANT ';';
feature_part_specializes: KW_PART ID ':' ID MULTIPLICITY? (';' | '{' part_blk* '}');
feature_part_specializes_subsets: KW_PART ID ':' ID MULTIPLICITY? (KW_SUBSETS | KW_SYM_SUBSETS) ID';';
feature_item_def: KW_ITEM ID';';
feature_item_ref: KW_REF? KW_ITEM ID ':' ID';';
feature_actor_specializes: KW_ACTOR ID ':' ID MULTIPLICITY?';';

// SysML2 "comments"
comment : comment_unnamed | comment_named | comment_named_about;
comment_unnamed: COMMENT_LONG;
comment_named: KW_COMMENT ID COMMENT_LONG; 
comment_named_about: KW_COMMENT KW_ABOUT ID COMMENT_LONG; 

// Documentation
doc : doc_unnamed | doc_named;
doc_unnamed: KW_DOC COMMENT_LONG;
doc_named: KW_DOC ID COMMENT_LONG;

// Statements
statement : import_package;
import_package: KW_IMPORT ID (KW_SYM_FQN ID)* (KW_SYM_FQN '*')? ';';

// Keywords
KW_ABOUT: 'about';
KW_ACTOR: 'actor';
KW_ATTRIBUTE: 'attribute';
KW_CASE: 'case';
KW_COMMENT: 'comment';
KW_DEF: 'def';
KW_DOC: 'doc';
KW_IMPORT: 'import';
KW_ITEM: 'item';
KW_OBJECTIVE: 'objective';
KW_PACKAGE: 'package';
KW_PART: 'part';
KW_REDEFINES: 'redefines';
KW_REF: 'ref';
KW_SPECIALIZES: 'specializes';
KW_SUBJECT: 'subject';
KW_SUBSETS: 'subsets';
KW_USE: 'use';
KW_SYM_FQN: '::';
KW_SYM_REDEFINES: ':>>';
KW_SYM_SUBSETS: ':>';

// Tokens
CONSTANT: INTEGER | REAL | BOOL | STRING | NULL;
TYPE: 'Integer' | 'Real' | 'Boolean' | 'String';
ID: '\'' [ a-zA-Z_][ a-zA-Z0-9_]* '\'' | [a-zA-Z_][a-zA-Z0-9_]*;
INTEGER: [0-9]+;
REAL: [0-9]+ '.' [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' (ESC | ~ ["\\])* '"';
MULTIPLICITY: '[' INTEGER '..' INTEGER ']';
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];
NULL: 'null';
WS: [ \t\r\n]+ -> skip;
NOTE: '//' ~[\r\n]* -> skip;
COMMENT_LONG: '/*'.*?'*/';
