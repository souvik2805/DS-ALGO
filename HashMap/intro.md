## What is Hashing??? 
It is the process of converting an object into an integer value. The integer value helps in indexing and faster searches.

## What is HashMap
HashMap is a part of the Java collection framework. It uses a technique called Hashing. It implements the map interface. It stores the data in the pair of Key and Value. HashMap contains an array of the nodes, and the node is represented as a class. It uses an array and LinkedList data structure internally for storing Key and Value. There are four fields in HashMap.

**Example** <br>
In the following example, we want to insert three (Key, Value) pair in the HashMap.
  
HashMap<String, Integer> map = new HashMap<>();  
map.put("Aman", 19);  
map.put("Sunny", 29);  
map.put("Ritesh", 39);

When we call the put() method, then it calculates the hash code of the Key "Aman." Suppose the hash code of "Aman" is 2657860. To store the Key in memory, we have to calculate the index.
We can pass value to the HashMap constructor(size, 
