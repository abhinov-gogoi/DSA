package DataStructures.list.linkedlist.singly;

public class DSxLinkedList<T> {
    private SLLNode<T> head;
    public SLLNode<T> tail;
    public int size;

    public DSxLinkedList() {
    }

    public DSxLinkedList(SLLNode<T> head) {
        this.head = head;
    }

    @SafeVarargs
    public DSxLinkedList(T ... elements) {
        for (T element : elements) {
            add(element);
        }
    }

    public void print() {
        SLLNode<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                System.out.println(currentNode.data);
            } else {
                System.out.print(currentNode.data + " -> ");
            }
            currentNode = currentNode.next;
        }
    }

    public void add(T data) {
        SLLNode<T> node = new SLLNode<>(data);
        if (isEmpty()) {
            head = node;
            head.next = null;
        } else {
            SLLNode<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        size++;
        tail = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
