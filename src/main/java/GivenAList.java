import java.util.List;

public class GivenAList {

    /**
     * @param head >> ListNode type pointer to head of the list
     * @return head of the reversed list
     */
    public static ListNode reverseList(ListNode head) {
        ListNode previous_pointer=null, temp, current_pointer=head;

        while (current_pointer!=null){
            temp = current_pointer.next;
            current_pointer.next=previous_pointer;
            previous_pointer=current_pointer;
            current_pointer=temp;
        }
        return previous_pointer;
    }

}
