package soal1;

public class Barang {
	private String kode_barang;
	private String nama_barang;
	private int stok;
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang= nama;
		stok= stk;
	}
	//getter dan setter dari metode enkapsulasi
	public String getKode_barang() { // digunakan untuk mengembalikan nilai dari atribut kode_barang
		return kode_barang;
	}
	public void setKode_barang(String kode_barang) { //digunakan untuk meng-setting nilai atribut kode_barang
		this.kode_barang = kode_barang;
	}
	public String getNama_barang() { // digunakan untuk mengembalikan nilai dari atribut nama_barang
		return nama_barang;
	}
	public void setNama_barang(String nama_barang) { //digunakan untuk meng-setting nilai dari atribut nama_barang
		this.nama_barang = nama_barang;
	}
	public int getStok() { // digunakan untuk mengembalikan nilai dari atribut stok_barang
		return stok;
	}
	public void setStok(int stok) { //digunakan untuk meng-setting nilai dari atribut stok_barang
		this.stok = stok;
	}
}


