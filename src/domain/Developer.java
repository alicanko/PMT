/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

//import java.util.List;

/**
 *
 * @author lenovo
 */
public class Developer {
   String name;
   String title;
   int developerId;
   //List<int> assignedProjectIds;
   
   public String getName(){
       return name;
   }
   
   public String getTitle(){
       return title;
   }
   
   public int getDeveloperId(){
       return developerId;
   }
}
