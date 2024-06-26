
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addingtasks;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tasks {
   public void Tasks() {
     }
     public String taskDescription;
     public String taskID;
     public String taskName;
     public String taskNumber;
     public String developerDetails;
     public String taskDetails;
     public int totalHours;
     public String task;
     public String taskStatus;
  
     /*Reference if...else statement
     Farrell(2023) states that the if...else statement does one actions as long as the boolean expression is true, and if it is false it performs a different action
     */
    public boolean checkTaskDescription(String taskDescription){
       if(taskDescription.length() >50){ //this makes sure that the input the user enteres is not more than 50 characters
             JOptionPane.showMessageDialog(null,"Task successfully captured.");
      }else{
             JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters.");
      }
      return false;
      }
    
    public boolean task(String developerDetails, String taskName, String taskID, int totalHours, String taskStatus){
        this.developerDetails = developerDetails;
        this.taskName = taskName;
        this.taskID = taskID;
        this.totalHours = totalHours;
        this.taskStatus = taskStatus;
       return false;
        
      
}
    
    
}  

            /*Referencing 
            Farrel,J.2023.Java Programming Tenth Edition.Boston: Cengage
            */  

    