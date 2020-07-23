Input 1:
5
2 1 + 3 *
Output 1:
9

Input 2:
5
4 13 5 / +
Output 2:
6








import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            String str = sc.next();
            if("*/^-+".contains(str)){
                char c = str.charAt(0);
                int x = st.pop();
                int y = st.pop();
                int res = 0;
               switch(c){
                   case '*': res = x*y;
                            break;
                   case '/': res = y/x;
                            break;
                   case '+' : res = x+y;
                             break;
                    case '-': res = y-x;
                              break;
               }
               st.push(res);
            }
            else{
                int temp = Integer.parseInt(str);
                st.push(temp);
            }
           
        }
        System.out.println(st.pop());
    }
}
