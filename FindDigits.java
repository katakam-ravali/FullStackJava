/*  Given an integer, for each digit that makes up the integer determine whether it is a divisor. 
Count the number of divisors occurring within the integer.*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            temp[i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            while(arr[i]>=0)
            {
                int rem=arr[i]%10;
                if(rem!=0 && temp[i]%rem==0 )
                {
                    c++;
                }
                arr[i]=arr[i]/10;
            }
            System.out.println(c);
        }
            
        
    }
}
