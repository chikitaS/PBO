package soal1;

public class Inventori {
	Barang[] barangs;
	void initBarang() { // untuk menginisialisasi array barangs dengan indeksnya 2
	barangs = new Barang[2];
	barangs[0] = new Barang("001", "Baju", 10);
	barangs[1] = new Barang("002", "Celana", 20);
	}
	void showBarang() { //untuk menampilkan output dari array barangs indeks ke-0 dan indeks ke-1 
	System.out.println(barangs[0].getNama_barang() + "(" + barangs[0].getStok() + ")");
	System.out.println(barangs[1].getNama_barang() + "(" + barangs[1].getStok() + ")");
	}
	
	void pengadaan() { // untuk dilakukannya pengadaan barang baru
		initBarang();
		barangs[0].setStok(barangs[0].getStok() + 20);
		//barangs[0].stok -= 30;//Bisa juga dikurangi dong?
		//barangs[0].stok *= 30;//dikali juga bisa dong??
		showBarang();
	}
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
	}
}

