package kasus3;
import java.io.File;
import java.io.FileReader;
//import java.io.FileNotFoundException;

/*public class OperasiFile {
    public static void main(String args[]) {
            File file = new File("C://Users//LENOVO//Documents//KoTA 314_SRS_SD");
            FileReader fr = new FileReader(file);
    }
}*/

public class OperasiFile {
    public static void main(String args[]) {
        try {
            // Following file does not exist
            File file = new File("C://Users//LENOVO//Documents//KoTA 314_SRS_SD");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
    }
}
