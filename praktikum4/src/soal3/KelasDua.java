package soal3;

class KelasDua
{	// initialization block
	{
	System.out.println(5);
	}
	public static void main(String[] args) {
		System.out.println(6);
		KelasSatu satu = new KelasSatu();// deklarasi objek "satu"
		KelasSatu dua = new KelasSatu(10);//deklarasi objek "dua"
	}
}
