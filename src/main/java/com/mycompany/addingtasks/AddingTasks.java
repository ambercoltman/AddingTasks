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
         Tasks user = new Tasks();
         
         String[] options1 = {"Option 1). Add tasks", "Option 2). Show report", "Option 3). Quit"};
         var selection = JOptionPane.showOptionDialog(null, "Welcome to EasyKanban","Option", 0, 3 , null, options1, options1[0]);
         
         if(selection == 0){
            JOptionPane.showInputDialog(null,"Please enter the amount of tasks"); 
            
            String[] options2 = {"To Do", "Done", "Doing"};          
            selection = JOptionPane.showOptionDialog(null, "Task Status","Status", 0, 3 , null, options2, options2[0]);
         
            JOptionPane.showInputDialog(null,"Please enter your first and last name");
          
            JOptionPane.showInputDialog(null,"Please enter your task name");

            user.taskDescription =JOptionPane.showInputDialog("Please enter the task description");
 
            JOptionPane.showInputDialog(null, "Please enter the hours it took you to complete the task");
         
         }
         if(selection == 1){
            JOptionPane.showMessageDialog(null,"Coming Soon"); 
         } 
         
         //task id 
         //user.taskID = JOptionPane.showInputDialog
         
         
                 
         
    }
}
