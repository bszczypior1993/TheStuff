public class DoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.addNode("jeden");
        myList.addNode("dwa");
        myList.addNode("trzy");
        myList.addNode("cztery");
        myList.addNode("pięć");
        myList.addNodeToIndex(3, "osiemdziesiąt");
        myList.removeNodeFromIndex(4);
        myList.printLength();

        myList.printNodes();
    }


    private ListNode head;
    private ListNode tail;
    private int length;


    private class ListNode {
        private String data;
        private ListNode next;
        private ListNode previous;

        public ListNode(String data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void addNode(String data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
            length++;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
            length++;
        }
    }

    public void addNodeToIndex(int index, String data) {
        ListNode newNode = new ListNode(data);
        newNode.data = data;
        newNode.next = null;
        newNode.previous = null;
        length++;

        if (index == 1) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else {
            ListNode temp = new ListNode(data);
            temp = head;

            for (int i = 1; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                newNode.next = temp.next;
                newNode.previous = temp;
                temp.next = newNode;
                if (newNode.next != null) {
                    newNode.next.previous = newNode;
                } else {
                    System.out.println("Previous node is empty");
                }
            }

        }
    }

    public void removeNodeFromIndex(int index) {
        ListNode temp = head;
        if (head == null) {
            System.out.println("This list is empty");
            return;
        } else if (index == 1) {
            head = temp.next;
            return;
        } else {
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                throw new NullPointerException();
            } else {
                ListNode nextNode = temp.next.next;
                temp.next = null;
                temp.next = nextNode;
                return;
            }

        }
    }

    public void printNodes() {
        ListNode current = head;
        if (head == null) {
            System.out.println("Empty list");
            return;
        } else {
            System.out.println("List of nodes:");
            while (!(current == null)) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public void printLength() {
        length = 0;
        ListNode temp = head;
        for (int i = 1; temp != null; i++) {
            length++;
            temp = temp.next;
        }
        System.out.println("This list has " + length + " nodes.");
    }
}