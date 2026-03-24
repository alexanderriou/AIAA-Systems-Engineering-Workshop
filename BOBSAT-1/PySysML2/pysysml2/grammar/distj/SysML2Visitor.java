// Generated from SysML2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SysML2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SysML2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(SysML2Parser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(SysML2Parser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(SysML2Parser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#sysml2_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysml2_package(SysML2Parser.Sysml2_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#part_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_blk(SysML2Parser.Part_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(SysML2Parser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#part_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_def(SysML2Parser.Part_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#part_def_specializes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_def_specializes(SysML2Parser.Part_def_specializesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(SysML2Parser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#port_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_def(SysML2Parser.Port_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#port_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_blk(SysML2Parser.Port_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#use_case_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_case_blk(SysML2Parser.Use_case_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#use_case_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_case_def(SysML2Parser.Use_case_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#part_objective_blk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_objective_blk(SysML2Parser.Part_objective_blkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#objective_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjective_def(SysML2Parser.Objective_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(SysML2Parser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_attribute_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_attribute_def(SysML2Parser.Feature_attribute_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_attribute_redefines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_attribute_redefines(SysML2Parser.Feature_attribute_redefinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_part_specializes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_part_specializes(SysML2Parser.Feature_part_specializesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_part_specializes_subsets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_part_specializes_subsets(SysML2Parser.Feature_part_specializes_subsetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_item_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_item_def(SysML2Parser.Feature_item_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_item_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_item_ref(SysML2Parser.Feature_item_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#feature_actor_specializes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_actor_specializes(SysML2Parser.Feature_actor_specializesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SysML2Parser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#comment_unnamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_unnamed(SysML2Parser.Comment_unnamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#comment_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_named(SysML2Parser.Comment_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#comment_named_about}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_named_about(SysML2Parser.Comment_named_aboutContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(SysML2Parser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#doc_unnamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc_unnamed(SysML2Parser.Doc_unnamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#doc_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc_named(SysML2Parser.Doc_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SysML2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysML2Parser#import_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_package(SysML2Parser.Import_packageContext ctx);
}