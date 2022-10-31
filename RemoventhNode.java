package s30.linkedList.linkedList1;

import s30.linkedList.ListNode;


// Time Complexity O(n); traversing through every node
// Space Complexity O(1);
public class RemoventhNode {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;

        int count =0;

        if(head.next ==null && n ==1) return  null;
        while(fast!=null){
            if(count>=n){
                slow = slow.next;
            }
            count++;
            fast = fast.next;
        }
        slow.next = slow.next.next;


        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
