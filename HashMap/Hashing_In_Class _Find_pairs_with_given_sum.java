Given an array of integers, and an integer ‘K’, find the count of pairs of elements in the array whose sum is equal to 'K'.
//13 JULY 2020
// suppose Sum = 10; Map [1 ->3][9 ->4] then pair(3*4)
// But if Map[5->4] then self pair 5C2 or n*(n-1)/2    

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String []num = br.readLine().split(" ");
    String [] arr = br.readLine().split(" ");
    int n = Integer.parseInt(num[0]);
    int k = Integer.parseInt(num[1]);
   

        Map<Integer,Integer> List = new HashMap<>();
        int flag = 0;
        for(int i=0; i<n; i++){
           int temp = Integer.parseInt(arr[i]);
            if(List.containsKey(temp)){
                int value = List.get(temp);
                value = value+1;
                List.replace(temp,value);
            }
            else{
              List.put((temp),1);
            } 
        }
        System.out.println(count(List,k));
    
    }

    public static long count(Map<Integer,Integer>map, int k){
        long count = 0;
        for(Entry<Integer, Integer>entry:map.entrySet()){
            int key1 = entry.getKey();
            long value1 = entry.getValue();

            int key2 = k - key1;
            long value2 = map.getOrDefault(key2,0);
            if(key1 != key2){
                count += value1*value2;
            }
            else{
                count += value1*(value1-1)/2;
            }
            map.put(key1,0);
        }
        return count;
    }
}


//--------------------------------------------------------------------------------------------------------------------------------->

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String []num = br.readLine().split(" ");
    String [] arr = br.readLine().split(" ");
    int n = Integer.parseInt(num[0]);
    int k = Integer.parseInt(num[1]);
    int arry[] = new int[n];
   

        Map<Integer,Integer> List = new HashMap<>();
        int flag = 0;
        for(int i=0; i<n; i++){
           int temp = Integer.parseInt(arr[i]);
           arry[i] = temp;
            if(List.containsKey(temp)){
                int value = List.get(temp);
                value = value+1;
                List.replace(temp,value);
            }
            else{
              List.put((temp),1);
            } 
        }
        System.out.println(count(List,arry,k));
    
    }

    public static long count(Map<Integer,Integer> map,int [] arry, int k){
        long count = 0;
        for(int i=0; i<arry.length; i++){
            int key = arry[i];
            int value = map.getOrDefault(k-key,0);
            count +=value;
            if(k-arry[i] == arry[i]){
                count--;
            }
        }
        return count/2;
    }
}





















