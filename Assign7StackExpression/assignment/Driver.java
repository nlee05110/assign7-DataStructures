package assignment;

public class Driver extends ExpressionEvaluator {
      
	public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        String infix = "3+2*4-2*5";
        System.out.printf("Infix: %s\n", infix);
        String postfix = evaluator.infixToPostfix(infix);
        int evaluatePostFix = evaluator.evaluatePostfix(postfix); 
        System.out.printf("Result: %d", evaluatePostFix);
        
    }
}

