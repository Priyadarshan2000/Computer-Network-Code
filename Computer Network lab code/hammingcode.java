import java.util.*;
public class hammingcode
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the data length :");
        int size= sc.nextInt();
        int[] data= new int[size];
        System.out.println("Enter the data :");
        for(int i=0;i<size;i++)
        {
            data[i]=sc.nextInt();
        }
        int r=1;
        while(Math.pow(2,r)<size+r+1)
            r++;
        System.out.println("R : "+r);
        int[] arr= getHamming(data,r);
        System.out.println("Hamming Code :");
        for(int i=1;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static int[] getHamming(int[] data,int r)
    {
        int arr[]= new int[data.length+r+1];
        int p=0;
        int k=0;
        for(int i=1;i<arr.length;i++)
        {
            if(i==Math.pow(2,p))
            {
                arr[i]=0;
                p++;
            }
            else
            arr[i]=data[k++];
        }
        p=0;
        for(int i=1;i<arr.length;i++)
        {
            if(i==Math.pow(2,p))
            {
                arr[i]=getr(arr,i);
                System.out.println("R"+i+" : "+arr[i]);
                p++;
            }
            
        }
        return arr;
    }
    
    public static int getr(int[] arr,int r)
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
