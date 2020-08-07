/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

import java.util.ArrayList;
import java.util.List;

public class FilterPattern_apotek {
   public static void main(String[] args) {
      List<Apoteker> persons = new ArrayList<Apoteker>();

      persons.add(new Apoteker("Ahmad Jaelani","Laki-laki", "Single"));
      persons.add(new Apoteker("Jujun Junaedi", "Laki-laki", "Married"));
      persons.add(new Apoteker("Kiki Amalia", "Perempuan", "Married"));
      persons.add(new Apoteker("Fitri Nurhalizah", "Perempuan", "Single"));
      persons.add(new Apoteker("Tatang Ibrar", "Laki-laki", "Single"));
      persons.add(new Apoteker("Yongki Permana", "Laki-laki", "Single"));

      Data male = new Lakilaki();
      Data female = new Perempuan();
      Data single = new Single();
      Data singleMale = new AndData(single, male);
      Data singleOrFemale = new OrData(single, female);

      System.out.println("Laki-laki: ");
      printPersons(male.meetCriteria(persons));

      System.out.println("\nPerempuan: ");
      printPersons(female.meetCriteria(persons));

      System.out.println("\nSingle Males: ");
      printPersons(singleMale.meetCriteria(persons));

      System.out.println("\nSingle Or Females: ");
      printPersons(singleOrFemale.meetCriteria(persons));
   }

   public static void printPersons(List<Apoteker> persons){
   
      for (Apoteker apoteker : persons) {
         System.out.println("Apoteker : [ Nama : " + apoteker.getName() + ", Jenis Kelamin : " + apoteker.getGender() + ", Status : " + apoteker.getMaritalStatus() + " ]");
      }
   }      
}
