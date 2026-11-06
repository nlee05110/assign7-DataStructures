package assignment;

public class Driver extends ExpressionEvaluator {
      
	public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        String infix = "(2 + 3) * 2 - (2 * 2)";
        System.out.printf("Infix: %s\n", infix);
        String postfix = evaluator.infixToPostfix(infix);
        int evaluatePostFix = evaluator.evaluatePostfix(postfix); 
        System.out.printf("Result: %d", evaluatePostFix);
        
    }
}

