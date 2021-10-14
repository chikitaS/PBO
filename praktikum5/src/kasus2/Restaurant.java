package kasus2;

public class Restaurant {
	//membuat atribut menuMakanan untuk bisa mengakses class Makanan  
	private Makanan[] menuMakanan;
	
	//dipindahkan ke class Makanan dengan tujuan agar class Restaurant ->
	//tidak terlalu mempunyai banyak responsibility
	//di class Makanan sebuah atribut dijadikan private menyesusaikan di buku core java 4.10
	//dimana data harus selalu diprivate untuk meminimalisir perubahan isi variabel
	/*	public String[] nama_makanan;
		public double[] harga_makanan;
		public int[] stok;
	 */
	
	//dijadikan private disesuaikan dengan di buku core java 4.10
	/*public static byte id=0;*/
	private static byte id=0;
	public Restaurant() {
		menuMakanan = new Makanan[10];
		//dikarenakan ada perpindahan atribut ke class Makanan
		//maka tidak diperlukan inisialiasi atribut tersebut di constructur Restaurant
		/*	nama_makanan = new String[10];
			harga_makanan = new double[10];
			stok = new int[10];
		*/
	}
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menuMakanan[id] = new Makanan(nama,harga,stok);
		/*	this.nama_makanan[id] = nama;
			this.harga_makanan[id] = harga;
			this.stok[id] = stok;
		*/
	}
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++) {
			if(!isOutOfStock(i)){
				this.menuMakanan[i].tampilmakanan();
				//this.menuMakanan[id]
				/*System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);*/
			}
		}
	}
	public boolean isOutOfStock(int id){
		//if(stok[id] == 0)
		if(menuMakanan[id].getStok()==0){
			return true;
		}else{
			return false;
		}
	}
	public static void nextId(){
		id++;
	}
}

