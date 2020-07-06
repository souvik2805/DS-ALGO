public deleteKthFromEnd( Node head, int K){
    int lenght = 0;
    Node temp = head;
    while(temp !=null){
      lenght++;
      temp = temp.next;
    }
    if(K>length){
      return head;
    }
    else if(length == K){
      return head.next;
    }
    else{
      Node prev = null;
      Node curr = head;
      for(int i=0; i < lenght-K; i++){
          prev = curr;
          curr = curr.next;
      }
      prev.next = curr.next;
      return head;
   }
}
      
      
    
