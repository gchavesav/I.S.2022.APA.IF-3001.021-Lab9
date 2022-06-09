/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.annotations.Test;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class BTreeNGTest {

    @Test
    public void test() {
        try {
            BTree btree = new BTree();
            for (int i = 0; i <10; i++) {  
                btree.add(util.Utility.random(50));
            }
            System.out.println(btree.toString());
            System.out.println("BTree size: "+btree.size());
            for (int i = 0; i < 10; i++) {
                int value = util.Utility.random(50);
                System.out.println(btree.contains(value)
                        ?"The value ["+value+"] exists in binary tree, "
                        //+"node height: "+btree.height(value)
                        :"The value ["+value+"] does not exist in binary tree"                
                );   
            }
            System.out.println("Binary Tree Height: "+btree.height());
            //System.out.println("getLeaf(): "+btree.getLeaf(btree.getRoot()));
            
            for (int i = 0; i < 10; i++) {
                int value = util.Utility.random(50);
                if(btree.contains(value)){
                    System.out.println("The value ["+value+"] was deleted");
                    btree.remove(value);
                }
            }
            System.out.println(btree.toString());
            
        } catch (TreeException ex) {
            Logger.getLogger(BTreeNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
