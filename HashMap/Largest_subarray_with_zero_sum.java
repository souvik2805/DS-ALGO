/*
LOGIC:--
1. Take sum array.
2. If same value is repeat then the Intermediiate array are sum=0
sum array=[15,13,15,7,8,15]
Here array1 = form index 1 to 2
Here array1 = form index 3 to 5
---> 1 to 5(size =5)

EDGE case- When Zero come so put zero key;
HashMap <sum,index>

*/

import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] s1 = br.readLine().split(" ");
        Map<Integer,Integer> List = new HashMap<>();
        List.put(0,-1);
        int index = -1;
        int sum =0;
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(s1[i]);
            sum +=temp;

            if(List.containsKey(sum)){
                int temp2 = i -List.get(sum);
                if(temp2>index){
                    index = temp2;
                }
            }
            else{
            List.put(sum,i);
            }
           
            
        }
        System.out.println(index);
    }
}
