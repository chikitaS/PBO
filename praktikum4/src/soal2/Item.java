package soal2;

public class Item {
	private String name;
	//constructor 1
	public Item() {
		name = "Ipin";
		System.out.println(this.name);
	}
	//constructor 2
	public Item(String name) {
		Item nama = new Item(); //membuat objek batu Item dengan di inisialisasi oleh constructor Item()
		//System.out.println(this.name);
	}
}

