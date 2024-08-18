//Time Complexity: O(n)
//Space Complexity: O(n)
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        Boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
