/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class IteratorPattern_apotek {
	
   public static void main(String[] args) {
      DataObat dataObat = new DataObat();

      for(Iterator iter = dataObat.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Nama Obat : " + name);
      } 	
   }
}
