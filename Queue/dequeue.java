import java.util.*;
class Main{
    public static void print(Deque<Integer> cd){
        Iterator itr =cd.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
    public static void main(String[] args){
        Deque<Integer> cd = new LinkedList<>();
        // Add element as orderwise----->
        cd.add(1);
        cd.add(2);
        cd.add(3);
        cd.offer(4);
        cd.offer(1);
        // Add 
        cd.addLast(6);
        cd.offerLast(5);

        cd.addFirst(23);
        cd.offerFirst(24);

        //Remove the first element
        cd.remove();
        cd.removeFirst();
        cd.removeLast();
        cd.pollLast();
         
        //Remove the first occurance of 1
        cd.remove(1);
        print(cd);
    }
}
