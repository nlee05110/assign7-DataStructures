package assignment;

public class Driver extends ExpressionEvaluator {
      
	public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        evaluator.infixToPostfix("3-2");
    }
}

