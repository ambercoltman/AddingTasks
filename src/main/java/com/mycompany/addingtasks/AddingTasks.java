/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addingtasks;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class AddingTasks {

    public static void main(String[] args) {
     String taskNumber = "";
     String developerDetails = "";
     String taskName = "";
     String totalHours = "";
     String taskDetails = "";
     Tasks user = new Tasks();
         
         
            String[] options1 = {"Option 1). Add tasks", "Option 2). Show report", "Option 3). Quit"};
            var selection = JOptionPane.showOptionDialog(null, "Welcome to EasyKanban","Option", 0, 3 , null, options1, options1[0]);

            while(selection == 0){
                
                taskNumber = JOptionPane.showInputDialog(null,"Please enter the amount of tasks"); 
               
            String[] options2 = {"To Do", "Done", "Doing"};          
            selection = JOptionPane.showOptionDialog(null, "Task Status","Status", 0, 3 , null, options2, options2[0]);
         
                developerDetails = JOptionPane.showInputDialog(null,"Please enter your first and last name");

                taskName = JOptionPane.showInputDialog(null,"Please enter your task name");

                user.taskDescription =JOptionPane.showInputDialog("Please enter the task description");

                totalHours = JOptionPane.showInputDialog(null, "Please enter the hours it took you to complete the task");
        
                JOptionPane.showMessageDialog(null, " Developer Details: " + developerDetails + "Task Number:" + taskNumber + "Task Name:" + taskName + "Task Description:" + user.taskDescription +"Task Duration:" + totalHours);
        
               }if(selection == 1){
                  JOptionPane.showMessageDialog(null,"Coming Soon");              
               }
               
        }
}