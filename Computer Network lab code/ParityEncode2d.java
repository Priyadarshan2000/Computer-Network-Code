import java.util.*;
public class ParityEncode2d
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of row");
        int row=sc.nextInt();
        System.out.println("Enter the Number of Column");
        int col=sc.nextInt();
        
        System.out.println("Enter the Data");
        int[][] data= new int[row+1][col+1];
        for(int i=0;i<row;i++)
        {
            int count1=0;
            for(int j=0;j<col;j++)
            {
                data[i][j]=sc.nextInt();
                if(data[i][j]==1)
                count1++;
            }
            if(count1%2!=0)
            data[i][col]=1;
        }
        
        for(int i=0;i<=col;i++)
        {
            int count1=0;
            for(int j=0;j<row;j++)
            {
                if(data[j][i]==1)
                count1++;
            }
            if(count1%2!=0)
            data[row][i]=1;
        }

        System.out.println("------ 2d Parity ------");  
        for(int i=0;i<=row;i++)
        {
            int count1=0;
            for(int j=0;j<=col;j++)
            {
                System.out.print(data[i][j]+"  ");   
            }
            System.out.println();
        }
    }
}