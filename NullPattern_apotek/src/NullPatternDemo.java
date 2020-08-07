public class NullPatternDemo {
   public static void main(String[] args) {

      AbstractObat obat1 = ObatFactory.getObat("Oskadon");
      AbstractObat obat2 = ObatFactory.getObat("Paracetamol");
      AbstractObat obat3 = ObatFactory.getObat("Vitacimin");
      AbstractObat obat4 = ObatFactory.getObat("Abotil");

      System.out.println("Obat-Obatan di bawah");
      System.out.println(obat1.getName());
      System.out.println(obat2.getName());
      System.out.println(obat3.getName());
      System.out.println(obat4.getName());
   }
}