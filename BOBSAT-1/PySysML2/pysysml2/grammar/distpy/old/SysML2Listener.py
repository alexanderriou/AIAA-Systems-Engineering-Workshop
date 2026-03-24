# Generated from SysML2.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SysML2Parser import SysML2Parser
else:
    from SysML2Parser import SysML2Parser

# This class defines a complete listener for a parse tree produced by SysML2Parser.
class SysML2Listener(ParseTreeListener):

    # Enter a parse tree produced by SysML2Parser#model.
    def enterModel(self, ctx:SysML2Parser.ModelContext):
        pass

    # Exit a parse tree produced by SysML2Parser#model.
    def exitModel(self, ctx:SysML2Parser.ModelContext):
        pass


    # Enter a parse tree produced by SysML2Parser#element.
    def enterElement(self, ctx:SysML2Parser.ElementContext):
        pass

    # Exit a parse tree produced by SysML2Parser#element.
    def exitElement(self, ctx:SysML2Parser.ElementContext):
        pass


    # Enter a parse tree produced by SysML2Parser#namespace.
    def enterNamespace(self, ctx:SysML2Parser.NamespaceContext):
        pass

    # Exit a parse tree produced by SysML2Parser#namespace.
    def exitNamespace(self, ctx:SysML2Parser.NamespaceContext):
        pass


    # Enter a parse tree produced by SysML2Parser#sysml2_package.
    def enterSysml2_package(self, ctx:SysML2Parser.Sysml2_packageContext):
        pass

    # Exit a parse tree produced by SysML2Parser#sysml2_package.
    def exitSysml2_package(self, ctx:SysML2Parser.Sysml2_packageContext):
        pass


    # Enter a parse tree produced by SysML2Parser#part_blk.
    def enterPart_blk(self, ctx:SysML2Parser.Part_blkContext):
        pass

    # Exit a parse tree produced by SysML2Parser#part_blk.
    def exitPart_blk(self, ctx:SysML2Parser.Part_blkContext):
        pass


    # Enter a parse tree produced by SysML2Parser#part.
    def enterPart(self, ctx:SysML2Parser.PartContext):
        pass

    # Exit a parse tree produced by SysML2Parser#part.
    def exitPart(self, ctx:SysML2Parser.PartContext):
        pass


    # Enter a parse tree produced by SysML2Parser#part_def.
    def enterPart_def(self, ctx:SysML2Parser.Part_defContext):
        pass

    # Exit a parse tree produced by SysML2Parser#part_def.
    def exitPart_def(self, ctx:SysML2Parser.Part_defContext):
        pass


    # Enter a parse tree produced by SysML2Parser#part_def_specializes.
    def enterPart_def_specializes(self, ctx:SysML2Parser.Part_def_specializesContext):
        pass

    # Exit a parse tree produced by SysML2Parser#part_def_specializes.
    def exitPart_def_specializes(self, ctx:SysML2Parser.Part_def_specializesContext):
        pass


    # Enter a parse tree produced by SysML2Parser#use_case_blk.
    def enterUse_case_blk(self, ctx:SysML2Parser.Use_case_blkContext):
        pass

    # Exit a parse tree produced by SysML2Parser#use_case_blk.
    def exitUse_case_blk(self, ctx:SysML2Parser.Use_case_blkContext):
        pass


    # Enter a parse tree produced by SysML2Parser#use_case_def.
    def enterUse_case_def(self, ctx:SysML2Parser.Use_case_defContext):
        pass

    # Exit a parse tree produced by SysML2Parser#use_case_def.
    def exitUse_case_def(self, ctx:SysML2Parser.Use_case_defContext):
        pass


    # Enter a parse tree produced by SysML2Parser#part_objective_blk.
    def enterPart_objective_blk(self, ctx:SysML2Parser.Part_objective_blkContext):
        pass

    # Exit a parse tree produced by SysML2Parser#part_objective_blk.
    def exitPart_objective_blk(self, ctx:SysML2Parser.Part_objective_blkContext):
        pass


    # Enter a parse tree produced by SysML2Parser#objective_def.
    def enterObjective_def(self, ctx:SysML2Parser.Objective_defContext):
        pass

    # Exit a parse tree produced by SysML2Parser#objective_def.
    def exitObjective_def(self, ctx:SysML2Parser.Objective_defContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature.
    def enterFeature(self, ctx:SysML2Parser.FeatureContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature.
    def exitFeature(self, ctx:SysML2Parser.FeatureContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_attribute_def.
    def enterFeature_attribute_def(self, ctx:SysML2Parser.Feature_attribute_defContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_attribute_def.
    def exitFeature_attribute_def(self, ctx:SysML2Parser.Feature_attribute_defContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_attribute_redefines.
    def enterFeature_attribute_redefines(self, ctx:SysML2Parser.Feature_attribute_redefinesContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_attribute_redefines.
    def exitFeature_attribute_redefines(self, ctx:SysML2Parser.Feature_attribute_redefinesContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_part_specializes.
    def enterFeature_part_specializes(self, ctx:SysML2Parser.Feature_part_specializesContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_part_specializes.
    def exitFeature_part_specializes(self, ctx:SysML2Parser.Feature_part_specializesContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_part_specializes_subsets.
    def enterFeature_part_specializes_subsets(self, ctx:SysML2Parser.Feature_part_specializes_subsetsContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_part_specializes_subsets.
    def exitFeature_part_specializes_subsets(self, ctx:SysML2Parser.Feature_part_specializes_subsetsContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_item_def.
    def enterFeature_item_def(self, ctx:SysML2Parser.Feature_item_defContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_item_def.
    def exitFeature_item_def(self, ctx:SysML2Parser.Feature_item_defContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_item_ref.
    def enterFeature_item_ref(self, ctx:SysML2Parser.Feature_item_refContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_item_ref.
    def exitFeature_item_ref(self, ctx:SysML2Parser.Feature_item_refContext):
        pass


    # Enter a parse tree produced by SysML2Parser#feature_actor_specializes.
    def enterFeature_actor_specializes(self, ctx:SysML2Parser.Feature_actor_specializesContext):
        pass

    # Exit a parse tree produced by SysML2Parser#feature_actor_specializes.
    def exitFeature_actor_specializes(self, ctx:SysML2Parser.Feature_actor_specializesContext):
        pass


    # Enter a parse tree produced by SysML2Parser#comment.
    def enterComment(self, ctx:SysML2Parser.CommentContext):
        pass

    # Exit a parse tree produced by SysML2Parser#comment.
    def exitComment(self, ctx:SysML2Parser.CommentContext):
        pass


    # Enter a parse tree produced by SysML2Parser#comment_unnamed.
    def enterComment_unnamed(self, ctx:SysML2Parser.Comment_unnamedContext):
        pass

    # Exit a parse tree produced by SysML2Parser#comment_unnamed.
    def exitComment_unnamed(self, ctx:SysML2Parser.Comment_unnamedContext):
        pass


    # Enter a parse tree produced by SysML2Parser#comment_named.
    def enterComment_named(self, ctx:SysML2Parser.Comment_namedContext):
        pass

    # Exit a parse tree produced by SysML2Parser#comment_named.
    def exitComment_named(self, ctx:SysML2Parser.Comment_namedContext):
        pass


    # Enter a parse tree produced by SysML2Parser#comment_named_about.
    def enterComment_named_about(self, ctx:SysML2Parser.Comment_named_aboutContext):
        pass

    # Exit a parse tree produced by SysML2Parser#comment_named_about.
    def exitComment_named_about(self, ctx:SysML2Parser.Comment_named_aboutContext):
        pass


    # Enter a parse tree produced by SysML2Parser#doc.
    def enterDoc(self, ctx:SysML2Parser.DocContext):
        pass

    # Exit a parse tree produced by SysML2Parser#doc.
    def exitDoc(self, ctx:SysML2Parser.DocContext):
        pass


    # Enter a parse tree produced by SysML2Parser#doc_unnamed.
    def enterDoc_unnamed(self, ctx:SysML2Parser.Doc_unnamedContext):
        pass

    # Exit a parse tree produced by SysML2Parser#doc_unnamed.
    def exitDoc_unnamed(self, ctx:SysML2Parser.Doc_unnamedContext):
        pass


    # Enter a parse tree produced by SysML2Parser#doc_named.
    def enterDoc_named(self, ctx:SysML2Parser.Doc_namedContext):
        pass

    # Exit a parse tree produced by SysML2Parser#doc_named.
    def exitDoc_named(self, ctx:SysML2Parser.Doc_namedContext):
        pass


    # Enter a parse tree produced by SysML2Parser#statement.
    def enterStatement(self, ctx:SysML2Parser.StatementContext):
        pass

    # Exit a parse tree produced by SysML2Parser#statement.
    def exitStatement(self, ctx:SysML2Parser.StatementContext):
        pass


    # Enter a parse tree produced by SysML2Parser#import_package.
    def enterImport_package(self, ctx:SysML2Parser.Import_packageContext):
        pass

    # Exit a parse tree produced by SysML2Parser#import_package.
    def exitImport_package(self, ctx:SysML2Parser.Import_packageContext):
        pass



del SysML2Parser