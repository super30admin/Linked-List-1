// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;


        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;

        //two pointer approach
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast.next != null){
            //make distance btwn fast and slow
            if(count >= n){
                slow = slow.next;
                fast = fast.next;
            }
            else{
                fast = fast.next;
                count++;
            }
        }

        //slow will be right before node to remove, change pointers so they go around removed node
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
    }
}