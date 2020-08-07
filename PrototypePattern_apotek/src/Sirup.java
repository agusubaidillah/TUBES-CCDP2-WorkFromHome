/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class Sirup extends JenisObat {

   public Sirup(){
     type = "Sirup";
   }

   @Override
   public void draw() {
      System.out.println("Inside Sirup::draw() method.");
   }
}
