package kasus3;
import java.util.Scanner;

public class OperasiTextFieldInt {
    public static void main(String [] args) {
        int inputan;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("masukkan inputan : ");
        inputan = keyboard.nextInt();
    }
}

/*public class OperasiTextFieldInt {
    public static void main(String [] args) {
        int inputan;
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("masukkan inputan : ");
            inputan = keyboard.nextInt();
        }
        catch (Exception e) {
            System.out.println("inputan hanya boleh bilangan integer!");
        }
    }
}*/
