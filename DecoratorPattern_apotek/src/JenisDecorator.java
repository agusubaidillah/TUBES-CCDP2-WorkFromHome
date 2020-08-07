public class JenisDecorator extends NamaDecorator {

   public JenisDecorator(Nama decoratedNama) {
      super(decoratedNama);		
   }

   @Override
   public void draw() {
      decoratedNama.draw();	       
      setJenis(decoratedNama);
   }

   private void setJenis(Nama decoratedNama){
      System.out.println("Jenis Obat : Tablet");
   }
}