package sort;

public class MergeSort {
public static void main(String args[]) {
	int [] array= {1,23,323,45,10,2,3,8,12,56,78,34,410,7000};
	printarray(array);	
	int [] aux = new int[array.length];
	for (int i=0; i<=array.length-1;i++)
		 aux[i]=0;
	MergeSort1(array,aux,0,array.length-1);
	printarray(array);	
}
 static void printarray(int [] array) {
	for (int a:array)
		System.out.print(a+" ");
	System.out.println();
}

 static void MergeSort1(int []array, int [] aux,int C_begin, int C_end) {
	 if (C_end-C_begin==0)
		 return;
	 MergeSort1(array,aux, C_begin, (C_begin+C_end)/2);
	 MergeSort1(array,aux, (C_begin+C_end)/2+1,C_end);
	 Merge(array,aux, C_begin, (C_begin+C_end)/2,C_end);
 }
 
 static void Merge(int []array, int [] aux,int C_begin, int C_mid, int C_end) {
	 int p1=C_begin;
	 int p2=C_mid+1;
	 int k=C_begin;
	 while (p1<=C_mid&&p2<=C_end) {
		 if (array[p1]<array[p2]) {
			 aux[k]=array[p1];
			 p1++;
		 }else {
			 aux[k]=array[p2];
			 p2++;
		 }
		 k++;
	 }
	 while(p1<=C_mid) {
		 aux[k]=array[p1];
		 p1++;
		 k++;//e:forget
	 }
	 while(p2<=C_end) {
		 aux[k]=array[p2];
		 p2++;
		 k++;//e:forget
	 }
	 for (int i=C_begin; i<=C_end;i++)
		 array[i]=aux[i];
//	 printarray(array);
 }
 
 
}
