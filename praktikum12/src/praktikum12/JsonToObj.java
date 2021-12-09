package praktikum12;

import java.io.FileReader;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;

public class JsonToObj {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            ArrayList<DataBarang> barang = gson.fromJson(
                    new FileReader("C:\\Users\\LENOVO\\Documents\\POLBAN\\SMS 3\\PBO PRAKTEK\\praktikum12\\src\\praktikum12\\barang.json"),
                    new TypeToken<ArrayList<DataBarang>>() {}.getType()//digunakan untuk memparsing gson ke objek dengan tipe data list
            );
            for(int i=0;i<barang.size();i++){
                System.out.println("Barang "+(i+1)+" [ "+barang.get(i).toString() + "]");
            }
        }catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        }
    }

}
