public abstract class Tablet implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract int harga();
}