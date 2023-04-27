import java.util.*;

class Program {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sumsList = new ArrayList<Integer>();
        branchSums(root, sumsList, 0);
        return sumsList;
    }

    public static void branchSums(BinaryTree node, ArrayList<Integer> sumsList, int sum){
        sum += node.value;
        if(node.left == null && node.right == null){
            sumsList.add(sum);
        }
        if(node.left != null){
            branchSums(node.left, sumsList, sum);
        }
        if(node.right != null){
            branchSums(node.right, sumsList, sum);
        }
    }
}
