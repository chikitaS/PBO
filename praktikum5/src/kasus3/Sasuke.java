package kasus3;
//class Sasuke adalah subclass dari class itachi
public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	void printDojutsu() {
		//penjelasan fungsi super di comment itachi.java
		//artinya nilai yang diambil adalah printDojutsu yang berasal dari class Itachi
		super.printDojutsu();
		System.out.println(this.Dojutsu);
	}
}
