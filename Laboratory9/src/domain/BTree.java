/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class BTree implements Tree {
    private BTreeNode root; //representa la unica entrada al arbol

    //Constructor
    public BTree(){
        this.root = null;
    }
    
    @Override
    public int size() throws TreeException {
        if(isEmpty()){
            throw new TreeException("Binary Tree is empty");
        }
        return size(root);
    }
    
    private int size(BTreeNode nodo){
        
        return 0;
    }

    @Override
    public void clear() {
        this.root = null;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public boolean contains(Object element) throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(Object element) {
        this.root = add(this.root, element);
    }
    
    private BTreeNode add(BTreeNode node, Object element){
        if(node==null){
            node = new BTreeNode(element);
        }else
            if(node.left==null){
                node.left = add(node.left, element);
            }else
                if(node.right==null){
                    node.right = add(node.right, element);
                }else{ //debemos establecer algun criterio para insertar
                    int value = util.Utility.random(99);
                    if(value%2==0){ //si el valor es par baje un nivel por la izq
                        node.left = add(node.left, element);
                    }else
                        node.right = add(node.right, element);
                }
        return node;
    }

    @Override
    public void remove(Object element) throws TreeException {
        if(isEmpty())
            throw new TreeException("Binary Tree is empty");
        root = remove(root,element);
    }
    
    private BTreeNode remove(BTreeNode node, Object element){
        
        return node;
    }

    @Override
    public int height(Object element) throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int height() throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object min() throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object max() throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String preOrder() throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String InOrder() throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrder() throws TreeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //preOrden: recorre el árbol de la forma: nodo-izq-der
    //inOrden: recorre el árbol de la forma: izq-nodo-der
    //postOrden: recorre el árbol de la forma: izq-der-nodo
    @Override
    public String toString() {
        if(isEmpty())
            return "Binary Tree is empty";
        String result = "BINARY TREE TOUR...\n";
//        result+="PreOrder: "+preOrder(root)+"\n";
//        result+="InOrder: "+inOrder(root)+"\n";
//        result+="PostOrder: "+postOrder(root)+"\n";
        return result;
    }
    
}
