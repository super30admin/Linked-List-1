//Time Complexity O(n)
//Space Complexity O(1)
//Leetcode tested

public class CycleDetectionLinkedList {
    public ListNode detectCycle(ListNode head) {
        ListNode back = head;
        if(back == null) return null;
        ListNode front = head;
        while (front!=null && front.next!=null){
            back = back.next;
            front=front.next.next;
            if(front == back){
                break;
            }
        }
        if(front == null || front.next == null) return null;
        back=head;
        while(front!=back){
            back=back.next;
            front=front.next;
        }
        return front;
    }
}
