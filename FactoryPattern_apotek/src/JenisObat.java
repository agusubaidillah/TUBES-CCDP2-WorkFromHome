/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class JenisObat {
	
   //use getShape method to get object of type shape 
   public Jenis getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("Tablet")){
         return new Tablet();
         
      } else if(shapeType.equalsIgnoreCase("Kapsul")){
         return new Kapsul();
         
      } else if(shapeType.equalsIgnoreCase("Sirup")){
         return new Sirup();
      }
      
      return null;
   }
}