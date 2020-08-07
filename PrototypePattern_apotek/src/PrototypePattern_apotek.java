/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class PrototypePattern_apotek {
   public static void main(String[] args) {
      Obat.loadObat();

      JenisObat clonedObat = (JenisObat) Obat.getObat("1");
      System.out.println("Jenis Obat : " + clonedObat.getType());		

      JenisObat clonedObat2 = (JenisObat) Obat.getObat("2");
      System.out.println("Jenis Obat : " + clonedObat2.getType());		

      JenisObat clonedObat3 = (JenisObat) Obat.getObat("3");
      System.out.println("Jenis Obat : " + clonedObat3.getType());		
   }
}
