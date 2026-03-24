// Generated from SysML2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SysML2Parser}.
 */
public interface SysML2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(SysML2Parser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(SysML2Parser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(SysML2Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(SysML2Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(SysML2Parser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(SysML2Parser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#sysml2_package}.
	 * @param ctx the parse tree
	 */
	void enterSysml2_package(SysML2Parser.Sysml2_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#sysml2_package}.
	 * @param ctx the parse tree
	 */
	void exitSysml2_package(SysML2Parser.Sysml2_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#part_blk}.
	 * @param ctx the parse tree
	 */
	void enterPart_blk(SysML2Parser.Part_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#part_blk}.
	 * @param ctx the parse tree
	 */
	void exitPart_blk(SysML2Parser.Part_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(SysML2Parser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(SysML2Parser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#part_def}.
	 * @param ctx the parse tree
	 */
	void enterPart_def(SysML2Parser.Part_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#part_def}.
	 * @param ctx the parse tree
	 */
	void exitPart_def(SysML2Parser.Part_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#part_def_specializes}.
	 * @param ctx the parse tree
	 */
	void enterPart_def_specializes(SysML2Parser.Part_def_specializesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#part_def_specializes}.
	 * @param ctx the parse tree
	 */
	void exitPart_def_specializes(SysML2Parser.Part_def_specializesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(SysML2Parser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(SysML2Parser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#port_def}.
	 * @param ctx the parse tree
	 */
	void enterPort_def(SysML2Parser.Port_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#port_def}.
	 * @param ctx the parse tree
	 */
	void exitPort_def(SysML2Parser.Port_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#port_blk}.
	 * @param ctx the parse tree
	 */
	void enterPort_blk(SysML2Parser.Port_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#port_blk}.
	 * @param ctx the parse tree
	 */
	void exitPort_blk(SysML2Parser.Port_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#use_case_blk}.
	 * @param ctx the parse tree
	 */
	void enterUse_case_blk(SysML2Parser.Use_case_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#use_case_blk}.
	 * @param ctx the parse tree
	 */
	void exitUse_case_blk(SysML2Parser.Use_case_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#use_case_def}.
	 * @param ctx the parse tree
	 */
	void enterUse_case_def(SysML2Parser.Use_case_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#use_case_def}.
	 * @param ctx the parse tree
	 */
	void exitUse_case_def(SysML2Parser.Use_case_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#part_objective_blk}.
	 * @param ctx the parse tree
	 */
	void enterPart_objective_blk(SysML2Parser.Part_objective_blkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#part_objective_blk}.
	 * @param ctx the parse tree
	 */
	void exitPart_objective_blk(SysML2Parser.Part_objective_blkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#objective_def}.
	 * @param ctx the parse tree
	 */
	void enterObjective_def(SysML2Parser.Objective_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#objective_def}.
	 * @param ctx the parse tree
	 */
	void exitObjective_def(SysML2Parser.Objective_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(SysML2Parser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(SysML2Parser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_attribute_def}.
	 * @param ctx the parse tree
	 */
	void enterFeature_attribute_def(SysML2Parser.Feature_attribute_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_attribute_def}.
	 * @param ctx the parse tree
	 */
	void exitFeature_attribute_def(SysML2Parser.Feature_attribute_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_attribute_redefines}.
	 * @param ctx the parse tree
	 */
	void enterFeature_attribute_redefines(SysML2Parser.Feature_attribute_redefinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_attribute_redefines}.
	 * @param ctx the parse tree
	 */
	void exitFeature_attribute_redefines(SysML2Parser.Feature_attribute_redefinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_part_specializes}.
	 * @param ctx the parse tree
	 */
	void enterFeature_part_specializes(SysML2Parser.Feature_part_specializesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_part_specializes}.
	 * @param ctx the parse tree
	 */
	void exitFeature_part_specializes(SysML2Parser.Feature_part_specializesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_part_specializes_subsets}.
	 * @param ctx the parse tree
	 */
	void enterFeature_part_specializes_subsets(SysML2Parser.Feature_part_specializes_subsetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_part_specializes_subsets}.
	 * @param ctx the parse tree
	 */
	void exitFeature_part_specializes_subsets(SysML2Parser.Feature_part_specializes_subsetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_item_def}.
	 * @param ctx the parse tree
	 */
	void enterFeature_item_def(SysML2Parser.Feature_item_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_item_def}.
	 * @param ctx the parse tree
	 */
	void exitFeature_item_def(SysML2Parser.Feature_item_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_item_ref}.
	 * @param ctx the parse tree
	 */
	void enterFeature_item_ref(SysML2Parser.Feature_item_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_item_ref}.
	 * @param ctx the parse tree
	 */
	void exitFeature_item_ref(SysML2Parser.Feature_item_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#feature_actor_specializes}.
	 * @param ctx the parse tree
	 */
	void enterFeature_actor_specializes(SysML2Parser.Feature_actor_specializesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#feature_actor_specializes}.
	 * @param ctx the parse tree
	 */
	void exitFeature_actor_specializes(SysML2Parser.Feature_actor_specializesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SysML2Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SysML2Parser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#comment_unnamed}.
	 * @param ctx the parse tree
	 */
	void enterComment_unnamed(SysML2Parser.Comment_unnamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#comment_unnamed}.
	 * @param ctx the parse tree
	 */
	void exitComment_unnamed(SysML2Parser.Comment_unnamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#comment_named}.
	 * @param ctx the parse tree
	 */
	void enterComment_named(SysML2Parser.Comment_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#comment_named}.
	 * @param ctx the parse tree
	 */
	void exitComment_named(SysML2Parser.Comment_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#comment_named_about}.
	 * @param ctx the parse tree
	 */
	void enterComment_named_about(SysML2Parser.Comment_named_aboutContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#comment_named_about}.
	 * @param ctx the parse tree
	 */
	void exitComment_named_about(SysML2Parser.Comment_named_aboutContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(SysML2Parser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(SysML2Parser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#doc_unnamed}.
	 * @param ctx the parse tree
	 */
	void enterDoc_unnamed(SysML2Parser.Doc_unnamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#doc_unnamed}.
	 * @param ctx the parse tree
	 */
	void exitDoc_unnamed(SysML2Parser.Doc_unnamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#doc_named}.
	 * @param ctx the parse tree
	 */
	void enterDoc_named(SysML2Parser.Doc_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#doc_named}.
	 * @param ctx the parse tree
	 */
	void exitDoc_named(SysML2Parser.Doc_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SysML2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SysML2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysML2Parser#import_package}.
	 * @param ctx the parse tree
	 */
	void enterImport_package(SysML2Parser.Import_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysML2Parser#import_package}.
	 * @param ctx the parse tree
	 */
	void exitImport_package(SysML2Parser.Import_packageContext ctx);
}