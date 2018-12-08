import java.util.*;
import java.io.*;
public class frequency{
    public static int count(String filename){
        int count = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader (filename));
            String number;
            while ((number = in.readLine()) != null){
                count += Integer.parseInt(number);
                
            }
        }
        catch(FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
        catch(IOException ioexcept){
             System.out.println(ioexcept);
        }
        return count;   
    }
    
    
    
    
    public static void  main(String[] args){
        System.out.println(count("numbers"));
        
    }
}