package assignment;

public class ExpressionEvaluator implements ExpressionEvaluatorInterface {
   
    @Override
    public String infixToPostfix(String infix){
        Stack<Character> operators = new Stack<>();
        String str = "";
        for(int index = 0; index < infix.length(); index++){
            if(infix.charAt(index) >= '0' && infix.charAt(index) <= '9'){
               str = str + infix.charAt(index);
            
            
            } else {
                switch(infix.charAt(index)){
                    case '+': operators.push(infix.charAt(index));
                         break;
                    case '-': operators.push(infix.charAt(index));
                         break;
                    case '*': operators.push(infix.charAt(index));
                         break;
                    case '/': operators.push(infix.charAt(index));
                         break;
               }
                   
           }

        
    
        }
        while(operators.peek() != null) {
            str = str + operators.pop();
        }
        System.out.printf("Postfix: %s\n", str) ;
        operators.push('+');
        return str;
    }

    @Override
    public int evaluatePostfix(String postfix){
        return -1;
    }



}
