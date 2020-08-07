import java.util.ArrayList;
import java.util.List;

public class Obat {
   private String nama;
   private String jenis;
   private int harga;
   private List<Obat> subordinates;

   // constructor
   public Obat(String nama,String jenis, int harga) {
      this.nama = nama;
      this.jenis = jenis;
      this.harga = harga;
      subordinates = new ArrayList<Obat>();
   }

   public void add(Obat e) {
      subordinates.add(e);
   }

   public void remove(Obat e) {
      subordinates.remove(e);
   }

   public List<Obat> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Obat :[ Nama : " + nama + ", Jenis : " + jenis + ", Harga :" + harga+" ]");
   }   
}