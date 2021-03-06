package com.kennycason.soroban.parser.expression;

import com.kennycason.soroban.lexer.token.Token;

/**
 * Created by kenny on 3/3/16.
 *
 * x!
 *
 */
public class PostfixUnaryFunctionExpression implements Expression {

    private final Token function;
    private final Expression expression;

    public PostfixUnaryFunctionExpression(final Expression expression,
                                          final Token function) {
        this.function = function;
        this.expression = expression;
    }

    public Token getFunction() {
        return function;
    }

    public Expression getExpression() {
        return expression;
    }

}
