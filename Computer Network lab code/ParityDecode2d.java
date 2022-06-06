import java.util.*;
public class ParityDecode2d
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of row");
        int row=sc.nextInt();
        System.out.println("Enter the Number of Column");
        int col=sc.nextInt();
        int errorcol=0;
        int errorrow=0;
        int flag=0;
        
        System.out.println("Enter the Data");
        int[][] data= new int[row][col];
        
        for(int i=0;i<row;i++)
        {
            int count1=0;
            for(int j=0;j<col;j++)
            {
                data[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<row;i++)
        {
            int count1=0;
            for(int j=0;j<col-1;j++)
            {
                if(data[i][j]==1)
                count1++;
            }
            if(count1%2!=data[i][col-1])
            {
                errorrow=i;
                flag++;
            }

        }
        
        for(int i=0;i<col;i++)
        {
            int count1=0;
            for(int j=0;j<row-1;j++)
            {
                if(data[j][i]==1)
                count1++;
            }
            if(count1%2!=data[row-1][i])
            {
                errorcol=i;
                flag++;
            }
        }
        
        if(flag==0)
        System.out.println("No Error");
        
        else if(flag==2)
        {
            System.out.println("Single Bit Error in -> "+errorrow +" "+errorcol  );
            data[errorrow][errorcol]= (data[errorrow][errorcol]+1)%2;
        }
        
        else
        System.out.println("Multiple Bit Error");
        
        System.out.println("------ Data ------");  
        for(int i=0;i<row-1;i++)
        {
            int count1=0;
            for(int j=0;j<col-1;j++)
            {
                System.out.print(data[i][j]+"  ");   
            }
            System.out.println();
        }
    }
}