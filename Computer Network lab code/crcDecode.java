import java.util.*;
public class crcDecode
{
        public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the data size:");
        int n=sc.nextInt();
        System.out.println("Enter the data :");
        int[] data= new int[n];
        for(int i=0;i<n;i++)
        {
            data[i]=sc.nextInt();
        }
        System.out.println("Enter the divisor size:");
        int m=sc.nextInt();
        System.out.println("Enter the divisor:");
        int[] div= new int[m];
        for(int i=0;i<m;i++)
        {
            div[i]=sc.nextInt();
        }
        
        int[] rem =divide(data,div);
        for(int i=0;i<rem.length;i++)
        {
            if(rem[i]!=0)
            {
                System.out.print("Wrong data receive ");
                return;
            }
        }
        System.out.print("Correct data receive ");      
    }
    
    public static int[] divide(int[]temp,int[]div)
    {
        int cur=0;
        while(true)
        {
            for(int i=0;i<div.length;i++)
            {    
                temp[cur+i]=temp[cur+i]^div[i];
            }
            while(temp[cur]==0 && cur<temp.length-1)
                cur++;
            if(temp.length-cur<div.length)
                break;
        }
        return temp;
    }
}
