public class Stock {
    
   private String nama = "Paracetamol";
   private int kuantitas = 120;

   public void buy(){
      System.out.println("Stock [ Nama: "+nama+",Kuantitas: " + kuantitas +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Nama: "+nama+",Kuantitas:  "+ kuantitas +" ] sold");
   }   
}