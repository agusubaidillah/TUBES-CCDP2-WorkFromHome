/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class VisitorPatternDemo {
   public static void main(String[] args) {

      JenisObat apotek = new Apotek();
      apotek.accept(new JenisObatDisplayVisitor());
   }
}