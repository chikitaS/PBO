package soal3;

class KelasSatu
{	//initialization block //men-set nilai awal dari objek saat deklarasi
	{	
		System.out.println(11);//menampilkan output 11 
	}
	//static initialization block //hanya bisa dipanggil satu kali ketika ojbek di deklarasi
	//jika ada objek batu di dekralasi maka static initialization block tidak bisa dipanggil kembali
	//static initialization block akan muncul terlebih dahulu sebagai output dari initialization block
	static {
		System.out.println(2);
	}
	/* constructors*/
	public KelasSatu(int i) {
		System.out.println(3);
	}
	public KelasSatu() {
		System.out.println(4);
	}
}

