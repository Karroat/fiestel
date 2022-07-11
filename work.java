import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;

class fe extends keys
{
public static void main(String args[]) throws FileNotFoundException,IOException,NullPointerException
{  
   String s="";
   String s1="";
   //Scanner sc = new Scanner(System.in);
   //s="hello this is ak"; //sc.nextLine();
  try
  {
  FileReader fis = new FileReader("D:\\project\\inp.txt");
       
  BufferedReader bis = new BufferedReader(fis);
  

  while ((s1 = bis.readLine())!= null)
  {
   s = s+s1; //bis.readLine()
   System.out.println(s);
  }
  System.out.println(s);
  bis.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
  

   s=s.toUpperCase();
   int x=s.length();;
   int g=2;
   char space =' ';
   keys h=new keys();
   //if(s.length()%2==0)
   //{
   //System.out.println("String length:" + x);
   //System.out.println(s);
   //}
   if(s.length()%2!=0)
   {
   s += space; 
   x=s.length();
   //System.out.println("String length:" + x);
   //System.out.println(s);
   }
   int ascii[] = new int[s.length()];

   //System.out.print("ascii array: ")
 
   for(int i=0;i<s.length();i++)
     {
      
       ascii[i]= (int) s.charAt(i);
       //System.out.print(ascii[i]+" ");
       
     }
   //System.out.println();
   int k[];
   int l[];
   int r[];
   //int temp[];
   //int funct[];
  // if(x%2==0)
   //{
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
   //}

//****************************
  /* else
   {
    int m=(int) x/2;
    l = new int[m+1];
    r = new int[m+1];
    for(int i=0;i<m;i++)
    {
     l[i] = ascii[i];
    }
    for(int i=m,j=0;i<x && j<m+1;i++,j++)
    {
     r[j] = ascii[i];
    }
   } */

//*****************************
   //System.out.println("Enter no. of keys: ");   
   int nk = 10000; 
   //sc.nextInt();
   k = new int[nk];
   for(int i=0;i<nk;i++)
   {
      k[i] = h.generateRandomDigits(g); //Math.abs(UUID.randomUUID().getMostSignificantBits());
   }
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
//**********
   /*  for(int i= 0,j=0; i<r.length && j<l.length; i++,j++)
     {
      System.out.print(l[i]+" "+r[i]+" ");
     }*/
//**********
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
     //Decryption(o);
     //}





//*********************************************************************************************

    System.out.println("\n\n\n\t\t\t Decryption **************************");

    File fi= new File("D:\\project\\en.txt");
    BufferedReader br = new BufferedReader(new FileReader(fi));
    String doi = br.readLine();
    
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
     //if(e%2==0)
     //{
      int dn=(int) ei/2;
      dl = new int[dn];
      dr = new int[dn];
   System.out.print("dleft: "); 
      for(int i=0;i<dn;i++)
      {
       dl[i] = dascii[i];
       System.out.print(dl[i]+" "); 
      }
      System.out.println(); 
   System.out.print("dright: "); 
      for(int i=dn,j=0;i<ei && j<dn;i++,j++)
      {
     
       dr[j] = dascii[i];
       System.out.print(dr[j]+" "); 
      }
       System.out.println(); 
     //}
  //****************************************************
  /*   else
     {
      int dm=(int) e/2;
      dl = new int[dm];
      dr = new int[dm+1];
      for(int i=0;i<dm;i++)
      {
       dl[i] = dascii[i];
      }
      for(int i=dm-1,j=0;i<e && j<dm;i++,j++)
      {
       dr[j] = dascii[i];
      }
     }*/
 //****************************************************
   
   int dfunct[] = new int[dl.length];
   int dtemp[] = new int[dl.length];

     for(int j=nk-1;j>=0;j--)                                           //exception
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
  //*************
    /* for(int i= 0,j=0; i<dr.length && j<dl.length; i++,j++)
     {
      
      System.out.print(dl[j]+" "+dr[i]+" ");
     }*/
  //*************
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


// ---------------------------------------------------------------------------------------------




/*

    // public void Decryption(string s)
     //{
     System.out.println("\n\n\n\t\t\t Decryption **************************");
     int dascii[] = new int[o.length]; 
     //System.out.print("dascii array: "); 
     for(int i=0;i<o.length;i++)
     {
       dascii[i]= (int) o[i];
       System.out.print(dascii[i]+" ");
     }
     System.out.println();
     int dl[];
     int dr[];
     int e=o.length;
     //if(e%2==0)
     //{
      int dn=(int) e/2;
      dl = new int[dn];
      dr = new int[dn];
   System.out.print("dleft: "); 
      for(int i=0;i<dn;i++)
      {
       dl[i] = dascii[i];
       System.out.print(dl[i]+" "); 
      }
      System.out.println(); 
   System.out.print("dright: "); 
      for(int i=dn,j=0;i<e && j<dn;i++,j++)
      {
     
       dr[j] = dascii[i];
       System.out.print(dr[j]+" "); 
      }
       System.out.println(); 
     //}
  //****************************************************
     else
     {
      int dm=(int) e/2;
      dl = new int[dm];
      dr = new int[dm+1];
      for(int i=0;i<dm;i++)
      {
       dl[i] = dascii[i];
      }
      for(int i=dm-1,j=0;i<e && j<dm;i++,j++)
      {
       dr[j] = dascii[i];
      }
     }*/
 //****************************************************
 /*   
   int dfunct[] = new int[dl.length];
   int dtemp[] = new int[dl.length];

     for(int j=nk-1;j>=0;j--)                                           //exception
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
  //*************
     for(int i= 0,j=0; i<dr.length && j<dl.length; i++,j++)
     {
      
      System.out.print(dl[j]+" "+dr[i]+" ");
     }*/
  //*************
 /*    System.out.println(); 
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
    System.out.println(); */
    // }



}
}




class keys
{  
   int generateRandomDigits(int r) 
   {
    int m = (int) Math.pow(10, r - 1);                   //math.pow(1arg,2arg) means 10 to the power of n-1//
    int x = m + new Random().nextInt(9 * m);            /*100000<=n<=900000*/ //means m is 10 to the power something//
    return x;
   }
}














import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.UUID;

class fe extends keys
{
public static void main(String args[]) throws FileNotFoundException,IOException,NullPointerException
{  

while(true)
{

   String s="";
   String s1="";
   //Scanner sc = new Scanner(System.in);
   //s="hello this is ak"; //sc.nextLine();
  try
  {
  FileReader fis = new FileReader("D:\\project\\inp.txt");
       
  BufferedReader bis = new BufferedReader(fis);
  
  new FileOutputStream("D:\\project\\inp.txt").close();
  while ((s1 = bis.readLine())!= null)
  {
   s = s+s1; //bis.readLine()
   System.out.println(s);
  System.out.println(s.length());
  //}
  System.out.println(s);
  System.out.println(s.length());
  bis.close();
  //}
  
  

   s=s.toUpperCase();
   int x=s.length();;
   int g=2;
   char space =' ';
   keys h=new keys();
   //if(s.length()%2==0)
   //{
   //System.out.println("String length:" + x);
   //System.out.println(s);
   //}
   if(s.length()%2!=0)
   {
   s += space; 
   x=s.length();
   //System.out.println("String length:" + x);
   //System.out.println(s);
   }
   int ascii[] = new int[s.length()];

   //System.out.print("ascii array: ")
 
   for(int i=0;i<s.length();i++)
     {
      
       ascii[i]= (int) s.charAt(i);
       //System.out.print(ascii[i]+" ");
       
     }
   //System.out.println();
   int k[];
   int l[];
   int r[];
   //int temp[];
   //int funct[];
  // if(x%2==0)
   //{
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
   //}

//****************************
  /* else
   {
    int m=(int) x/2;
    l = new int[m+1];
    r = new int[m+1];
    for(int i=0;i<m;i++)
    {
     l[i] = ascii[i];
    }
    for(int i=m,j=0;i<x && j<m+1;i++,j++)
    {
     r[j] = ascii[i];
    }
   } */

//*****************************
   //System.out.println("Enter no. of keys: ");   
   int nk = 10; 
   //sc.nextInt();
   k = new int[nk];
   for(int i=0;i<nk;i++)
   {
      k[i] = h.generateRandomDigits(g); //Math.abs(UUID.randomUUID().getMostSignificantBits());
   }
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
//**********
   /*  for(int i= 0,j=0; i<r.length && j<l.length; i++,j++)
     {
      System.out.print(l[i]+" "+r[i]+" ");
     }*/
//**********
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
     //Decryption(o);
     //}





//*********************************************************************************************

    System.out.println("\n\n\n\t\t\t Decryption **************************");

    File fi= new File("D:\\project\\en.txt");
    BufferedReader br = new BufferedReader(new FileReader(fi));
    String doi = br.readLine();
    
    //new FileOutputStream("D:\\project\\en.txt").close();

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
     //if(e%2==0)
     //{
      int dn=(int) ei/2;
      dl = new int[dn];
      dr = new int[dn];
   System.out.print("dleft: "); 
      for(int i=0;i<dn;i++)
      {
       dl[i] = dascii[i];
       System.out.print(dl[i]+" "); 
      }
      System.out.println(); 
   System.out.print("dright: "); 
      for(int i=dn,j=0;i<ei && j<dn;i++,j++)
      {
     
       dr[j] = dascii[i];
       System.out.print(dr[j]+" "); 
      }
       System.out.println(); 
     //}
  //****************************************************
  /*   else
     {
      int dm=(int) e/2;
      dl = new int[dm];
      dr = new int[dm+1];
      for(int i=0;i<dm;i++)
      {
       dl[i] = dascii[i];
      }
      for(int i=dm-1,j=0;i<e && j<dm;i++,j++)
      {
       dr[j] = dascii[i];
      }
     }*/
 //****************************************************
   
   int dfunct[] = new int[dl.length];
   int dtemp[] = new int[dl.length];

     for(int j=nk-1;j>=0;j--)                                           //exception
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
  //*************
    /* for(int i= 0,j=0; i<dr.length && j<dl.length; i++,j++)
     {
      
      System.out.print(dl[j]+" "+dr[i]+" ");
     }*/
  //*************
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


// ---------------------------------------------------------------------------------------------




/*
    // public void Decryption(string s)
     //{
     System.out.println("\n\n\n\t\t\t Decryption **************************");
     int dascii[] = new int[o.length]; 
     //System.out.print("dascii array: "); 
     for(int i=0;i<o.length;i++)
     {
       dascii[i]= (int) o[i];
       System.out.print(dascii[i]+" ");
     }
     System.out.println();
     int dl[];
     int dr[];
     int e=o.length;
     //if(e%2==0)
     //{
      int dn=(int) e/2;
      dl = new int[dn];
      dr = new int[dn];
   System.out.print("dleft: "); 
      for(int i=0;i<dn;i++)
      {
       dl[i] = dascii[i];
       System.out.print(dl[i]+" "); 
      }
      System.out.println(); 
   System.out.print("dright: "); 
      for(int i=dn,j=0;i<e && j<dn;i++,j++)
      {
     
       dr[j] = dascii[i];
       System.out.print(dr[j]+" "); 
      }
       System.out.println(); 
     //}
  //****************************************************
     else
     {
      int dm=(int) e/2;
      dl = new int[dm];
      dr = new int[dm+1];
      for(int i=0;i<dm;i++)
      {
       dl[i] = dascii[i];
      }
      for(int i=dm-1,j=0;i<e && j<dm;i++,j++)
      {
       dr[j] = dascii[i];
      }
     }*/
 //****************************************************
 /*   
   int dfunct[] = new int[dl.length];
   int dtemp[] = new int[dl.length];
     for(int j=nk-1;j>=0;j--)                                           //exception
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
  //*************
     for(int i= 0,j=0; i<dr.length && j<dl.length; i++,j++)
     {
      
      System.out.print(dl[j]+" "+dr[i]+" ");
     }*/
  //*************
 /*    System.out.println(); 
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
    System.out.println(); */
    // }
  }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }

 }

}
}




class keys
{  
   int generateRandomDigits(int r) 
   {
    int m = (int) Math.pow(10, r - 1);                   //math.pow(1arg,2arg) means 10 to the power of n-1//
    int x = m + new Random().nextInt(9 * m);            /*100000<=n<=900000*/ //means m is 10 to the power something//
    return x;
   }
}










import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.UUID;

public class BeepProducer {

	public static void main(String[] args) throws FileNotFoundException,IOException
      {
       try 
       {
       FileReader fis = new FileReader("C:\\Users\\bhuva\\proj\\en.txt");
       BufferedReader bis = new BufferedReader(fis);
       String s = bis.readLine();
       int x = s.length();
      

		//int beepCount = 10;
		for (int i = 0; i < x ; ++i) 
               {
			System.out.println("Beep : " + i);
			java.awt.Toolkit.getDefaultToolkit().beep();
			try 
                        {
				Thread.sleep(1000);
			} 
                        catch (InterruptedException e)
                        {
                        
			}
		}
        bis.close();
        }
        catch(FileNotFoundException e) {
        }
	} 
} 
