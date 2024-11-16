// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach - we have 2 nodes,
//between both the nodes we have distance of n, then once we reach end of list
//with fast, we delete slow.next

public class RemoveNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
