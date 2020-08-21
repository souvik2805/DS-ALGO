https://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
  

import java.util.*;
class Main{
    public static void printClosest(int [] ar1, int [] ar2, int x){
     int a_size1 = ar1.length;
     int a_size2 = ar2.length;
     int i = 0;
     int j = a_size2 - 1;
     int left = 0;
     int right =0;
     int diff = Integer.MAX_VALUE;
     while(i<a_size1 && j>=0){
         if(Math.abs(ar1[i] + ar2[j] -x)  < diff){
             left = ar1[i];
             right = ar2[j];
             diff = Math.abs(ar1[i] + ar2[j] -x);
         }
         if(Math.abs(ar1[i] - ar2[j]) > x){
            j--;
         }
         else{
             i++;
         }
     }
     System.out.println(left+" "+right);
    }
    public static void main(String[] args){
        int ar1[] = {1, 4, 5, 7}; 
        int ar2[] = {10, 20, 30, 40}; 
        int m = ar1.length; 
        int n = ar2.length; 
        int x = 38; 
        printClosest(ar1, ar2, x); 
    }
}
