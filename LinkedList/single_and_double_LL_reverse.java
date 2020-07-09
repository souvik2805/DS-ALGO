public Node reverse( Node head){
    Node prev = null;
    Node current = head;
    Node next = null;
    
    while( current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
   }
    
    return prev;
   
}


//  Double LL


public static Node Reverse(Node head) {
 Node prev = null;
 Node curr = head;
 Node next = head;
 while(curr != null){
   next = curr.next;
   curr.next = prev;
   curr.prev = next;

   prev = curr;
   curr = next;

 }
 return prev;
}
