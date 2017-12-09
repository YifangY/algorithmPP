###### Dec 9 2017
 No |Topic    |Tag    |Comments
 --- |------------|------|------
 349  | Intersection of Two Arrays |array,hash,set      |
 359  | Intersection of Two Arrays II   |    |
 242	|Valid Anagram |string  |

0. Integer is a class and int is a primitive type.
1. Hashmap－Java   
**KEY vs VALUE**
**Hashmap vs Hashtable vs HashSet cs HashCode**
**map,hash**
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

```java
import java.util.HashMap

Map<Integer,Integer> hmp= new HashMap<Integer,Integer>(size); //faster
Map<Integer,Integer> hmp= new HashMap<Integer,Integer>();//slower
//遍历map中的键 
for (Integer key : hmp.keySet()) {  
    System.out.println("Key = " + key);  
}    
//遍历map中的值  
for (Integer value : hmp.values()) {   
    System.out.println("Value = " + value);  
}  
// Operation
if (hmp.containsKey(nums2[temp])){
    hmp.put(nums1[temp],index);
    hmp.remove(nums2[temp]);
		// isEmpty(),containsValue,clear(),get(key)
    }  		
```  
		
2. set
Set<integer> sn= new HashSet<>()
	sn.add(value)
	sn.contains(value)

3. String
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

charAt()
isEmpty()
isEmpty()

4. ArrayList
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
ConS
ArrayList() or ArrayList(size)

Op
add(value,add(index,value)  
size(),remove(value)||remove(index)  
get(index),isEmpty(),set(index,value)//replaced  

5. Array
Array.Sort(array)
