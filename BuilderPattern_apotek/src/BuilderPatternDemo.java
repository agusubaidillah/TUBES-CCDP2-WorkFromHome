public class BuilderPatternDemo {
   public static void main(String[] args) {
   
      ObatBuilder obatBuilder = new ObatBuilder();

      Obat obatSirup = obatBuilder.prepareObatSirup();
      System.out.println("Obat Sirup");
      obatSirup.showItems();
      System.out.println("Total: " + obatSirup.getTotal());

      Obat obatTablet = obatBuilder.prepareObatTablet();
      System.out.println("\n\nObat Tablet");
      obatTablet.showItems();
      System.out.println("Total: " + obatTablet.getTotal());
      
      Obat obatKapsul = obatBuilder.prepareObatKapsul();
      System.out.println("\n\nObat Kapsul");
      obatKapsul.showItems();
      System.out.println("Total: " + obatKapsul.getTotal());
   }
}