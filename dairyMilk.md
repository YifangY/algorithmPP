###### Dec 22 2017

No |Topic    |Tag    |Comments
 --- |------- |------|------
1|Two Sum|ArrayList|hashtable
26|Remove Duplicates from Sorted Array|ArrayList|border		
27|Remove Element|ArrayList|	
35|Search Insert Position |ArrayList|binary search **NOT INCLUDE MID**
66|Plus One|ArrayList|COPY SOLUTION/Good Idea
118|Pascal's Triangle  |ArrayList|List<List<Integer>> usage sample
119|Pascal's Triangle II|ArrayList|Second loop is from end to begin


###### Dec 21 2017
No |Topic    |Tag    |Comments
 --- |---------------------- |------|------
 459|Repeated Substring Pattern|String|  1.break inside loop;2. judge by i+1
 696|Count Binary Substrings|String|**1.judge by i-1 2.Why i=1 Why i--**, Copy solution
 443|String Compression|String| 
 686| Repeated String Match|String|int i=lenB/lenA is not good because B=2 A=1 or B=5 A=10(A may need to repeat twice);recommend StringBuilder(A)>lenB loop, then plus one judge
551| Student Attendance Record I|String|Jump
 
 Undo 521(google),680(facebook),606 in-order tree

###### Dec 20 2017
No |Topic    |Tag    |Comments
 --- |---------------------- |------|------
 434|number of segments(find space)|String| check i!=' 'and i-1==' '; i==0?
 387|First Unique Character in a String|String|for*2,no need queue
 383|Ransom Note|String|~delete~ just count
 345|Reverse Vowels of a String|String|String.contain,String.toCharArray,easy loop+border(begin<end)
 125|Valid Palindrome|String|easy loop+border(begin<end)
 680|Valid Palindrome II|String|same as125
 58|Length of Last Word|String|one line s.trim().length()-s.trim().lastIndexOf(" ")-1;
 38|Count and Say|String|**border**
 28|Implement strStr()|String|**border**
 14| Longest Common Prefix|String| force is better than KMP/4 solutions
 13|Roman to Integer|String|jump
 

###### Dec 19 2017
No |Topic    |Tag    |Comments
 --- |------------|------|------
 67| Add Binary |  string |     
 541| Reverse String II||good idea
 520|Detect Capital||
 344|Reverse String| |~delete~ StringBuilder
 557|Reverse Words in a String III||??Timeout by Stack,Copy solution



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
