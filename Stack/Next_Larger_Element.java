//** LOGIC***
// PUSH -> stack is empty or If I find small  element at the top
// POP -> while the top element is less than the current element...

Sample Input
4
1 3 2 4

Sample Output
3 4 4 -1

Sample Input
4
4 3 2 1





import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.empty() || arr[st.peek()]>arr[i]){
                st.push(i);
            }
            else{
               while(!st.empty() && arr[st.peek()]<arr[i]){
                    arr[st.peek()] = arr[i];
                    st.pop();
                }
                st.push(i);
            }
     
        } 
        while(!st.empty()){
            arr[st.peek()] = -1;
            st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }      
    }
}
