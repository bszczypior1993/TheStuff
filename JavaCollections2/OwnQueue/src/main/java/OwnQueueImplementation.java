public class OwnQueueImplementation implements OwnQueue {
    public static void main (String[] args)
    {

        OwnQueueImplementation myQueue = new OwnQueueImplementation();
        myQueue.add(2);
        myQueue.add(1);
        myQueue.add(3);
    }

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }

    }
    private ListNode head;
    private ListNode tail;
    public int length;


    public OwnQueueImplementation(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public boolean add(Integer e) {
        boolean addConfirmation = false;
        ListNode newNode = new ListNode(e);
        if (head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
            length++;
         addConfirmation = true;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
            length++;
            addConfirmation = true;
        }
return addConfirmation;
    }

    @Override
    public Integer remove() {
        int data = head.data;
        head = head.next;
        return data;}

    @Override
    public Integer element() {
        int data = head.data;
        return data;
    }
}
