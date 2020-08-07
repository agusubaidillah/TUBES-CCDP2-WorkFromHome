/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class Apotek implements JenisObat {
	
   JenisObat[] parts;

   public Apotek(){
      parts = new JenisObat[] {new Sirup(), new Kapsul(), new Tablet()};		
   } 


   @Override
   public void accept(JenisObatVisitor jenisObatVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(jenisObatVisitor);
      }
      jenisObatVisitor.visit(this);
   }
}