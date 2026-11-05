package assignment;

public class Driver extends ExpressionEvaluator {
      
	public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        String postfix = evaluator.infixToPostfix("3+2*4");
        evaluator.evaluatePostfix(postfix); 

    }
}

