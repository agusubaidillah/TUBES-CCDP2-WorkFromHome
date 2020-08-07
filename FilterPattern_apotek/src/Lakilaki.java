/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

import java.util.ArrayList;
import java.util.List;

public class Lakilaki implements Data {

   @Override
   public List<Apoteker> meetCriteria(List<Apoteker> persons) {
      List<Apoteker> malePersons = new ArrayList<Apoteker>(); 
      
      for (Apoteker apoteker : persons) {
         if(apoteker.getGender().equalsIgnoreCase("Laki-laki")){
            malePersons.add(apoteker);
         }
      }
      return malePersons;
   }
}
