/*keys genarator*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;

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
