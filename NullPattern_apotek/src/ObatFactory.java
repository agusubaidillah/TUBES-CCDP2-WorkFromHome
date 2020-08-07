public class ObatFactory {
	
   public static final String[] names = {"Oskadon", "Decolgen", "Vitacimin"};

   public static AbstractObat getObat(String name){
   
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealObat(name);
         }
      }
      return new NullObat();
   }
}