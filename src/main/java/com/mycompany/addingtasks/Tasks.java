
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
     public String developersDetails;
     public String taskNameList;
     public int taskDuration;
  
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
    
  
    
    public static String Options[][] = new String[6][1];
    public static void optionChoices(){
        Options[0][1]= "Done Tasks";
        Options[1][1]= "Longest Task";
        Options[2][1]= "Search by task";
        Options[3][1]= "Search by developer";
        Options[4][1]= "Display Report";
        Options[5][1]= "Exit";
    }
    public static String List[][] = new String[4][4];
    public static void arrayList(){
      List[0][0]="Mike Smith";
      List[0][1]="Create Login";
      List[0][2]="5";
      List[0][3]="To Do";
      List[1][0]="Edward Harrison";
      List[1][1]="Create Add Features";
      List[1][2]="8";
      List[1][3]="Doing";
      List[2][0]="Samantha Paulson";
      List[2][1]="Create Reports";
      List[2][2]="2";
      List[2][3]="Done";
    }
    
    public String doneTasks(){
      JOptionPane.showMessageDialog(null, "Done Tasks:"+"\n"+ "Developer:"+ List[2][0]+
              "\n"+"Task Name:"+ List[2][1]+"\n"+ "Task Duration:"+ List[2][3]);  
       return null;  
    }

    
    public String longestTasks(){
      JOptionPane.showMessageDialog(null, "The longest task:"+"\n"+"Developer"+ List[1][0]+
              "\n"+ "Task Name:"+ List[1][1]+"\n"+ "Task Duration:"+ List[1][2]);  
       return null;
    }
    
    public String searchTask(){
        
       return null;
        
    }
    
    public String searchDeveloper(){
        
       return null;
        
    }
    
    public String displayReport(){
        JOptionPane.showMessageDialog(null, "Done Tasks:"+"\n"+ "Developer:"+ List[2][0]+
                  "\n"+"Task Name:"+ List[2][1]+"\n"+ "Task Duration:"+ List[2][3]+"\n" +
                  "The longest task:"+"\n"+"Developer"+ List[1][0]+"\n"+ "Task Name:"+ 
                  List[1][1]+"\n"+ "Task Duration:"+ List[1][2]);
       return null;
        
    }
}
            /*Referencing 
            Farrel,J.2023.Java Programming Tenth Edition.Boston: Cengage
            */  

                          