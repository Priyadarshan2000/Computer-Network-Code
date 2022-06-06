import java.util.*;
public class checksumDecode
{
   public static void main(String[] args)
   {
       System.out.println("Enter 24 bits Data :");
       Scanner sc= new Scanner(System.in);
       String s=sc.nextLine();
       receive(s);
   }
    public static void receive(String s)
   {
       String s1=s.substring(0,8);
       String s2=s.substring(8,16);
       String s3=s.substring(16);
       String sum=add(s1,s2);
       sum=add(s3,sum);
       String complement=getcomplement(sum);
       System.out.println("receiver sum :"+sum);
       System.out.println("receiver sum complement :"+complement);
       if(complement.equals("00000000"))
       System.out.println("data receive correctly");
       else
       System.out.println("data receive wrong");
   }
   
   public static String add(String s1, String s2)
   {
       String sum="";
       int carry=0;
       String[] str1=s1.split("");
       String[] str2=s2.split("");
       
       for(int i=str1.length-1;i>=0;i--)
       {
           int a=Integer.parseInt(str1[i]);
           int b=Integer.parseInt(str2[i]);
           int total=a^b^carry;
           carry=(a&b)|(b&carry)|(carry&a);
           sum=String.valueOf(total)+sum;
       }
       if(carry==1)
       {
           sum=add(sum ,"00000001");
       }
       return sum;
   }
   public static String getcomplement(String s)
   {
       s=s.replaceAll("1","X");
       s=s.replaceAll("0","1");
       s=s.replaceAll("X","0");
       return s;
   }
}
