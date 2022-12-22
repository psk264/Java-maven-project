import java.rmi.dgc.Lease;
import java.util.List;

public class GivenAList {

    /**
     * @param head >> ListNode type pointer to head of the list
     * @return head of the reversed list
     * Time Complexity O(n), Space complexity O(n) as we are using pointers
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

    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode fastpointer = head;

        while(fastpointer != null && fastpointer.next !=null){
            middle = middle.next;
            fastpointer = fastpointer.next.next;
        }
        return middle;
    }

}
