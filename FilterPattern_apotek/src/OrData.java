/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

import java.util.List;

public class OrData implements Data {

   private Data data;
   private Data otherCriteria;

   public OrData(Data data, Data otherCriteria) {
      this.data = data;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Apoteker> meetCriteria(List<Apoteker> persons) {
      List<Apoteker> firstCriteriaItems = data.meetCriteria(persons);
      List<Apoteker> otherCriteriaItems = otherCriteria.meetCriteria(persons);

      for (Apoteker apoteker : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(apoteker)){
            firstCriteriaItems.add(apoteker);
         }
      }	
      return firstCriteriaItems;
   }
}
