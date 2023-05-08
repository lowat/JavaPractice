import java.util.*;

class Program {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList middleNode(LinkedList linkedList) {
        LinkedList currentNodeSingleSpeed = linkedList;
        LinkedList currentNodeDoubleSpeed = linkedList;
        while(currentNodeDoubleSpeed != null && currentNodeDoubleSpeed.next != null){
            currentNodeSingleSpeed = currentNodeSingleSpeed.next;
            currentNodeDoubleSpeed = currentNodeDoubleSpeed.next.next;
        }
        return currentNodeSingleSpeed;
    }
}