// Time Complexity : O(n) where 'n' is number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Approach 1, using just slow and fast pointer and special condition if first node is to be deleted
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(count<=n){
            fast = fast.next;
            if(fast == null && count<n){
                return head.next;
            }
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
    return head;
        
    }
}

//Approach 2: Using dummy node at start, so that we don't need to handle special case when 1st node is to be deleted
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
    return dummy.next;
        
    }
}

