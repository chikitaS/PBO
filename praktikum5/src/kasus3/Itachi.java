package kasus3;
//class Itachi subclass dari class Rikudo dan superclass dari class Sasuke
public class Itachi extends Rikudo {
	private String KekkeiGenkai = "Susanoo";
	//super.Dojutsu digunakan untuk mengambil nilai dari variabel yang ada di dalam class induk
	//artinya nilai yang diambil adalah Dojutsu yang berasal dari class Rikodo
	private String Dojutsu = super.Dojutsu;
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}
	void printDojutsu() {
		System.out.println(this.Dojutsu);
		setDojutsu();//untuk mengubah nilai this.Dojutsu
		System.out.println(this.Dojutsu);
	}
	
	//setter dari atribut Dojutsu
	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}
}
