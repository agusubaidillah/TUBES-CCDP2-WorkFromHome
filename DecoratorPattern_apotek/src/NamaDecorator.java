public abstract class NamaDecorator implements Nama {
   protected Nama decoratedNama;

   public NamaDecorator(Nama decoratedNama){
      this.decoratedNama = decoratedNama;
   }

   public void draw(){
      decoratedNama.draw();
   }	
}