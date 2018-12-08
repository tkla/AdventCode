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
    
    public static int FirstRepeat(String filename){
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int count = 0;
        while(true){
            try {
                BufferedReader in = new BufferedReader(new FileReader (filename));
                String number;
                while ((number = in.readLine()) != null){
                    count += Integer.parseInt(number);
                    if (frequency.containsKey(count)) {
                        return frequency.get(count);
                    }
                    else{
                        frequency.put(count, count);
                    }
                }
            }
            catch(FileNotFoundException fnfe){
                System.out.println(fnfe);
            }
            catch(IOException ioexcept){
                 System.out.println(ioexcept);
            }
        }

    }
    
    
    public static void  main(String[] args){
        System.out.println(count("numbers"));
        System.out.println(FirstRepeat("numbers"));
        
    }
}