//Frequency/Duplicates
import java.util.*;
class Main
{
   
	public static void main(String[] args) {
	   int arr[]={2,2,2,4,3,4,5,5,5,5,5,6,7,7};
	   int n=arr.length;
	///////////////Count number of duplicate elements from array. 
	   int c1=0;
	   for(int i=0;i<n;i++)
	   {
	       int c=0;
	       for(int j=i+1;j<n;j++)
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
	   System.out.println("duplicate count...-> "+c1);   
	}
}