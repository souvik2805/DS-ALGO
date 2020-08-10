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

### Calculating Index

Index minimizes the size of the array. The Formula for calculating the index is:
Index = hashcode(Key) % (n-1)  

Where n is the size of the array. Hence the index value for "Aman" is:
Index = 2657860 % (16-1) = 4  

https://www.javatpoint.com/working-of-hashmap-in-java


### Hash Collision
This is the case when the calculated index value is the same for two or more Keys. Let's calculate the hash code for another Key "Sunny." Suppose the hash code for "Sunny" is 63281940. To store the Key in the memory, we have to calculate index by using the index formula.

Index=63281940 & (16-1) = 4  


### LinkedHashMap get first or last entry
linkedHashMap.entrySet().toArray()[linkedHashMap.size() -1];

The value 4 is the computed index value where the Key will be stored in HashMap. In this case, equals() method check that both Keys are equal or not. If Keys are same, replace the value with the current value. Otherwise, connect this node object to the existing node object through the LinkedList. Hence both Keys will be stored at index 4..




### Important:---
From the above we can see that Sunny and Aman both have Key = 4 in HashMap of Size 16.
But we more collision happen then this go to like linked and it operation like O(n)
<br>
TO overcome this problem JAVA uses Rehashing takes place after some time 
<br>
let our Hash Map size is 16
And default Load Factor = 0.75
<br>
So whenn the size of HashMap = 16*Load Factor = 12
then **Rehashing** takes places and the size of the hashbecome 32.
 SO the size of hashmap increase 16 32 64 --------
<br>
To overcome this problem we can pass the HashMap size and load Factor Manually.
<br>
We can pass value to the HashMap constructor(size, load factor)
<br>
 Map<String, String> countryCapital = new HashMap<>(100,0.75f);
 
 
 
### HashMap and LinkedHashMap -
are two of the most common used Map implementation in Java. Main difference between HashMap and LinkedHashMap is that LinkedHashMap maintains insertion order of keys, order in which keys are inserted in to LinkedHashMap. On the other hand HashMap doesn't maintain any order or keys or values. In terms of Performance there is not much difference between HashMap and LinkedHashMap but yes LinkedHashMap has more memory foot print than HashMap to maintain doubly LinkedList which it uses to keep track of insertion order of keys. Some time you notice that HashMap also returns elements in order e.g. before Java 8 when you use Integer key and then iterate over Map, you would see it returning entries in a particular order, but those are not guaranteed. Any code which is dependent upon ordering provided by HashMap will likely to break in future release when those behavior changes.

Read more: https://www.java67.com/2012/08/difference-between-hashmap-and-LinkedHashMap-Java.html#ixzz6RricpRSm


#### HashMap 

address = 123588
key = "India"
value ="INR"
next = next_node address

####  LinkedHashMap
HashMap + before and after double linked list

