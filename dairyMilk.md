###### Dec 28 2017
No |Topic    |Tag    |Comments
 --- |------- |------|------
695|Max Area of Island   |dfs|
733|Flood Fill   |dfs|solution a little improvement:if (color != newColor) dfs(image, sr, sc, color, newColor); to save space
717|1-bit and 2-bit Characters   |array|easy
168|Excel Sheet Column Title   |Math|caution n-1 at second
171|Excel Sheet Column Number   |Math|
172|Factorial Trailing Zeroes   |Math|Copy Solution//n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
258|Add Digits   |Math|Copy Solution//n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
263|Ugly Number   |Math|  Copy Solution// for (int i=2; i<6 && num>0; i++)   while (num % i == 0)   num /= i;
326|Power of Three   |Math|ref solution
400|Nth Digit   |Math|Copy Solution//TBD
415|Add Strings   |Math|Copy Solution
453|Minimum Moves to Equal Array Elements   |Math|sum + m * (n - 1) = x * n AND  x = minNum + m SO sum - minNum * n = m
507|Perfect Number   |Math|ref solution//sum-num==num; not overflow
598|Range Addition II   |Math|ref solution//easy to understand
633|Sum of Square Numbers   |binary Search|caution index type
728|Self Dividing Numbers   |Math|Brute Force
155|Min Stack   |Stack|ref disscuss #2//don't forget <= AND initialized stack min
225|Implement Stack using Queues   |Stack|easy//by one queue
232|Implement Queue using Stacks   |Stack|easy//by two stack
682|Baseball Game   |Stack|easy
496|Next Greater Element I   |Stack|ref discussion(better than solution)//good question
176|Second Highest Salary   |DB|jump
196|Delete Duplicate Emails |DB|Copy Solution//DELETE must
596|Classes More Than 5 Students   |DB|distinct
197|Rising Temperature   |DB|DATEDIFF(w2.date, w1.date) = 1//2-1
183|Customers Who Never Order   |DB|ref solution//Not in//what about left natural join
181|Employees Earning More Than Their Managers   |DB|look
182|Duplicate Emails   |DB|jump
620|Not Boring Movies   |DB|order by rating DESC
627|Swap Salary   |DB|Copy Solution//UPDATE m to f
595|Big Countries   |DB|jump,too easy

###### Dec 27 2017
No |Topic    |Tag    |Comments
 --- |------- |------|------
108|Convert Sorted Array to Binary Search Tree   |tree|ref web//caution begin>end, so equal is OK
501|Find Mode in Binary Search Tree   |tree|[2147483647]  //caution the last not equal element
572|Subtree of Another Tree   |tree|
606|Construct String from Binary Tree   |tree|solution is simple
617|Merge Two Binary Trees   |tree|COPY SOLUTION/Good Idea
637|Average of Levels in Binary Tree   |tree|bfs 
653|Two Sum IV - Input is a BST   |tree|vfs+hash
671|Second Minimum Node In a Binary Tree   |tree|Not understand the question at that time//look
687|Longest Univalue Path   |tree|Copy Solution//Good Solution It use arrowLeft = 0, arrowRight = 0; to reset uncontinue value AND caution arrowLength return value is not the longest value
669|Trim a Binary Search Tree   |tree|Copy Solution//Good Solution
367|Valid Perfect Square   |binary Search|ex:104976//no use mid with nums/mid(lost something), mid*mid with nums is OK//left<=right "=" is important// mid type is long
374|Guess Number Higher or Lower   |binary Search|easy
744|Find Smallest Letter Greater Than Target   |binary Search|binary border see comment
441|Arranging Coins   |binary Search|Like 367//what about border?

###### Dec 26 2017
No |Topic    |Tag    |Comments
 --- |------- |------|------
690|Employee Importance   |dfs|caution map(?,?)
202|Happy Number   |math|copy answer/slow,fast
21|Merge Two Sorted Lists   |Linked|look/jump
83|Remove Duplicates from Sorted List   |Linked|look/jump/caution:next is null
141|Linked List Cycle   |Linked|look
160|Intersection of Two Linked Lists   |Linked|look/good idea
203|Remove Linked List Elements   |Linked|look/ex[6,6] remove 6//two pointer
237|Delete Node in a Linked List   |Linked|Look/interesting Java
206|Reverse Linked List   |Linked|look
234|Palindrome Linked List   |Linked|good//move fast first//odd or even
100|Same Tree   |tree|recur is better
101|Symmetric Tree   |tree|
104|Maximum Depth of Binary Tree   |tree|
107|Binary Tree Level Order Traversal II   |tree|BFS [1,2,3,4,6,null,5] output [1,2,3,4,6,null,5] //ex:[3,9,20,null,null,15,7]
110|Balanced Binary Tree   |tree|info solution
111|Minimum Depth of Binary Tree   |tree|info solution
112|Path Sum   |tree|[],0 is false
226|Invert Binary Tree   |tree|no comments
235|Lowest Common Ancestor of a Binary Search Tree   |tree|not bianli//good
257|Binary Tree Paths   |tree|dfs
404|Sum of Left Leaves |tree|
437|Path Sum III   |tree|recur//good idea//AND two solution in discussion//TBD
538|Convert BST to Greater Tree   |tree|COPY SOLUTION/Good Idea
543|Diameter of Binary Tree   |tree|solution is better//dps
563|Binary Tree Tilt   |tree|COPY SOLUTION/Good Idea//result location changing will change result//TBD Time exceed
231|Power of Two   |Math|


