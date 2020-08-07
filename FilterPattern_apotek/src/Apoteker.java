/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class Apoteker {
	
   private String nama;
   private String jenisKelamin;
   private String status;

   public Apoteker(String nama, String jenisKelamin, String status){
      this.nama = nama;
      this.jenisKelamin = jenisKelamin;
      this.status = status;		
   }

   public String getName() {
      return nama;
   }
   public String getGender() {
      return jenisKelamin;
   }
   public String getMaritalStatus() {
      return status;
   }	
}
