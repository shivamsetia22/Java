import java.util.LinkedList;

public class LL {
    Node head; 
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(Integer data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(Integer data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null ) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null ) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }  

    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("This list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getInt(){
        return size;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        LL list = new LL();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getInt());
        // list.addFirst("this");
        // System.out.println(list.getInt());

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }

    /**
     * @param args
     */
    // public static void main(String[] args) {
    //     LinkedList<String> list = new LinkedList<String>();

    //     list.addFirst("a");
    //     list.addFirst("is");
    //     System.out.println(list);

    //     list.addFirst("this");
    //     list.add("list");
    //     System.out.println(list);

    //     System.out.println(list.size());

    //     for(int i=0; i<list.size(); i++) {
    //         System.out.print(list.get(i) + " -> ");
    //     }
    //     System.out.println("null");

    //     list.removeFirst();
    //     System.out.println(list);

    //     list.removeLast();
    //     System.out.println(list);
    // }
}
