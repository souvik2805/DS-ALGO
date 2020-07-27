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
