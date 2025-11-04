//Frequency/Duplicates
import java.util.*;
class Main
{
   
	public static void main(String[] args) {
	   int arr[]={2,2,2,4,3,4,5,5,5,5,5,6,7,7};
	   //output: {3,3,3,2,1,2,2,2,1,1}. frequency of the array Elements;
	   int n=arr.length;
	   for(int i=0;i<n;i++)
	   {
	       int c=0;
	       for(int j=0;j<n;j++)
	       {
	           if(arr[i]==arr[j])
	           {
	               c++;
	           }
	       }
	       System.out.println(arr[i]+"-->"+c+" ");
	   }
	}
}