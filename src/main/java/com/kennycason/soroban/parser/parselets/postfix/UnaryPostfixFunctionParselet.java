package com.kennycason.soroban.parser.parselets.postfix;

import com.kennycason.soroban.lexer.token.Token;
import com.kennycason.soroban.parser.PrattParser;
import com.kennycason.soroban.parser.expression.Expression;
import com.kennycason.soroban.parser.expression.PostfixUnaryFunctionExpression;
import com.kennycason.soroban.parser.parselets.infix.InfixParselet;

/**
 * Created by kenny on 3/3/16.
 */
public class UnaryPostfixFunctionParselet implements InfixParselet {

    private final int precedence;

    public UnaryPostfixFunctionParselet(final int precedence) {
        this.precedence = precedence;
    }

    @Override
    public Expression parse(final PrattParser parser, final Expression left, final Token token) {
        return new PostfixUnaryFunctionExpression(left, token);
    }

    @Override
    public int getPrecedence() {
        return precedence;
    }
}
