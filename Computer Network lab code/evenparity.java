import java.util.*;
public class evenparity
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
        data+="0";
        
        else
        data+="1";
        
        System.out.println("Even Parity : "+data);
        
    }
}