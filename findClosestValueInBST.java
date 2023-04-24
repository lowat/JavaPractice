import java.util.*;

class Program {
    public static int findClosestValueInBst(BST tree, int target) {
        if(tree != null){
            return binarySearch(tree, target, tree.value);
        }
        return -1;
    }

    public static int binarySearch(BST tree, int target, int closest){
        if(tree == null){
            return closest;
        }
        closest = Math.abs(target - tree.value) < Math.abs(target - closest) ? tree.value : closest;
        if(target > tree.value){
            closest = binarySearch(tree.right, target, closest);
        } else {
            closest = binarySearch(tree.left, target, closest);
        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
