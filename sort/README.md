## Include
QuickSort,MergeSort, Nsquare(BubbleSort,SelectSort,InsertSort)
  
## ToDoList
 **!!!Recursion to Iterative**
1. MergeSort 
   - improvement https://algs4.cs.princeton.edu/22mergesort
2. QuickSort 
   - improvement https://algs4.cs.princeton.edu/23quicksort/
      - work with Insert
   - Pivot vs Return Error (pivot is begin, there is error if it returns begin)
3. Bubble
   - improvement add mark place on loop's first swap place, next time star from here
4. HeapSort
5. Bucket sort,Counting sort,Counting sort 
  
## Tips
 1. Put the high risk later. 
     - ex:  
 ` while(left<=end&&array[left]<=midvalue) ` better than ` (array[left]<=midvalue&&left<=end) `  
 ` (array[++l]<pivot&&l<=c_end) `       better than ` (l<=c_end&&array[++l]<pivot) ` 
 2. Bubble improvement, mark change, mark last swap
  
## Record
 Minute/error |QS    |MS    |Insert
 ------------ |------|------|------
 Dec/02/2017  | 10/5 |      | 5/1
  
 

---------
### Log  
###### Dec 3 2017
- Quick 
    Princeton can select pivot as begin or end , but return reverse
- Insert
    Insert the value e:
    ```java
    for(j=i;j>0;j--)  // or for(j=i;j>0;j--), I don't like>= or <= 
    // ...  move one by one
    array[j]=temp;  //array[j-1]=temp; Hint:the last j is 0 not 1 ->array[j] should be set to temp
    ```

###### Dec 2 2017
- Quick  
  ~~Princeton can select pivot as begin only, return either begin or end~~  
  ~~Princeton can NOT select pivot as end, work only return begin~~
    ```java  
    static int PartitionBegin(int[]array, int C_left, int C_right){  
      int pivot=array[C_left];
      int begin=C_left;  //e:begin=left-1,no need pivot is the first -> while start from ++first
      int end=C_right+1; // need+1-> right-- soon (begining)
    ```
- Merge  *1st time*
- Insert  *1st time*
- Bubble vs Select Comparation
    ```java
    for(j=0,operator=0;j<array.length-1;j++) . //bubble
    for(j=i+1;j<array.length;j++) . //Select
    ```


