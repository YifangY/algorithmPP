package sort;

import java.util.*;

public class nsquart {
public static void main(String args[]) {
	int [] array= {182,23,323,45,10,2,3,8,12,56,78,34,410,70};
	int [] a = new Random().ints(20, 70, 100).toArray();
	int [] b = new Random().ints(20,1,1000).toArray();
	System.out.println(Arrays.toString(a));
			print(array);
//	BubbleSort(array);
//	SelectSort(array);
	InsertSort(array);
	print(array);
	Arrays.sort(array);
	print(array);
};

private static void swap(int [] array,int i,int j) {
	int temp=array[j];
	array[j]=array[i];
	array[i]=temp;
}

public static void print(int [] array) {
	for(int a:array) {
		System.out.print(a+" ");
	}
	System.out.println();
}

public static void BubbleSort(int []array) {
	int i,j;
	int operator=1;//e:	int operator=0
	for(i=0;i<array.length&&operator==1;i++)
		for(j=0,operator=0;j<array.length-1;j++)//e:for(j=i,operator=0;j<array.length-1;j++) //compare with Select
			if (array[j]>array[j+1]) {
				swap(array,j,j+1);
				operator=1;
			}
}

public static void SelectSort(int []array) {
	int i,j;
	for(i=0;i<array.length;i++)
		for(j=i+1;j<array.length;j++)//e:for(j=i+1;j<array.length-1;j++)  //compare with BB
			if(array[i]>array[j])
				swap(array,i,j);
}

public static void InsertSort(int []array) {
	int i,j;
	for(i=1;i<array.length;++i) //	for(i=0;i<array.length;j++)
		if (array[i]<array[i-1]) {  //e:if (array[i]>=array[i-1]) ,  No need to handle larger, if large->next loop(i++) 
			int temp=array[i];
			for(j=i;j>0;--j) 
				if (array[j-1]>temp)
					array[j]=array[j-1];
				else// forget
					break; //forget
			array[j]=temp;//		e:array[j-1]=temp; @1203 Tip the last j is 0 not 1
		}	
}	
}

