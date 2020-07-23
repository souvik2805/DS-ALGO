import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        StringBuilder output = new StringBuilder("");

        for(int i=0;i<str.length(); i++){
         char cc = str.charAt(i);
         if(Character.isLetter(cc)){
             output.append(cc);
             continue;
         }
         if(cc =='('){
             st.push('(');
         }
         //contains is work for only string to Here we conver it to String.
         else if("/*+-^".contains(""+cc)){
             //While stack top has higher precdence than current elemment
             while(!st.empty() && st.peek() !='(' && hashigherP(st.peek(), cc)){
              char operator = st.pop();
              output.append(operator);    
             }
             st.push(cc);
         }
         else if(cc ==')'){
             while(!st.empty() && st.peek() !='('){
                 char operator = st.pop();
                 output.append(operator);
             }
            //  For pop the '('
             st.pop();
         }
           
        }
        while(!st.empty()){
            char operator = st.pop();
            output.append(operator);
        }

        System.out.print(output);
    }
    // Function to Check for higher or equall precedance
    public static boolean hashigherP(char peek, char cc){
        int precedance = getPrecedance(peek);
        int precedance2 = getPrecedance(cc);

        return precedance >= precedance2;
    }

    // Function to get the precedance in int
    // Here default is higher because if any operator come in the TC the it will be treatted as higher precedance by default

    public static int getPrecedance(char a){
      switch(a){
          case '^':
                   return 5;
          case '*':
          case '/':
                   return 4;
          case '+':
          case '_':
                  return 3;
          default:
                return 1000;
      }
    }
}
