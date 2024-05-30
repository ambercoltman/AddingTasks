/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TasksTesting;

import com.mycompany.addingtasks.Tasks;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.String;
/**
 *
 * @author User
 */
public class TasksTesting {
    
    public TasksTesting() {
    }
    
    @Test
     void testtaskDescription(){
     System.out.println("Create Login to authenticate user." );
     
     Tasks user = new Tasks();
     
     boolean strExpected = true;
     String strActual = user.taskDescription;
     
     Assertions.assertEquals(strExpected, strActual);
    }
    
     @Test
     void testCorrectTaskDescription(){
         System.out.println("Success");
         Tasks user = new Tasks();
         
         Assertions.assertTrue(user.checkTaskDescription("Create Login to authenticate user."));
     }
     
     @Test
     void testIncorrectUsername(){
         System.out.println("Failure");
         Tasks user = new Tasks();
         
         Assertions.assertFalse(user.checkTaskDescription("Create Add Task feature to add task users."));
     }
}
   

