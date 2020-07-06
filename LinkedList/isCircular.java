public boolen isCircular(Node head){
      Node temp = head.next;
      if(head == null)
        return null;
	  
	  while(temp != head){
	  	temp = temp.next;
	  }
	  // This code create infinite loop for not Circular Linked List....
	  
	  while(temp != head && temp != null){
	    temp = temp.next;
	  }
	  
	  if(temp == head){
	    return true;
	  }
	  else{
	    return false;
	  }
}
