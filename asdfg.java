import java.util.Scanner;

public class asdfg
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word & a squence of words: ");
      
      String s1 = in.next();
      String s2 = in.next();
      
      in.close();
      
      int counter = 0;
      
      for(int x=0; x<s1.length(); x++)
      {
         if(counter < s2.length())
         {
            if(s1.charAt(x) == s2.charAt(counter))
               counter++;
         }        
      }
      
      if (counter == s2.length())
         System.out.println("true");
      else
         System.out.println("false");
   }
}
