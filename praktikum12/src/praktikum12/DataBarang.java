package praktikum12;

public class DataBarang {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private long weight;
    private long quantity;
    private long priceItem;
    private String productName;

    public String toString() {
        return  "Nama barang : "+ productName+" | "+"Kuantitas : "+quantity+" | "+"Berat : "+weight+" | "+"Kota : "+
                city.getDestination()+" | "+"Layanan : "+servicePackage.getService()+" | "+"harga : "+
                servicePackage.getValue()+" | "+"Total harga : "+((priceItem*quantity)+servicePackage.getValue());
    }
}

