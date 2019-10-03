/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise2;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String args[]){
         String skey;
         String[] keys ={"123456",
                         "170131",
                         "178888"
                     };
     String[] names ={"Hassan",
                      "Darshen",
                      "Aaron"
                      };

     HashMap<String,String> hm = new HashMap<String,String>();
     for(int i=0; i<keys.length; i++)  //Stores data in hash table
       hm.put(keys[i],names[i]);
       
      skey=JOptionPane.showInputDialog("Enter Search Key");
      
      JOptionPane.showMessageDialog(null,"The student's name is " +
         hm.get(skey));
      
    } 
}
