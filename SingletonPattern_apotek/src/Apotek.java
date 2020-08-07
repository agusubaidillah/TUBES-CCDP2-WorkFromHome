public class Apotek {

   //create an object of SingleObject
   private static Apotek instance = new Apotek();

   //make the constructor private so that this class cannot be
   //instantiated
   private Apotek(){}

   //Get the only object available
   public static Apotek getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("SELAMAT DATANG DI APOTEK KAMI!");
   }
}