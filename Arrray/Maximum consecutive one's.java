import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int start =0;
        int zero=0;
        int count =0;
        for(int end=0; end<arr.length; end++){
            if(arr[end] == 0){
                zero++;
            }
          if(zero>k){
                if(arr[start] ==0){
                    zero--;
                }
                start++;
            }
            count = Math.max(count, (end-start +1));
        }
       
        System.out.println(count);

    }
}
