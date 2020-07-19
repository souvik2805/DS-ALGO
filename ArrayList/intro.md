## >> <<

10 => 1010
10>>1  ==> 101 == (10/2) = 5
Meaning 10 divided by 2^1 

10>>2 ==> 10 ==(10/4) = 2
Meaning 10 divided by 2^2


### Internal Implement of ArrayList

myList.add(1);
Java create a default array of size 20
Then on every 20+1 it increase the SIZE of the ARRAY by size = size + size>>1
Size = Size + Size/0.5;  (Increase by 50%)
20 ->30 ->45
So the Time Complexity on add -. in average runs in O(n) time
