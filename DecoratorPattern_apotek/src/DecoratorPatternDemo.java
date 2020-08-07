public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Nama oskadon = new Oskadon();

      Nama jenisOskadon = new JenisDecorator(new Oskadon ());

      Nama jenisDecolgen = new JenisDecorator(new Decolgen());
      

   
      jenisOskadon.draw();

      
      jenisDecolgen.draw();
   }
}