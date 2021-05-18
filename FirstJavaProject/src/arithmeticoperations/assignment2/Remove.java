package arithmeticoperations;
import java.util.*;
public class Remove {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the lenght of the array:");
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
   arr[i]=sc.nextInt();
  System.out.println("enter the index:");
  int index=sc.nextInt();
  
  for(int i=0;i<n;i++)
  {
   if(index==i)
    remove(arr,n,index);
  }
  sc.close();
   
 }
 static void remove(int[] arr, int size, int index) {
  if (arr == null || index < 0 || index >= size)
   for(int i=0;i<size;i++)
    System.out.println(arr[i]+" ");
  int[] newArr = new int[size-1];
  for (int i= 0, k = 0; i < size; i++) {
   if (i == index) 
    continue;
   newArr[k++] = arr[i];
  }
  for(int i=0;i<size-1;i++)
   System.out.println(" "+newArr[i]);
 }
}
