/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class Tablet implements JenisObat {

   @Override
   public void accept(JenisObatVisitor jenisObatVisitor) {
      jenisObatVisitor.visit(this);
   }
}
