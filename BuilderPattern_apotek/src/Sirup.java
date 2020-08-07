public abstract class Sirup implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract int harga();
}