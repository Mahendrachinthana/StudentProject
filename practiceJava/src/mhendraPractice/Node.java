package mhendraPractice;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Method to append data to the circular linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Method to find the middle node of the circular linked list
    public Node findMiddleNode() {
        if (head == null) {
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr.next != head && fastPtr.next.next != head) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    // Method to split the circular linked list into two halves
    public void splitInHalf() {
        if (head == null) {
            return;
        }
        Node middleNode = findMiddleNode();
        Node firstHalfHead = head;
        Node secondHalfHead = middleNode.next;
        middleNode.next = head;

        Node current = secondHalfHead;
        while (current.next != head) {
            current = current.next;
        }
        current.next = secondHalfHead;

        System.out.println("First Half:");
        display(firstHalfHead);
        System.out.println("Second Half:");
        display(secondHalfHead);
    }

    // Method to reverse the circular linked list
    public void reverse() {
        if (head == null) {
            return;
        }
        Node prevNode = null;
        Node current = head;
        Node nextNode;
        do {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        } while (current != head);
        head.next = prevNode;
        head = prevNode;
    }

    // Method to remove duplicates from the circular linked list
    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != head) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // Method to display the circular linked list
    public void display(Node start) {
        if (start == null) {
            return;
        }
        Node current = start;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != start);
        System.out.println();
    }
}

public class Node {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Test appending elements
        cll.append(1);
        cll.append(2);
        cll.append(3);
        cll.append(4);
        cll.append(2);  // Adding a duplicate
        cll.append(5);
        cll.append(6);
        cll.append(7);

        // Display original circular linked list
        System.out.println("Original Circular Linked List:");
        cll.display(cll.head);

        // Test finding middle node
        Node middleNode = cll.findMiddleNode();
        System.out.println("\nMiddle Node: " + middleNode.data);

        // Test splitting in half
        System.out.println("\nSplitting Circular Linked List into Two Halves:");
        cll.splitInHalf();

        // Test reversing the linked list
        System.out.println("\nReversed Circular Linked List:");
        cll.reverse();
        cll.display(cll.head);

        // Test removing duplicates
        System.out.println("\nCircular Linked List after removing duplicates:");
        cll.removeDuplicates();
        cll.display(cll.head);
    }
}
