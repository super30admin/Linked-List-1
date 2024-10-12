// Time Complexity : The time complexity would be O(n) as the maximum that the fast can go is till end of the linked list
// Space Complexity : O(1) as we have not used any other datastructure except for the node which would be considered as constant space.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : N/A

class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy  = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy ;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow=slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next =null;
        
        return dummy.next;
    }
}