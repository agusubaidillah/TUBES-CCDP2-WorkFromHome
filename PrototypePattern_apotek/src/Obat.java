/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

import java.util.Hashtable;

public class Obat {
	
   private static Hashtable<String, JenisObat> obatMap  = new Hashtable<String, JenisObat>();

   public static JenisObat getObat(String obatId) {
      JenisObat Obat = obatMap.get(obatId);
      return (JenisObat) Obat.clone();
   }

   // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   
   public static void loadObat() {
      Kapsul kapsul = new Kapsul();
      kapsul.setId("1");
      obatMap.put(kapsul.getId(),kapsul);

      Sirup sirup = new Sirup();
      sirup.setId("2");
      obatMap.put(sirup.getId(),sirup);

      Tablet tablet = new Tablet();
      tablet.setId("3");
      obatMap.put(tablet.getId(), tablet);
   }
}
