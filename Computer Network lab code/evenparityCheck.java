import java.util.*;
public class evenparityCheck
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the data : ");
        String data= sc.nextLine();
        int count1=0;
        
        for(int i=0;i<data.length();i++)
        {
            if(data.charAt(i)=='1')
                count1++;
        }
        
        if(count1%2==0)
        System.out.println("Data receive Correctly ");
        
        else
        System.out.println("Data receive Wrong ");
        
    }
}