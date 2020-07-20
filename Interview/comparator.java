import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        if(p1.first == p2.first) {
            return p1.second - p2.second;
        }

        return p1.first - p2.first;
    }
}

class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(2);

        Set<Pair> set = new TreeSet<>();

        set.add(new Pair(1,2));
        set.add(new Pair(3,2));
        set.add(new Pair(2,2));
        set.add(new Pair(4,2));
        set.add(new Pair(1,3));

        for(Integer i : set1) {
            System.out.println(i);
        }

        for(Pair i : set) {
            System.out.println(i.first + " " + i.second);
        }


    }
}
