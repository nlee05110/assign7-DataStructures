package assignment;

public class ExpressionEvaluator implements ExpressionEvaluatorInterface {
   
    @Override
    public String infixToPostfix(String infix){
        Stack<Character> operators = new Stack<>();
        String postfix = "";
        for(int index = 0; index < infix.length(); index++){
            if(infix.charAt(index) >= '0' && infix.charAt(index) <= '9'){
               postfix = postfix + infix.charAt(index);
            
            
            }else if(operators.isEmpty()==false&& 
                    operators.peek() < infix.charAt(index)){
                
                while(operators.peek() != null) {
                    postfix = postfix + operators.pop();
                }
                operators.push(infix.charAt(index));

            
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
            postfix = postfix + operators.pop();
        }
        System.out.printf("Postfix: %s\n", postfix) ;
        operators.push('+');
        return postfix;
    }

    @Override
    public int evaluatePostfix(String postfix){
        Stack<Integer> stack = new Stack<>();
        int result = 0; 
        
        for(int index = 0; index < postfix.length(); index++){
            if(postfix.charAt(index) >= '0' && postfix.charAt(index) <= '9'){
                char ch = postfix.charAt(index);
                stack.push(Integer.parseInt(String.valueOf(ch))); 
            } else {
                int first = Integer.parseInt(String.valueOf(stack.pop()));
                int second = Integer.parseInt(String.valueOf(stack.pop()));
                switch(postfix.charAt(index)){
                    case '+': stack.push(first + second);
                        break;
                    case '-': stack.push(second-first);
                        break; 
                    case '*': stack.push(first*second);
                        break;
                    case '/': stack.push(second/first);
                        break;
               }
                   
            }
        }

        result = Integer.parseInt(String.valueOf(stack.pop()));
        
        return result;
    }



}
