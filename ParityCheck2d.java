//Write a java program to implement Error-detection  by 2D-parity checking method.
import java.util.*;

class ParityCheck2d
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int i,j;
		int[][] data= new int[4][4];
		
		for(i=0;i<3;i++)
		{
			int check1=0;
			for(j=0;j<3;j++)
			{
				data[i][j]=sc.nextInt();
				if(data[i][j]==1)
					check1++;
			}
			
			if(check1%2==0)
				data[i][3]=0;
			
			else
				data[i][3]=1;
		}
		
		
		for(j=0;j<=3;j++)
		{
			int check2=0;
			for(i=0;i<3;i++)
			{
				
				if(data[i][j]==1)
					check2++;
			}
			
			if(check2%2==0)
				data[3][j]=0;
			
			else
				data[3][j]=1;
		}
		send(data);
		receive(data);
		checkData(data);
	}


	public static void send(int[][] data)
	{
		System.out.println(" .....send Data .....");
	 	for(int i=0;i<=3;i++)
			{
				for(int j=0;j<=3;j++)
				{
					
					System.out.print(data[i][j]+"  ");
				}
				System.out.println();
				
			
			}
			
			
		int maxb=1;
		int minb=0;
		
		int maxp=data.length-1;
		int minp=0;
		
		int b=(int)(Math.random()*(maxb-minb+1)+minb);
		int p1=(int)(Math.random()*(maxp-minp+1)+minp);
		int p2=(int)(Math.random()*(maxp-minp+1)+minp);
		System.out.println("Change bit"+p1+","+p2+"->"+b);
		data[p1][p2]=b;
	}
	
	public static void receive(int[][] data)
	{
		System.out.println(".......receive data......");
			for(int i=0;i<=3;i++)
			{
				for(int j=0;j<=3;j++)
				{
					
					System.out.print(data[i][j]+"  ");
				}
				System.out.println();
			
			}
		}
		
	public static void checkData(int[][] data)
	{
	int i,j;
		for(i=0;i<3;i++)
		{
			int check1=0;
			for(j=0;j<3;j++)
			{
				if(data[i][j]==1)
					check1++;
			}
			
			if(check1%2==0 && data[i][3]!=0)
			{
				System.out.println(" data receive wrong ");
				return;
			}
				
			
			else if(check1%2==1 && data[i][3]!=1)
			{
				System.out.println(" data receive wrong ");
				return;
			}
				
		}
		
		for(j=0;j<3;j++)
		{
			int check1=0;
			for(i=0;i<3;i++)
			{
				if(data[i][j]==1)
					check1++;
			}
			
			if(check1%2==0 && data[i][3]!=0)
			{
				System.out.println(" data receive wrong ");
				return;
			}
				
			
			else if(check1%2==1 && data[i][3]!=1)
			{
				System.out.println(" data receive wrong ");
				return;
			}
				
		}
		
		System.out.println(" data receive correctly ");
				return;
		
	}
}
	
	
