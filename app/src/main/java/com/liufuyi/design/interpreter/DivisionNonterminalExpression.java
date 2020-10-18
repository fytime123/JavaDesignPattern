package com.liufuyi.design.interpreter;

public class DivisionNonterminalExpression extends AbstractExpression {
	private final AbstractExpression left;
	private final AbstractExpression right;

	public DivisionNonterminalExpression(final AbstractExpression left, final AbstractExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpreter(final Context context) {
		final int value = this.right.interpreter(context);
		if (value != 0) {
			return this.left.interpreter(context) / value;
		}
		return -1111;
	}

}