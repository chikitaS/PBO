package kasus3;
import java.util.Scanner;
/*public class OperasiPembagian {
    public static void main(String [] args) {
        int pembilang,pembagi;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pembilang = ");
        pembilang = input.nextInt();
        System.out.println("Masukkan angka pembagi = ");
        pembagi = input.nextInt();
        System.out.println("Pembagian " + pembilang + "/" + pembagi + " adalah = " + (pembilang/pembagi));
    }
}*/


public class OperasiPembagian {
    public static void main(String [] args) {
        int pembilang,pembagi;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pembilang = ");
        pembilang = input.nextInt();
        System.out.println("Masukkan angka pembagi = ");
        pembagi = input.nextInt();
        try {
            System.out.println("Pembagian " + pembilang + "/" + pembagi + " adalah = " + (pembilang/pembagi));
        }
        catch (Exception e) {
            System.out.println("pembagi tidak boleh angka nol!!" );
        }
    }
}

