/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;
import java.util.*;
/**
 *
 * @author xsamu
 */
class Node {

    int key;
    BinaryTree left, right;

    public Node(int item) {
        key = item;

        left = right = null;
    }
}

public class BinaryTree {
    
    Node root;
    
    BinaryTree(int key){
        root=new Node(key);
    }
    
    BinaryTree(){
        root=null;
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        
        tree.root=new Node(1);
        
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
    }

}
