###### Dec 19 2017
No |Topic    |Tag    |Comments
 --- |------------|------|------
 67| Add Binary |string      | 
 541| Reverse String II|good idea|


```Java  
for(int i=temp_length-1;i>=0;i--){
    if (aa>=0){
	v=a.charAt(aa)-48;
	--aa;
	}else av=0;
    if (bb>=0) {
	bv=b.charAt(bb)-48;
	--bb;
	}else bv=0;
    result.append((av+bv+plus)%2);
    plus=(av+bv+plus)/2;
}
//use sum instead of "else XX",b.charAt(j--) - '0' transfer char to int
while (i >= 0 || j >= 0) {
    int sum = carry;
    if (j >= 0) sum += b.charAt(j--) - '0';
    if (i >= 0) sum += a.charAt(i--) - '0';
    sb.append(sum % 2);
    carry = sum / 2;
}
```

###### Dec 10 2017
No |Topic    |Tag    |Comments
 --- |------------|------|------
 20| Valid Parentheses |array,stack      | 

### String
C++ String.length()

### C++ application vector
set size of vector(vector<t> abc(**size**)) is bad, because vector will be fixed on this size except "resize+shrink_to_fit"


###### Dec 9 2017
 No |Topic    |Tag    |Comments
 --- |------------|------|------
 349  | Intersection of Two Arrays |array,hash,set      |
 359  | Intersection of Two Arrays II   |    |
 242	|Valid Anagram |string  |[字符编码笔记：ASCII，Unicode 和 UTF-8](http://www.ruanyifeng.com/blog/2007/10/ascii_unicode_and_utf-8.html)|

### 0. Integer is a class and int is a primitive type.
### 1. Hashmap－Java   
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
		
###  2. set
Set<integer> sn= new HashSet<>()
	sn.add(value)
	sn.contains(value)

###  3. String
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

charAt()
isEmpty()
isEmpty()

**ChartoInt**

```Java
int [] counter= new int[26];
counter[s.charAt(i) - 'a']
counter[Character.getNumericValue(s.charAt(i))-10]
```

###  4. ArrayList
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
- ConS
ArrayList() or ArrayList(size)

- Op
add(value,add(index,value)  
size(),remove(value)||remove(index)  
get(index),isEmpty(),set(index,value)//replaced  

###  5. Array
Array.Sort(array)
