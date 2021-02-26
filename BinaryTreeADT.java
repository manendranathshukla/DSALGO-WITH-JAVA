import java.io.*;
import java.lang.*;

class Node{
    public int data;
    public Node left,right;
    
    public Node(int value){
        this.data=value;
        left=right=null;
    }
    
    public int getData(){
        return data;
    }
    
    public void setData(int data){
        this.data=data;
    }
    
    public Node getLeft(){
        return left;
    }
    
    public void setLeft(Node left){
        this.left=left;
    }
    
    public Node getRight(){
        return right;
    }
    public void setRight(Node right){
        this.right=right;
    }
    
}


class BinaryTree{
    
    public Node createNode(int v){
        Node n=new Node(v);
        return n;
    }
    
    
    public void inOrder(Node root){
        if(root!= null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    
    
    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public void postOrder(Node root){
        if(root!=null){
            
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    
    
}
class TreeDS {
    
   
	public static void main (String[] args) {
	    BinaryTree b=new BinaryTree();
	    Node root=b.createNode(5);
	    root.left=b.createNode(3);
	    root.right=b.createNode(7);
	    root.left.left=b.createNode(1);
	    root.left.right=b.createNode(4);
	    root.right.left=b.createNode(10);
	    root.right.right=b.createNode(15);
	    System.out.println("Inorder Traversal :");
	    b.inOrder(root);
	    System.out.println("\n Pre Order Traversal:");
	    b.preOrder(root);
	     System.out.println("\n Post Order Traversal:");
	    b.postOrder(root);
	    
		//code
	}
}
