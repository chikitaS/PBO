package kasus2;

public class Makanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	//constructor
	public Makanan(String namaMakanan, double hargaMakanan, int stokMakanan) {
		this.nama_makanan = namaMakanan;
		this.harga_makanan = hargaMakanan;
		this.stok = stokMakanan;
	}
	//getter and setter
	public String getNama_makanan() {
		return nama_makanan;
	}
	public int getStok() {
		return stok;
	}
	
	public void tampilmakanan() {
		System.out.println(nama_makanan +"["+stok+"]"+"\tRp. "+harga_makanan);
	}
	
}
