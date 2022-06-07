/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import org.testng.annotations.Test;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class BTreeNGTest {

    @Test
    public void test() {
        BTree btree = new BTree();
        btree.add(20);
        btree.add(7);
        btree.add(10);
        btree.add(32);
        btree.add(15);
    }
    
}
