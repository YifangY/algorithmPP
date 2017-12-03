/*1 put the high risk later. 
 *ex: for(;left<=end&&array[left]<=midvalue;left++); better than for(;array[left]<=midvalue&&left<=end;left++); 
 *  (array[++l]<pivot&&l<=c_end) is better than (l<=c_end&&array[++l]<pivot)
 * 
 */

package sort;

public class QuickSort {
	public static void main(String args[]) {
		int [] array= {1,23,323,45,10,2,3,8,12,56,78,34,410,7001};
		printarray(array);
		QuickSort2(array,0,array.length-1);
		printarray(array);
	}
	
	static void printarray(int [] array) {
		for(int a:array)
			System.out.print(a+" ");		
		System.out.println();
	}

	static void swap(int [] array,int a,int b) {
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	
	
	static void QuickSort2(int [] array,int left,int right) {
		if (left>=right)
			return;
		int t_i=PartitionEnd(array,left,right);
		QuickSort2(array,t_i+1, right);
		QuickSort2(array,left, t_i-1);
	};
	

/*
 * 
 * Either pivot = begin or end, return is reverse, such as end or begin
 */
	//Begin as pivot	  BY Priceton  return end only
	static int PartitionBegin(int[]array, int C_left, int C_right){
		int pivot=array[C_left];
		int begin=C_left;  //e:begin=left-1,no need pivot is the first -> while start from ++first
		int end=C_right+1; // need+1-> right-- soon (begining)
		while (begin<end) {
			while(array[++begin]<pivot)
				if(begin==C_right)
					break;
			while(array[--end]>pivot)
				if (end==C_left)
					break;
			if (begin<end)//e: begin<=end no need to swap(a,0,0)
				swap(array,begin,end);
		}
		swap(array,C_left,end); //swap(array,left,begin-1); either end only;error @{1,23,323,45,10,2,3,8,12,56,78,34,410,7001} with begin
		return end;		
	}
	/*
	 * End as pivot  BY Priceton return swap(array,C_right,begin) OK
	 * FAIL when return  swap(array,C_right,end)  UNKNOW REASON
	 * failure sample:
	 * 2100 23 323 45 10 2 3 8 12 56 78 34 410 7000 
	 *410 23 323 45 10 2 3 8 12 56 78 34 2100 7000 
	 */
	static int PartitionEnd(int[]array, final int C_left, final int C_right){
		int pivot=array[C_right];
		int begin=C_left-1;  //e:begin=left-1,no need pivot is the first -> while start from ++first
		int end=C_right; // need right-- initial
		while (begin<end) {
			while(array[++begin]<pivot)
				if(begin==C_right)
					break;
			while(array[--end]>pivot)
				if (end==C_left)
					break;
			if (begin<end)
				swap(array,begin,end);
		}
		swap(array,C_right,begin); //e: swap(array,left,begin-1);
		return begin;		
	}


	
	/*
	 * End as pivot  BY CLRS
	 *  all elements between begin and end are large than pivot
	 */
	static int PartitionCLRS(int[]array, final int C_left, final int C_right){
		int pivot=array[C_right];
		int begin=C_left-1;  //e:begin=left-1,no need pivot is the first -> while start from ++first
		int end=C_left;
		while (end<=C_right-1) {
			if (array[end]<=pivot) {
				begin++;
				swap(array,begin,end);
			}
			end++;
		}
		swap(array,begin+1,C_right);
		return begin+1;		
	}
	
	
	/*****************************************************************************
	 * * Improvement
	 * 1 Random pivot,(Median-of-three partitioning) then switch it to begin(PartitionBegin) or PartitionEnd(CLRS)
	 * 2 Work with InsertSort
	******************************************************************************/
		static int mediaofBeEnMid(int [] array,int C_left, int C_right) {
			int [] temp_array= {C_left,(C_left+C_right)/2,C_right};
			for(int i=0;i<2;i++)
				for(int j=i+1;j<3;j++) {
					if (array[temp_array[i]]>array[temp_array[j]]) {
						swap(temp_array,i,j);
					}
				}
			return temp_array[1];
		};
		
		static int PartitionRandom(int [] array,int C_left, int C_right) {
			int i=mediaofBeEnMid(array,C_left, C_right);//array[C_left],array[C_right],array[(C_left+C_right)/2]
		    swap(array,i,C_left);//	  or  swap(array,i,C_right);
		    return PartitionBegin(array, C_left, C_right);
		}
		
	
// Mid as pivot Two side to mid FAIL by BUG
//		static void QuickSort1BUG(int [] array,int begin,int end) {
//			if (begin>=end)
//				return;
//			int midvalue=array[end];//can't be end, may get error when array is 1,23,323,45,10,2,3,8,12,56,78,34,410,7000, then repeat check array 0 13
//			int left=begin;
//			int right=end;
//			for (;left<right;) {
//				for(;left<=end&&array[left]<midvalue;left++);  
//				//!!!a.ADD THE BORDER;b.array[left]<=midvalue is incorrect,if add "=", it will cause loop;
//				for(;right>=begin&&array[right]>midvalue;right--); //!!!for(;array[right]>midvalue;right++);
//				if (left<right)
//					swap(array,left,right);
//			}
//			QuickSort1(array,begin,left);
//			QuickSort1(array,left+1,end);
//		}
	
}
