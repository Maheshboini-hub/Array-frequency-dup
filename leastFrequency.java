//Frequency/Duplicates
import java.util.*;
class Main
{
   
	public static void main(String[] args) {
	   int arr[]={2,2,2,4,3,4,5,5,5,5,5,6,7,7};
	   int n=arr.length;
	////////////////////////least unique number in an array
        int small=Integer.MAX_VALUE;
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
                if(arr[i]<small)
                {
                    small=arr[i];
                }
            }
        }
        System.out.println("Least Frequency of a element in array is : "+small);
	   
	}
}