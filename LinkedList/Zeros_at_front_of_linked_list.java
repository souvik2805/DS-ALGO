Given a linked list, the task is to move all 0’s to the front of the linked list. The order of all another element except 0 should be same after rearrangement.



static public Node moveZeroes(Node head){
      if(head == null)
        return null;
        
      Node temp = head.next;
      Node prev = head;
      while(temp != null){
        if(temp.data == 0){
          Node x    = temp;
          temp      = temp.next;
          prev.next = temp;
          x.next    = head;
          head      = x;
        }
        else{
         prev = temp;
         temp = temp.next;
        }
     }
     
     return head;
}
