/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class Tablet extends JenisObat {

   public Tablet(){
     type = "Tablet";
   }

   @Override
   public void draw() {
      System.out.println("Inside Tablet::draw() method.");
   }
}