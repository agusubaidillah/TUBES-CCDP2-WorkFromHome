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

public class AndData implements Data {

   private Data data;
   private Data otherCriteria;

   public AndData(Data data, Data otherCriteria) {
      this.data = data;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Apoteker> meetCriteria(List<Apoteker> persons) {
   
      List<Apoteker> firstCriteriaPersons = data.meetCriteria(persons);		
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}
