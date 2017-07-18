package ctci.solutions;

public class CheckBST {

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:*/
    class Node {
        int data;
        Node left;
        Node right;
     }

    boolean checkBST(Node root) {
        return confirmBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean confirmBST(Node root, int min, int max){
        if(root== null)
            return true;
        else
            return min<root.data && max>root.data && confirmBST(root.left, min, root.data) && confirmBST(root.right,root.data,max);
    }
}