/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116009_MuhamadRamdani
 */
public class FactoryPatternDemo {

   public static void main(String[] args) {
      JenisObat JenisObat = new JenisObat();

      Jenis obat1 = JenisObat.getShape("Tablet");
      obat1.draw();

      Jenis obat2 = JenisObat.getShape("Kapsul");
      obat2.draw();

      Jenis obat3 = JenisObat.getShape("Sirup");
      obat3.draw();
   }
}