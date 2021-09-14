
public class Fibo
{
 public static void main(String[] args)
  {
     int n=5;
     int f=0,j=1,t;
     System.out.println(f);
     System.out.println(j);
       for(int i=3;i<=n;i++)
       {
            t=f+j;
            System.out.println(t);
            f=j;
            j=t;
         }

  }
}