package datastructures.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeTopView {

	   class Node{ 
	       int data;
	       Node left;
	       Node right;
	       }
	
	void top_view(Node root)
	{
	    List<Integer> leftNodes = new ArrayList<>();
	    List<Integer> rightNodes = new ArrayList<>();
	    Node temp = root;
	    temp= root.left;
	        while(temp!=null){
	            leftNodes.add(temp.data);
	            temp=temp.left;
	        }
	        Collections.reverse(leftNodes);
	        for(int x:leftNodes){
	            System.out.print(x+" ");
	        }
	        System.out.print(root.data+" ");
	        temp =root.right;
	        while(temp!=null){
	            rightNodes.add(temp.data);
	            temp=temp.right;
	        }
	        for(int x:rightNodes){
	            System.out.print(x+" ");
	        }    
	    
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
