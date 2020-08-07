public class SingletonPatternDemo {
   public static void main(String[] args) {

     
      Apotek object = Apotek.getInstance();

    
      object.showMessage();
   }
}