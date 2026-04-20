package leetcode;

public class MyLinkedList {

    private final Node head;
    private final Node tail;
    private int size;

    public MyLinkedList() {
        this.head = new Node(0);
        this.tail = new Node(0);
        this.head.next(tail);
        this.tail.prev(head);
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        return findNode(index).value;
    }

    public void addAtHead(int val) {
        Node first = head.next;
        Node node = new Node(val);

        node.prev(head);
        node.next(first);
        head.next(node);
        first.prev(node);

        size++;
    }

    public void addAtTail(int val) {
        Node last = tail.prev;
        Node node = new Node(val);

        node.prev(last);
        node.next(tail);
        last.next(node);
        tail.prev(node);

        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            index = 0;
        }

        if (index > size) {
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node found = findNode(index);
        Node prevNode = found.prev;
        Node node = new Node(val);

        node.prev(prevNode);
        node.next(found);
        prevNode.next(node);
        found.prev(node);

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        Node found = findNode(index);
        found.prev.next(found.next);
        found.next.prev(found.prev);

        size--;
    }

    private Node findNode(int index) {
        Node node = head.next;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    private static class Node {
        private final int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public void prev(Node prev) {
            this.prev = prev;
        }

        public void next(Node next) {
            this.next = next;
        }
    }
}