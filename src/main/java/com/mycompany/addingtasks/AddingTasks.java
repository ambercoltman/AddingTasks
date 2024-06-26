/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addingtasks;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AddingTasks {

    public static void main(String[] args) {
     String taskNumber = "";
     String developerDetails = "";
     String taskName = "";
     String totalHours = "";
     String taskDetails = "";
     String developer = "";
     String taskId = "";
     String duration = "";
     String status = "";
     String done = "";
     
     
     
     /*Reference  Creating and USing Constructors
     Farrel(2023) states that to call a class you type to class name and assign it an object statement, 
     for example ' Employee chauffeur = new Employee();'
    */
     
      Tasks user = new Tasks();    
            /*
            McKenzie(2022)
             */
            String[] options1 = {"Option 1). Add tasks", "Option 2). Show report", "Option 3). Quit"}; //options1 is the first set of options that the user can pick from
            var selection = JOptionPane.showOptionDialog(null, "Welcome to EasyKanban","Option", 0, 3 , null, options1, options1[0]);

            /*Reference equivalence
            Farrell(2023) indicates that the double equal to sign is used to show the equivalence that the two expressions have, this equal to sign 
            is called the equivalency operator(==).
            */
            
            while(selection == 0){ 
                /*Reference while loop
                Farrell(2023) states that while loops are used when you want the body of your code to continue running as long as the boolean expressions stays true
                */
               /*Reference comparing to Zero
                Farrell(2023) indicates that it is faster to compare to zero than to any other value.
                */ 
               
                taskNumber = JOptionPane.showInputDialog(null,"Please enter the amount of tasks"); 
               
            String[] options2 = {"To Do", "Done", "Doing"}; //options2 is the second set of options that the user can pick from
            selection = JOptionPane.showOptionDialog(null, "Task Status","Status", 0, 3 , null, options2, options2[0]);
            
         
                developerDetails = JOptionPane.showInputDialog(null,"Please enter your first and last name");

                taskName = JOptionPane.showInputDialog(null,"Please enter your task name");

                user.taskDescription =JOptionPane.showInputDialog("Please enter the task description");

                totalHours = JOptionPane.showInputDialog(null, "Please enter the hours it took you to complete the task");
        
                JOptionPane.showMessageDialog(null, " Developer Details: " + developerDetails + "Task Number:" + taskNumber + "Task Name:" + taskName + "Task Description:" + user.taskDescription +"Task Duration:" + totalHours);
        
               }if(selection == 1){
                  JOptionPane.showMessageDialog(null,"Coming Soon");              
               
               }if(selection == 1 ){
               
               done = JOptionPane.showInputDialog(null, "Option 1).Developer Details" +"\n"+ "Option 2). Task Name" +"\n"+ "Option 3). Task Duration" +"\n"+ "Option 4).Task Status" +"\n"+ "Option 5). Search task by name" +"\n"+ "Option 6). Search task by developer" +"\n"+ "Option 7). Delete task by name");
               if(done == "Option 1). Developer Details"){
               JOptionPane.showMessageDialog(null, "Developer Details:" +"\n"+ developerDetails);
               }else if(done == "Option 2). Task Name"){
               JOptionPane.showMessageDialog(null, "Task Name:" +"\n"+ taskName);
               }else if(done == "Option 3). Task Duration"){
               JOptionPane.showMessageDialog(null, "Task Duration:" +"\n"+ totalHours);
               }else if(done == "Option 5). Search task by name"){
               JOptionPane.showMessageDialog(null, "Task:" +"\n"+ taskName);
               }else if(done == "Option 6). Search task by developer");
               JOptionPane.showMessageDialog(null, "Task:" +"\n"+ taskName);
               
               
               
               /*Reference equivalence
            Farrell(2023) indicates that the double equal to sign is used to show the equivalence that the two expressions have, this equal to sign 
            is called the equivalency operator(==).
            */  
        }
}
}
             
            /*Referencing 
            Farrell,J.2023.Java Programming Tenth Edition.Boston: Cengage
            McKenzie,C. 2022. Java's JOptionPane showOptionDialog by Example.(Version 1.0-SNAPSHOT)(computer program)Available at:https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Javas-JOptionPane-showOptionDialog-by-Example (Accessed 13 May 2024)
            */