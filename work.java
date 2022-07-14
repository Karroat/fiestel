// ******************************** ENC **********************************
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;

class enc
{
public static void main(String args[]) throws FileNotFoundException,IOException,NullPointerException
{  
   String s="";
   String s1="";

  try
  {
  FileReader fis = new FileReader("D:\\project\\inp.txt");
       
  BufferedReader bis = new BufferedReader(fis);
  
  while ((s1 = bis.readLine())!= null)
  {
   s = s+s1; 
  }

  bis.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
  

   s=s.toUpperCase();
   System.out.println(s);
   int x=s.length();;
   //int g=2;
   char space =' ';
   //keys h=new keys();
  
   if(s.length()%2!=0)
   {
   s += space; 
   x=s.length();
   //System.out.println("String length:" + x);
   //System.out.println(s);
   }
   int ascii[] = new int[s.length()];

   System.out.print("ascii array: ");
 
   for(int i=0;i<s.length();i++)
     {
      
       ascii[i]= (int) s.charAt(i);
       System.out.print(ascii[i]+" ");
       
     }
   System.out.println();
   int k[];
   int l[];
   int r[];

    int n=(int) x/2;
    l = new int[n];
    r = new int[n];
   //System.out.print("Left: ")
    for(int i=0;i<n;i++)
    {
     l[i] = ascii[i];
     //System.out.print(l[i]+" ");
    }
     //System.out.println();
     //System.out.print("Right: ")
    for(int i=n,j=0;i<x && j<n;i++,j++)
    {
     
     r[j] = ascii[i];
     //System.out.print(r[j]+" ");
    }
     //System.out.println();
   

   //System.out.println("Enter no. of keys: ");   
   int nk = 1000; 
   //sc.nextInt();
   k = new int[nk];
   FileInputStream fs=new FileInputStream("ke.txt");
    DataInputStream ds=new DataInputStream(fs);
   for(int i=0;i<nk;i++)
   {
      k[i] = ds.readInt();   //h.generateRandomDigits(g) Math.abs(UUID.randomUUID().getMostSignificantBits());
      //System.out.println("k["+i+"] :" + k[i] );
   }
   ds.close();
   int funct[] = new int[r.length];
   int temp[] = new int[r.length];

     for(int j=0;j<nk;j++) //exception
     {
        for (int i= 0,z=0; i<r.length && z<l.length; i++,z++)
       {
            //System.out.println("before : l[]="+l[z]+"r[]="+r[i] + "k[]="+k[j]);
           // System.out.println((char)l[z]+""+(char)r[i]);
            temp[i] = r[i];
            funct[i] =(int)(r[i]^k[j]);
            r[i]= (int)(l[z]^funct[i]);
            l[z]= temp[i];
            //System.out.println("after : l[]="+l[z]+"r[]="+r[i]);
            //System.out.println((char)l[z]+""+(char)r[i]);
       }
       for (int i= 0,z=0; i<r.length && z<l.length; i++,z++)
       {
            System.out.print((char)l[z]+""+(char)r[i]);
       } 
      System.out.println();
     }
     char lo[] = new char[l.length];
     char ro[] = new char[r.length];
     char o[] = new char[l.length+r.length];
     for(int j=0,z=0;j<l.length && z<r.length;j++,z++)
     {
      lo[j] = (char)l[j];
      ro[z] = (char)r[z];
     }
     for (int i = 0; i < l.length; i++)
     {
            o[i] = (char)l[i];
     }
     for (int i = 0; i < r.length; i++)
     {        
            o[l.length + i] = (char)r[i];
     }
     System.out.println();
     System.out.print("Encrypted: ");
     for(int i=0;i<l.length+r.length;i++)
     {
      System.out.print(o[i]);
     }
    String e;
    File fil = new File("D:\\project\\en.txt");
       
  BufferedReader bru = new BufferedReader(new FileReader(fil));

  while ((e = bru.readLine()) != null)
  {
   new FileOutputStream("D:\\project\\en.txt").close();
  }
    FileWriter fWriter = new FileWriter("D:\\project\\en.txt");
    fWriter.write(o);
    fWriter.close();
    bru.close();
  
}
}



// ***************************************** DEC ***********************************************
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;

class dec
{
public static void main(String args[]) throws Exception
{  
   System.out.println("\n\n\n\t\t\t************************** Decryption **************************\n\n\n");
   int nk = 1000; 
   int k[];
   k = new int[nk];
   FileInputStream fs=new FileInputStream("ke.txt");
    DataInputStream ds=new DataInputStream(fs);
   for(int i=0;i<nk;i++)
   {
      k[i] = ds.readInt();  
      //System.out.println("k["+i+"] :" + k[i] );
   }
   ds.close();


    File fi= new File("D:\\project\\en.txt");
    BufferedReader br = new BufferedReader(new FileReader(fi));
    String doi ="";
    String d="";
    while ((d = br.readLine())!= null)
    {
     doi = doi+d; 
    }

    System.out.println("Encrypted string:"+ doi);
    
    new FileOutputStream("D:\\project\\en.txt").close();

     int dascii[] = new int[doi.length()]; 
     System.out.print("dascii array: "); 
     for(int i=0;i<doi.length();i++)
     {
       dascii[i] = (int) doi.charAt(i);
       System.out.print(dascii[i]+" ");
     }
     System.out.println();
     int dl[];
     int dr[];
     int ei=doi.length();
     
      int dn=(int) ei/2;
      dl = new int[dn];
      dr = new int[dn];
   //System.out.print("dleft: "); 
      for(int i=0;i<dn;i++)
      {
       dl[i] = dascii[i];
       //System.out.print(dl[i]+" "); 
      }
      //System.out.println(); 
   //System.out.print("dright: "); 
      for(int i=dn,j=0;i<ei && j<dn;i++,j++)
      {
     
       dr[j] = dascii[i];
       //System.out.print(dr[j]+" "); 
      }
       //System.out.println(); 
 
   int dfunct[] = new int[dl.length];
   int dtemp[] = new int[dl.length];

     for(int j=nk-1;j>=0;--j)                                           //exception
     {
        for (int i= 0,z=0; i<dr.length && z<dl.length; i++,z++)
       {
	   // System.out.println("before : l[]="+dl[z]+"r[]="+dr[i]+"k[]="+k[j]);
           // System.out.println((char)dl[z]+""+(char)dr[i]);


            dtemp[z] = dl[z];
            dfunct[z] =(int)(dl[z]^k[j]);
            dl[z]= (int)(dr[i]^dfunct[i]);
            dr[i]= dtemp[z];


           // System.out.println("after : l[]="+dl[z]+"r[]="+dr[i]);
           // System.out.println((char)dl[z]+""+(char)dr[i]);

       }
       for (int i= 0,z=0; i<dr.length && z<dl.length; i++,z++)
       {
        System.out.print((char)dl[z]+""+(char)dr[i]);
       }
      System.out.println();
     }

     System.out.println(); 
     char dlo[] = new char[dl.length];
     char dro[] = new char[dr.length];
     char dou[] = new char[dl.length+dr.length];
     for(int j=0,z=0;j<dl.length && z<dr.length;j++,z++)
     {
      dlo[j] = (char)dl[j];
      dro[z] = (char)dr[z];
     }
     for (int i = 0; i < dl.length; i++)
     {
            dou[i] = (char)dl[i];
     }
     for (int i = 0; i < dr.length; i++)
     {        
            dou[dl.length + i] = (char)dr[i];
     }
     System.out.print("Decrypted: ");
     for(int i=0;i<dl.length+dr.length;i++)
     {
      System.out.print(dou[i]);
     }
    System.out.println(); 
    // }

}
}

// 
