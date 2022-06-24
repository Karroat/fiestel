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
*/


/*key generator*/
import java.util.Random;
import java.util.UUID;

class keys
{
 public static void main(String args[])
 {
  long k[]= new long[100];
  //string r[]= new tring[100] {1,0,0,1,0,1}; 
  for(int i=1;i<=5;i++)
  {
    k[i] = Math.abs(UUID.randomUUID().getMostSignificantBits());//srand();
    System.out.println(k[i]);
  }
 }
}

/* encryption*/

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

        return logicalXOR(r[i],k[i]);

      }
   } 
}  
}
