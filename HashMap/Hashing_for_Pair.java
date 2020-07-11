import java.util.*;
import java.util.Map.Entry;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
         Map<Integer,Integer> List = new HashMap<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int flag = 0;
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            List.put(i,temp);
        }
         for(int i=0; i<n; i++){
            int curr = List.get(i);
            int remain = k - curr;
            List.replace(i,0); 
            if(remain>0 && List.containsValue(remain)){
              flag = 1;
              break;
            }
            List.replace(i,curr);
        }
        System.out.println(flag);
    }
    }
}

// -----------------------------Optimize Solution_________________________>

import java.util.*;
import java.util.Map.Entry;
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer,Integer> List = new HashMap<>();
        int flag = 0;
        for(int i=0; i<n; i++){
           int temp = sc.nextInt();
            if(List.containsKey(temp)){
                flag = 1;
                sc.nextLine();
                break;
            }
            else{
                List.put((k-temp),1);
            }
           
        }
         
     
        System.out.println(flag);
     
        
    }
    }
}




















