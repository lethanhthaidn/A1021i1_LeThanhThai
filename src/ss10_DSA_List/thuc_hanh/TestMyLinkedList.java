package ss10_DSA_List.thuc_hanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList llist = new MyLinkedList(10);
        llist.addFirst(11);
        llist.addFirst(12);
        llist.addFirst(13);

        llist.add(4,9);
        llist.add(4,9);
        llist.printList();
    }
}

