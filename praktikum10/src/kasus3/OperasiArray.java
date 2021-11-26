package kasus3;

/*public class OperasiArray {
    public static void main(String[] args) {
        int a[] = new int[5];
            a[5] = 100 ;
    }
}*/

public class OperasiArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100 ;
            System.out.println("Indeks array tidak melebihi batas");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebihi batas");
        }
    }
}
