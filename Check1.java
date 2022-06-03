//java program for binary checksum
import java.util.*;
import java.io.*;
class Check1
{
int i,j,k,l,m,n;
String and="";
String compl="";
int ans;
public void checksum()
{
 int[] msg1=new int[8];
 int[] msg2=new int[8];
 Scanner s=new Scanner(System.in);

 System.out.println(" Enter your 1st binary value [8 bit]: ");
 for(i=0;i<8;i++)// to get values
 {
 msg1[i]=s.nextInt();
 }

 System.out.println(" Enter your 2nd binary value [8 bit]: ");
 for(j=0;j<8;j++)
 {
 msg2[j]=s.nextInt();
 }

 System.out.print("\nValue 1: ");
 for(k=0;k<8;k++)// to print values
 {
 System.out.print(msg1[k]);
 }
 System.out.print("\nValue 2: ");
 for(l=0;l<8;l++)
 {
 System.out.print(msg2[l]);
 }
 for(m=0;m<8;m++)// for 1s complement
 {
 and+=msg1[m] & msg2[m];
 if(and.charAt(m)=='0')
 compl+="1";
 else
 compl+="0";
 }
 System.out.println("\n "+and);
 System.out.println("\n1's complement "+compl);
 for(n=0;n<8;n++)//to check ans if 0 or not using and op
 {
 if((and.charAt(n) & compl.charAt(n))=='0')
 ans+=0;
 else
 ans+=1;
 }
 if(ans==0)
 System.out.println("\n no error.. ");
 else
 System.out.println("\n error.. ");
}

}
class Demo
{
public static void main(String args[])
{
 int ch;
 Check1 obj=new Check1();
 obj.checksum();
}
}
