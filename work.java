	
import java.util.*;
import java.io.*;
import java.lang.*;

class Demo19 extends keys
{
public static void main(String args[])
{  
   String s;
   Scanner sc = new Scanner(System.in);
   s=sc.nextLine();
   s=s.toUpperCase();
   System.out.println(s);
   int x=s.length();
   int ascii[] = new int[s.length()]; 
   for(int i=0;i<s.length();i++)
     {
       ascii[i]= (int) s.charAt(i);
       System.out.print(ascii[i]);
       
     }
   System.out.println();
   //int k[];
   int l[];
   int r[];
   //int temp[];
   //int funct[];
   if(x%2==0)
   {
    int n=(int) x/2;
    l = new int[n];
    r = new int[n];
    for(int i=0;i<n;i++)
    {
     l[i] = ascii[i];
    }
    for(int i=n,j=0;i<x && j<n;i++,j++)
    {
     
     r[j] = ascii[i];
    }
   }
   else
   {
    int m=(int) x/2;
    l = new int[m];
    r = new int[m+1];
    for(int i=0;i<m;i++)
    {
     l[i] = ascii[i];
    }
    for(int i=m-1,j=0;i<x && j<m;i++,j++)
    {
     r[j] = ascii[i];
    }
   }
   //for(int i=0;i<r.length();i++)
  // {
   //   k[i] = Math.abs(UUID.randomUUID().getMostSignificantBits());
   //}
   int funct[] = new int[r.length];
   int temp[] = new int[r.length];
     for(int j=0;j<k.length;j++) //exception
     {
        for (int i= 0,z=0; i<r.length && z<l.length; i++,z++)
       {
            temp[i] = r[i];
            funct[i] =(int)(r[i]^k[j]);
            r[i]= (int)(l[z]^funct[i]);
            l[z]= temp[i];
       }
     }
     for(int i= 0,j=0; i<r.length && j<l.length; i++,j++)
     {
      
      System.out.println(l[j]+" "+r[i]);
     }
     char lo[] = new char[l.length];
     char ro[] = new char[r.length];
     char o[] = new char[l.length+r.length];
     for(int j=0,z=0;j<l.length && z<r.length;j++,z++)
     {
      lo[j] = (char)l[j];
      ro[z] = (char)r[z];
     }
     // using the pre-defined function arraycopy 

        System.arraycopy(l, 0, o, 0, l.length); 

        System.arraycopy(r, 0, o, l.length, r.length);

        Arrays.toString(0);
      for(int i=0;i<l.length+r.length;i++)
      {
      System.out.print(o[i]);
      }

}
}




		
		
		
class Demo20
{
  int temp;
  public static void main(String args[])
 {
        int k[] = new int[]{4,3};
        int left = 111;
        int right= 3;

        for (int i=0,j=0;i<=2 && j<1;i++,j++)
        {
            int temp = left;
            int funct =(left^k[i]);
            left= (int)(right^funct);
            right= temp;
        }

        System.out.print(left+" "+right);
    }
}












/*
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;

class keys
{
   int n=2;
   /*public static void countDigit(int r)
   {
     int count = 0;
     while (r != 0) {
         r = r / 10;
         ++count;
   }
     System.out.println(count);
     r=count;
     System.out.println(generateRandomDigits(r));*/
   
   public static int generateRandomDigits(int r) 
   {
    int m = (int) Math.pow(10, r - 1);//math.pow(1arg,2arg) means 10 to the power of n-1//
    int x = m + new Random().nextInt(9 * m);/*100000<=n<=900000*/ //means m is 10 to the power something//
    return x;
   }
   for(
}
class Demo15 extends Expo
{
public static void main(String args[])
{
//Scanner s=new Scanner(System.in);
//int n=s.nextInt();
int n = 2;
//countDigit(n);
generateRandomDigits(n);
}
}
*/
	
