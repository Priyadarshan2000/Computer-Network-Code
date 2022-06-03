import java.util.*;
import java.lang.*;
class EvenParity
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[8];
		int count1=0;
		for(int i=0;i<7;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==1)
			count1++;
		}
		if(count1%2==0)
			arr[7]=0;
		else 
		 	arr[7]=1;
		 arr=sendData(arr);
		 receiveData(arr);
	 }
	 
	public static int[] sendData(int[] arr)
	{
		System.out.print(" Data send : ");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]);
			
		}
		System.out.println("");
		int maxb=1;
		int minb=0;
		
		int maxp=arr.length-1;
		int minp=0;
		
		int b=(int)(Math.random()*(maxb-minb+1)+minb);
		int p=(int)(Math.random()*(maxp-minp+1)+minp);
		System.out.println("Change bit"+p+","+b);
		arr[p]=b;
		return arr;
	}
	
	public static void receiveData(int[] arr)
	{
		System.out.print(" Data received:");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]);
			
		}
		System.out.println("");
		int count1=0;
		for(int i=0;i<7;i++)
		{
			if(arr[i]==1)
				count1++;
		}
	
		if(count1%2==0 && arr[7]==0)
		System.out.println(" Data received correctly");
		
		else if(count1%2==1 && arr[7]==1)
		System.out.println(" Data received correctly");
		
		else
		System.out.println(" Data received wrong");
	}
}