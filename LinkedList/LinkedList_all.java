public class Node{
    int data;
    Node next;
    Node(int d){
      this.data = d;
      this.next = null
    }
}

public class MyClass{
  
  public Node deleteFromBegining( Node head){
    return head.next;
  }
  
  public Node deleteFromEnd( Node head){
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = null;
  }
      
