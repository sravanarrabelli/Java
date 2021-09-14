import java.util.Scanner;

public class Polindromstr
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your number");
   String str=sc.next();
   String org_str=str;
   String rev="";
   int len=str.length();
   for(int i=len-1;i>=0;i--)
   {
       rev=rev+str.charAt(i);
   }
   if(org_str.equals(rev))
   {
    System.out.println(org_str+"is Palindrom String");
   }
   else{
    System.out.println(org_str+"not a Palindrom String");
    }
 }
}