//Frequency/Duplicates
import java.util.*;
class Main
{
   
	public static void main(String[] args) {
	   int arr[]={2,2,2,4,3,4,5,5,5,5,5,6,7,7};
	   int n=arr.length;
	   ///////////////Print the most repeated number from array.
        int c1=0,repNum=0;
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
            if(c>1)
            {
                if(c>c1)
                {
                    c1=c;
                    repNum=arr[i];
                }
                
            }
        }
        System.out.println(repNum+"---->"+c1);	   
	}
}