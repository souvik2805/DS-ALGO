// Metthod 1


import java.util.*;
class Main{
    public static void print(Queue<Integer> queue){
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
    }
    // Map<Integer, Integer> map = new HashMap<>();
    // Iterator itr = map.entrySet().iterator();
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        // Alternative of add in Queue is offer
        queue.offer(20);
        // Alternative of remove is poll
        queue.poll();
        // queue.remove();
        print(queue);
        // See first element of Queue
        System.out.println(queue.peek());
    }
}


// Method - 2
//PriorityQueue implement
// PriorityQueue => Store element by Priority
// --------------> Least element is Highest Priority
// So after every add and remove operation on the queue the Least Element of the Queue get the hight priory so it come first.
// So it is like min head ; Inseratio O(logn) and Removeval O(logn)

import java.util.*;
class Main{
    public static void print(Queue<Integer> queue){
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
    }
    // Map<Integer, Integer> map = new HashMap<>();
    // Iterator itr = map.entrySet().iterator();
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(11);
        queue.add(3);
        queue.add(4);
          queue.add(10);
        queue.add(12);
         print(queue);
        // Alternative of add in Queue is offer
        queue.offer(20);
        // Alternative of remove is poll
        queue.poll();
        // queue.remove();
        print(queue);
        // See first element of Queue
        System.out.println(queue.peek());
    }
}




// Here we use custom Comparator to Prioriitise the highest Element




import java.util.*;
class CustomComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b-a;
    }
}
class Main{
    public static void print(Queue<Integer> queue){
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
    }
    // Map<Integer, Integer> map = new HashMap<>();
    // Iterator itr = map.entrySet().iterator();
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<>(new CustomComparator());
        queue.add(1);
        queue.add(11);
        queue.add(3);
        queue.add(4);
          queue.add(10);
        queue.add(12);
         print(queue);
        // Alternative of add in Queue is offer
        queue.offer(20);
        // Alternative of remove is poll
        queue.poll();
        // queue.remove();
        print(queue);
        // See first element of Queue
        System.out.println(queue.peek());
    }
}

