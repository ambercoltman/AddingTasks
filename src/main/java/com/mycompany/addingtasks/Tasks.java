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
     public String taskDetails;
     public int totalHours;


  public boolean checkTaskDescription(String taskDescription){
     if(taskDescription.length() >50){
           JOptionPane.showMessageDialog(null,"Task successfully captured.");
    }else{
           JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters.");
    }
    return false;
    }
    
}  

//public String createTaskID(String taskID){


//public String printTaskDetails(String taskDetails){  


//public int returnTotalHours(int totalHours){

  