public abstract class Kapsul implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract int harga();
}