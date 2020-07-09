public static boolean IsPalindrome(Node head) {
 Stack<Integer> st = new Stack<Integer>();
 Node temp = head;
 while(temp !=null){
     st.push(temp.val);
      temp = temp.next;
 }
 
 Node temp2 = head;
 boolean isp = true;
  while(temp2 !=null){
      int x = st.pop();
      if(temp2.val !=x){
       isp = false;
       break;
      }
     temp2 = temp2.next;
     
 }
 return isp;
}
