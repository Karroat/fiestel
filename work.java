//workspace
/*keys genarator*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;

//Hey pentas 

class Expo
{
public static int generateRandomDigits(int n) 
{
    int m = (int) Math.pow(10, n - 1);
    return m + new Random().nextInt(9 * m);/*100000<=n<=900000*/
}
}
class Demo15 extends Expo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
//int n = 10000 + s.(new Random().nextInt(90000));/*10000<=n<=90000*/
System.out.println(generateRandomDigits(n));
}
}


/*coverts decimal to binary*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
	static void decimalToBinary(int num)
	{
		System.out.println(Integer.parseInt(Integer.toBinaryString(num)));
	}
}

class Demo1 extends Code
{
	public static void main(String[] args)
	{
            Scanner s=new Scanner(System.in);
            int num= s.nextInt();
	    decimalToBinary(num);
	}
}

/* akshit input code
class Test
{
 public static void main(String args[])
  {
   String s = "abcd";
   int sum=0;
   String bin;
   for(int i=0;i<s.length();i++)
     {
       int x= (int) s.charAt(i);
      // System.out.println(x);
       sum= sum + x;
     }
   System.out.println(sum);
   bin = Integer.toBinaryString(sum);
   System.out.println(bin);
  }
}




 //akshit input
class Test
{
 public static void main(String args[])
  {
   String s = "abcd";
   int y=0;
   int[] l1=new int[100];
   int[] r1=new int[100];

   for(int i=0;i<s.length();i++)
     {
       int x= (int) s.charAt(i);
       y+=x;
       //System.out.println(x);
     }
   System.out.println(y);
   int[] z= new int[100];
   for(int i=0;i<100;i++)
   {
   z[i] = Integer.parseInt(Integer.toBinaryString(y));
   }
   System.out.println(z);
 
   int length = 0;
    for(int i=0;i<10;i++)
    {
    while (z[i] >= 0) {
      // num = num/10
      z[i] /= 10;
      ++length;
    }
    }

   //int length = (int) (Math.log10(z) + 1);
   System.out.println(length);
   if(length%2==0)
   {
    for(int i=0;i<length/2;i++)
    {
     l1[i] = z[i];
    }
    for(int i=length/2;i<length;i++)
    {
      for(int j=0;j<length;i++)
      {
       r1[j] = z[i];
      }
    }
   }
   for(int i=0;i<10;i++)
   {
    System.out.println(l1[i]);
    System.out.println(r1[i]);
   }





  }
} 
*/
/*key generator*/
import java.util.*;
import java.io.*;

class Demo2
{
public static void main(String args[])
{
 string k[]= new string[100];
 string r[]= new string[100] {1,0,0,1,0,1}; 
 for(int i=1;i<=3;i++)
 {
 k[i] = srand()
 System.out.println(k[i]);
 }
}
}

/* encryption*/
import java.util.*;
import java.util.UUID;

class Encryptioo
{
    public String encrypt(int x[]) 
  {
        string l[]= new string[100];
        string r[]= new string[100];
        string temp;
        int x = x.length() / 2;
        String l[] = variable.substring(variable(x)); //some input binary string if stored in a string variable//
        String r[] = variable.substring(variable(x));

        for (int i= 1; i<3; i++)
       {
            String temp = r[i];
            String funct[i] = function(r[i],k[i]);
            r[i]= XOR(l[i], funct[i]);
            l[i] = temp;
       }
        return l + "" + r;
  public static string function(r[i],k[i])
  {
    if(r.length==k.length)
     {
       for(int i=1;i<r.length;i++)
      {

        system.out.print(logicalXOR(r[i],k[i]));

      }
   } 
}  
}
