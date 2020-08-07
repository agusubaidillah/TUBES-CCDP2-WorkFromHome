/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class Kapsul extends JenisObat {

   public Kapsul(){
     type = "Kapsul";
   }

   @Override
   public void draw() {
      System.out.println("Inside Kapsul::draw() method.");
   }
}
