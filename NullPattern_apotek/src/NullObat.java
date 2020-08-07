public class NullObat extends AbstractObat {

   @Override
   public String getName() {
      return "Maaf Obat yang dicari habis";
   }

   @Override
   public boolean isNil() {
      return true;
   }
}
