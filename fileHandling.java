import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public fileHandling() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
//        to create file
        if (file.createNewFile()) {
            System.out.println("file created");
        } else
            System.out.println("file already exist");

//        to write to file
//        FileWriter fw = new FileWriter("demo.txt");
//        fw.write("we are learning");
//        fw.close();

//        reading from file
//        Scanner sc=new Scanner(file);
//        while (sc.hasNext()){
//            System.out.println(sc.nextLine());
//        }

//        deleting
        if(file.delete()){
            System.out.println("file deleted successfully");
        }
        else
            System.out.println("not deleted");

    }
}
