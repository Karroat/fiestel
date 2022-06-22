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
        String l[] = message.substring(0, messageMid);
        String r[] = message.substring(messageMid);

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

