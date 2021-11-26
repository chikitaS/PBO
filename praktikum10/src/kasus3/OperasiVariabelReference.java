package kasus3;

/*public class OperasiVariabelReference {
    public static void main(String [] args) {
        int angka;
        System.out.println("Variabel angka bernilai : " + angka);
    }
}*/


public class OperasiVariabelReference {
    public static void main(String [] args) {
        String nama;
        try {
            nama = new String();
            System.out.println("Variabel nama berisi : " + nama);
        }
        catch (Exception e) {
            System.out.println("variabel tidak diinisialisasi terlebih dahulu");
        }
    }
}
