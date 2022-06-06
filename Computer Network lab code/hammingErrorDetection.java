import java.util.*;
public class hammingErrorDetection
{
public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Hamming Code size :");
        int size= sc.nextInt();
        int[] data= new int[size+1];
        System.out.println("Enter the data :");
        for(int i=1;i<=size;i++)
        {
            data[i]=sc.nextInt();
        }
        int s=1;
        while(Math.pow(2,s)<size)
            s++;
        System.out.println("S : "+s);
        String error= geterror(data,s);
        int pos=Integer.parseInt(error,2);
        if(pos==0)
        System.out.println("No error ");
        else
        {
            System.out.println("Error position : "+pos);
            data[pos]=(data[pos]+1)%2;
        
            System.out.println("Correct code : ");
            for(int i=1;i<=size;i++)
            {
                System.out.print(data[i]);
            }
        }
        
    }
    
    public static String geterror(int[] code,int s)
    {
        String error="";
       
        for(int i=0;i<s;i++)
        {
            int index=(int)Math.pow(2,i);
            int p=gets(code,index);
            System.out.println("S"+index+" : "+p);
            error=String.valueOf(p)+error;
            
        }
        return error;
    }
    
    public static int gets(int[] arr,int r)
    {
        int temp=0;
        for(int i=r;i<arr.length;i=i+(2*r))
        {
            for(int j=i;j<i+r;j++)
            {
                if(j>=arr.length)
                break;
                temp=temp^arr[j];
            }
        }
        return temp;
    }
}
