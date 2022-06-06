import java.util.*;
public class checksumEncode
{
    public static void main(String[] args)
   {
       System.out.println("Enter 16 bits Data :");
       Scanner sc= new Scanner(System.in);
       String s=sc.nextLine();
       
       String senddata=send(s);
       System.out.println("Send Data :"+ senddata);
   }
   
   public static String send(String s)
   {
       String s1=s.substring(0,8);
       String s2=s.substring(8);
       String total=add(s1,s2);
       String checksum=getcomplement(total);
       System.out.println("CheckSum :"+checksum);
       return s+checksum;
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
