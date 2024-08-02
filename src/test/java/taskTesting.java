/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.addingtasks.Tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class taskTesting {
    
    public taskTesting() {
        String[] developerDetails = new String[4];
        developerDetails[0] = "Mike Smith";
        developerDetails[1] = "Edward Harrison";
        developerDetails[2] = "Samantha Paulson";
        developerDetails[3] = "Glenda Oberholzer";
        
        String[] taskName = new String[4];
        taskName[0] = "Create Login";
        taskName[1] = "Create Add Features";
        taskName[2] = "Create Reports";
        taskName[3] = "Add Arrays";
        
        String[] taskDuration = new String[4];
        taskDuration[0] = "5";
        taskDuration[1] = "8";
        taskDuration[2] = "2";
        taskDuration[3] = "11";
           
    }
    
    @Test
    public void testDeveloperDetails(){
       Tasks test = new Tasks(); 
       
        String strExpected = "Mike Smith\n Edward Harrison\n Samantha Paulson\n Glenda Oberholzer\n";
        String strActual = " ";
     
     Assertions.assertEquals(strExpected, strActual);
    }
    
    @Test
    public void longestTask(){
       Tasks test = new Tasks();
       
       String strExpected = "Glenda Oberholzer\n 11";
       String strActual = test.longestTasks();
       
       Assertions.assertEquals(strExpected, strActual);
    }
    
    
}
