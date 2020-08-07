/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class JenisObatDisplayVisitor implements JenisObatVisitor {

   @Override
   public void visit(Apotek apotek) {
      System.out.println("Menampilkan APOTEK");
   }

   @Override
   public void visit(Kapsul kapsul) {
      System.out.println("Menampilkan Obat Kapsul");
   }

   @Override
   public void visit(Tablet tablet) {
      System.out.println("Menampilkan Obat Tablet");
   }

   @Override
   public void visit(Sirup sirup) {
      System.out.println("Menampilkan Obat Sirup");
   }
}
