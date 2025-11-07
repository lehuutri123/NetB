// Generated from HCLParser.g4 by ANTLR 4.13.1
package org.netbeans.modules.languages.hcl.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HCLParser}.
 */
public interface HCLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HCLParser#configFile}.
	 * @param ctx the parse tree
	 */
	void enterConfigFile(HCLParser.ConfigFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#configFile}.
	 * @param ctx the parse tree
	 */
	void exitConfigFile(HCLParser.ConfigFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HCLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HCLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HCLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HCLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HCLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HCLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HCLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HCLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#exprTerm}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(HCLParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#exprTerm}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(HCLParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(HCLParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(HCLParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#collectionValue}.
	 * @param ctx the parse tree
	 */
	void enterCollectionValue(HCLParser.CollectionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#collectionValue}.
	 * @param ctx the parse tree
	 */
	void exitCollectionValue(HCLParser.CollectionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(HCLParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(HCLParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(HCLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(HCLParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#objectElem}.
	 * @param ctx the parse tree
	 */
	void enterObjectElem(HCLParser.ObjectElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#objectElem}.
	 * @param ctx the parse tree
	 */
	void exitObjectElem(HCLParser.ObjectElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#templateExpr}.
	 * @param ctx the parse tree
	 */
	void enterTemplateExpr(HCLParser.TemplateExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#templateExpr}.
	 * @param ctx the parse tree
	 */
	void exitTemplateExpr(HCLParser.TemplateExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(HCLParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(HCLParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#quotedTemplate}.
	 * @param ctx the parse tree
	 */
	void enterQuotedTemplate(HCLParser.QuotedTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#quotedTemplate}.
	 * @param ctx the parse tree
	 */
	void exitQuotedTemplate(HCLParser.QuotedTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(HCLParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(HCLParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#interpolationContent}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationContent(HCLParser.InterpolationContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#interpolationContent}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationContent(HCLParser.InterpolationContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(HCLParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(HCLParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContent(HCLParser.TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContent(HCLParser.TemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(HCLParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(HCLParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#heredocContent}.
	 * @param ctx the parse tree
	 */
	void enterHeredocContent(HCLParser.HeredocContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#heredocContent}.
	 * @param ctx the parse tree
	 */
	void exitHeredocContent(HCLParser.HeredocContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#heredocTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHeredocTemplate(HCLParser.HeredocTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#heredocTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHeredocTemplate(HCLParser.HeredocTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#heredoc}.
	 * @param ctx the parse tree
	 */
	void enterHeredoc(HCLParser.HeredocContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#heredoc}.
	 * @param ctx the parse tree
	 */
	void exitHeredoc(HCLParser.HeredocContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#scopedId}.
	 * @param ctx the parse tree
	 */
	void enterScopedId(HCLParser.ScopedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#scopedId}.
	 * @param ctx the parse tree
	 */
	void exitScopedId(HCLParser.ScopedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#variableExpr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(HCLParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#variableExpr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(HCLParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HCLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HCLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HCLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HCLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(HCLParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(HCLParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#forTupleExpr}.
	 * @param ctx the parse tree
	 */
	void enterForTupleExpr(HCLParser.ForTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#forTupleExpr}.
	 * @param ctx the parse tree
	 */
	void exitForTupleExpr(HCLParser.ForTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#forObjectExpr}.
	 * @param ctx the parse tree
	 */
	void enterForObjectExpr(HCLParser.ForObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#forObjectExpr}.
	 * @param ctx the parse tree
	 */
	void exitForObjectExpr(HCLParser.ForObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#forIntro}.
	 * @param ctx the parse tree
	 */
	void enterForIntro(HCLParser.ForIntroContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#forIntro}.
	 * @param ctx the parse tree
	 */
	void exitForIntro(HCLParser.ForIntroContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#forCond}.
	 * @param ctx the parse tree
	 */
	void enterForCond(HCLParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#forCond}.
	 * @param ctx the parse tree
	 */
	void exitForCond(HCLParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(HCLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(HCLParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#getAttr}.
	 * @param ctx the parse tree
	 */
	void enterGetAttr(HCLParser.GetAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#getAttr}.
	 * @param ctx the parse tree
	 */
	void exitGetAttr(HCLParser.GetAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#splat}.
	 * @param ctx the parse tree
	 */
	void enterSplat(HCLParser.SplatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#splat}.
	 * @param ctx the parse tree
	 */
	void exitSplat(HCLParser.SplatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#attrSplat}.
	 * @param ctx the parse tree
	 */
	void enterAttrSplat(HCLParser.AttrSplatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#attrSplat}.
	 * @param ctx the parse tree
	 */
	void exitAttrSplat(HCLParser.AttrSplatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HCLParser#fullSplat}.
	 * @param ctx the parse tree
	 */
	void enterFullSplat(HCLParser.FullSplatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HCLParser#fullSplat}.
	 * @param ctx the parse tree
	 */
	void exitFullSplat(HCLParser.FullSplatContext ctx);
}