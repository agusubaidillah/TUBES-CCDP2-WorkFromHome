/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renaldi
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
   
      Obat Obat1 = new Obat("Paracetamol","Tablet", 20000);
      Obat Obat2 = new Obat("Mylanta","Sirup", 60000);

      Obat Obat3 = new Obat("Ambeven","Tablet", 10000);

      Obat Obat4 = new Obat("Diapet","Kapsul", 8000);
      Obat Obat5 = new Obat("OBH Combi","Sirup", 20000);

      Obat Obat6 = new Obat("Decolgen","Tablet", 8000);
      Obat Obat7 = new Obat("Oskadon SP","Tablet", 7000);

      Obat1.add(Obat2);
      Obat1.add(Obat3);

      Obat2.add(Obat6);
      Obat2.add(Obat7);

      Obat3.add(Obat4);
      Obat3.add(Obat5);

      //print all employees of the organization
      System.out.println(Obat1); 
      
      for (Obat headObat : Obat1.getSubordinates()) {
         System.out.println(headObat);
         
         for (Obat obat : headObat.getSubordinates()) {
            System.out.println(obat);
         }
      }		
   }
}