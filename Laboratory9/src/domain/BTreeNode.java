/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class BTreeNode {
    public Object data;
    public BTreeNode left, right;
    
    //Constructor
    public BTreeNode(Object data){
        this.data = data;
        this.left=this.right=null;
    }
}
