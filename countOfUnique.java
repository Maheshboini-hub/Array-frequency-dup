//Frequency/Duplicates
import java.util.*;
class Main
{
   
	public static void main(String[] args) {
	   int arr[]={2,2,2,4,3,4,5,5,5,5,5,6,7,7};
	   //////// number of unique elemts in an array
	   int n=arr.length;
	   int c1=0;
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
	       if(c==1)
	       {
	         c1++;  
	       }
	   }
	   System.out.println("Count of the Unique Elements "+c1);
	}
}