package design.tkggames.hackerrank;
/**************************************************
 * @author Tkggames
 * Print in Reverse Hackerrank Solutions
 * Date: 05/10/2020
 *
 * Added Extra methods for testing
 **************************************************/
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode(int data) {
        this.data = data;
    }
}

public class PrintInReverse {
    static SinglyLinkedListNode head;

    static void reversePrint(SinglyLinkedListNode head) {
        if (head == null) return;
        reversePrint(head.next);
        System.out.print(head.data + " "); //use println instead for Hackerrank
    }

    private static SinglyLinkedListNode addToBack(int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = node;
            return head;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
    }

    private static void printNodeData(SinglyLinkedListNode head) {
        if (head == null) return;
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sampleInput = {3, 5, 16};
        SinglyLinkedListNode nodes = new SinglyLinkedListNode();
        for (int value : sampleInput) {
            nodes = addToBack(value);
        }
        System.out.printf("%-15s : ", "Not Reversed");
        printNodeData(nodes);
        System.out.printf("%-15s : ", "Reversed");
        reversePrint(nodes);
    }
}
