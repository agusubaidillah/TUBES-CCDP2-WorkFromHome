import java.util.ArrayList;
import java.util.List;

public class Obat {
   private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

   public int getTotal(){
      int total = 0;
      
      for (Item item : items) {
         total += item.harga();
      }		
      return total;
   }

   public void showItems(){
   
      for (Item item : items) {
         System.out.print("Item : " + item.nama());
         System.out.print(", Packing : " + item.packing().pack());
         System.out.println(", Harga : " + item.harga());
      }		
   }	
}