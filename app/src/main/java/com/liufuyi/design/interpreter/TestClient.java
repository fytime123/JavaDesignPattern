package com.liufuyi.design.interpreter;

public class TestClient {
	// (a*b)/(a-b+2)
	public static void main(final String[] args) {
		final Context context = new Context();
		context.addValue("a", 7);
		context.addValue("b", 8);
		context.addValue("c", 2);

		final MultiplyNonterminalExpression multiplyValue = new MultiplyNonterminalExpression(new TerminalExpression(
				context.getValue("a")), new TerminalExpression(context.getValue("b")));

		final SubtractNonterminalExpression subtractValue = new SubtractNonterminalExpression(new TerminalExpression(
				context.getValue("a")), new TerminalExpression(context.getValue("b")));

		final AddNonterminalExpression addValue = new AddNonterminalExpression(subtractValue, new TerminalExpression(
				context.getValue("c")));

		final DivisionNonterminalExpression divisionValue = new DivisionNonterminalExpression(multiplyValue, addValue);

		System.out.println(divisionValue.interpreter(context));
	}
}
