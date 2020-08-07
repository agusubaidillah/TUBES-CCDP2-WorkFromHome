public class ObatBuilder {

   public Obat prepareObatSirup (){
      Obat obat = new Obat();
      obat.addItem(new Mylanta());
      obat.addItem(new OBHCombi());
      return obat;
   }   

    public Obat prepareObatTablet (){
      Obat obat = new Obat();
      obat.addItem(new Decolgen());
      obat.addItem(new OskadonSP());
      return obat;
   }
    
    public Obat prepareObatKapsul (){
      Obat obat = new Obat();
      obat.addItem(new Diapet());
      return obat;
   }
}