###### Dec 25 2017
No |Topic    |Tag    |Comments
 --- |------- |------|------
389|Find the Difference |hash|good idea not hash//for hash it may not by sort, hash all please
409|Longest Palindrome   |hash|ex:"bb"
438|Find All Anagrams in a String   |hash|template at substring match
447|Number of Boomerangs   |hash|hash map as count table//my idea matrix,read every line
463|Island Perimeter   |hash|no need DFS//Only one island so it is simpler// 4 direction to 2 directions.
500|Keyboard Row   |hash|easy//up and low case
575|Distribute Candies   |hash|Solution:In fact, there is only two possible
594|Longest Harmonious Subsequence   |hash|//subsequence
599|Minimum Index Sum of Two Lists   |hash|//Why does it need String[]//consider =
645|Set Mismatch   |math|caution 3 abs//ex[2,2],[2,3,2]
690|Employee Importance   |dfs|caution map(?,?)
202|Happy Number   |math|copy answer/slow,fast
21|Merge Two Sorted Lists   |Linked|look/jump
83|Remove Duplicates from Sorted List   |Linked|look/jump/caution:next is null
141|Linked List Cycle   |Linked|look
160|Intersection of Two Linked Lists   |Linked|look/good idea
203|Remove Linked List Elements   |Linked|look/ex[6,6] remove 6//two pointer
237|Delete Node in a Linked List   |Linked|Look/interesting Java
206|Reverse Linked List   |Linked|look
234|Palindrome Linked List   |Linked|good//move fast first//odd or even

###### Dec 24 2017
No |Topic    |Tag    |Comments
 --- |------- |------|------
696|Count Binary Substrings|String|1.judge by i-1 2.Why i=1 Why i--, Copy solution
448|Find All Numbers Disappeared in an Array   |Array|Good idea/Copy Answer
485|Max Consecutive Ones   |Array|look/ex:[1]
532|K-diff Pairs in an Array   |Array|"Good idea/my idea a.two hash(one mark accessed,one calculate) b.hash2(key,key+-k))solution:don't worry value-k,just value+k,because value-k will count on your pair"
561|Array Partition I   |Array|TBD,VIP answer is not sort
566|Reshape the Matrix   |Array|look/caution border see comm
581|Shortest Unsorted Continuous Subarray  |Array|ex:[1,3,2,2,2],[1,3,2,3,3],[2,3,3,2,4],[1,2,4,5,3]
605|Can Place Flowers   |Array|solution is hard to think/caution third if see comm
628|Maximum Product of Three Numbers   |Array|relate to 414 ex[-1,-2,-3], if add comm(n>0 find max,n<0 find min), it is error in all neg
643|Maximum Average Subarray I   |Array|look/good idea/complexit is n
665|Non-decreasing Array   |Array|hard to define pos/ex:[3,4,2,3]/change the array value
674|Longest Continuous Increasing Subsequence|Array|not simple as you think, write again/how to handle the last element
747|Largest Number Greater Than Twice of Others   |Array|easy/jump
697|Degree of an Array   |hash|3 tables
724|Find Pivot Index   |hash|Try again: must not include pivot and include 0 and end(sum is zero)|ex:[-1,-1,-1,0,1,1]
661|Image Smoother   |Array|jump,hard to understand, easy to do; caution the border
204|Count Primes   |math|no
205|Isomorphic Strings   |hash|I use two hashmap…
290|Word Pattern   |hash|how to use hashmap with c
7|Reverse Integer   |math|Int boarder/long
9|Palindrome Number   |math|reverse half good idea//base on 7/<0false/ex:21120
69|Sqrt(x)   |math|REMEMBER IT



###### Dec 23 2017
No |Topic    |Tag    |Comments
 --- |------- |------|------
121|Best Time to Buy and Sell Stock|Array|easy
122|Best Time to Buy and Sell Stock II|Array|have simple solution
167|Two Sum II - Input array is sorted|Array|basic program,while(i<j)
169|Majority Element|Array|Boyer-Moore Voting Algorithm
189|Rotate Array|Array|have simple solution
217|Contains Duplicate|Array|~delete~
219|Contains Duplicate II|Array|~delete~
268|Missing Number|Array|by XOR jump
283|Move Zeroes|Array|**have simple solution**
414|Third Maximum Number|Array|by Integer jump


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
 350  | Intersection of Two Arrays II   |    |
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
