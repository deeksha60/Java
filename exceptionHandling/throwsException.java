package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsException {

    // throws will tells the compiler that this method may cause exception who ever use it should handle this
    static  void readFile() throws FileNotFoundException {
        FileReader fr=new FileReader("data.txt");
    }
    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

