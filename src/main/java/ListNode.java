
//Singly Linked List implementation in Java
public class ListNode {
    int value;
    ListNode next;
    ListNode() {}
    ListNode(int value){
        this.value=value;
    }
    ListNode(int value, ListNode next){
        this.value=value;
        this.next=next;
    }

    void addElement(int value){
        this.value=value;
        this.next=next;
    }

}
