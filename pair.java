import java.util.Stack;
import java.util.*;
import java.io.*;
public class pair{
   public static int numPolymers(){
      int count = 0;
      BufferedReader in;
      Stack<Character> Result = new Stack<>();
      try{
         in  = new BufferedReader(new FileReader("polymer.txt"));
         String polymer;
         while ((polymer = in.readLine()) != null){
            for (int i = 0; i < polymer.length(); i++){
               char c = polymer.charAt(i);
               if (Result.empty()){
                  Result.push(c);
                  ++count;
               }else if (Math.abs(c - Result.peek()) == 32){
                  Result.pop();
                  --count;
               }else {
                  Result.push(c);
                  ++count;
               }
            }
         }
         System.out.println(Result);
         
         
      }
      
      catch ( FileNotFoundException fnfe){
         System.out.println(fnfe);
      } catch ( IOException ioexcept){
         System.out.println(ioexcept);
      }
      return count;
   }
   
   
   
   public static void main (String[] args) {
      System.out.println(numPolymers());
   }
}