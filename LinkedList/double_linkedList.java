class DNode{
  Node next;
  Node prev;
  int val;
  
  DNode(int val){
      this.val = val;
      next = null;
      prev = null;
  }
}

public MyClass{
    public static void main(String[] args){
      DNode d = new Node(1);
    }
    
    public DNode addToBegining( DNode head, int key){
      DNode x = new DNode(key);
      x.next = head;
      x.prev = null;
      head.prev = x;
      head = x;
      return head;
    }
