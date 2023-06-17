package DataStructures.list.linkedlist.singly;

public class Main {
    public static void main(String[] args) {
        DSxLinkedList<Integer> list = new DSxLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.print();
        System.out.println(list.tail.data);
        System.out.println(list.size);
    }
}
