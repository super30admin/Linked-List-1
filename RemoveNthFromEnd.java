// Time Complexity : O(n) where n is the number of nodes as we traverse the entire list once in the worst case
// Space Complexity :O(1) no extra space used
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
class RemoveNthfromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        int count = 0;
        while(count < n-1){
            fast = fast.next;
            count++;
        }
        ListNode prev = slow;
        while(fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow == head){
            head = head.next;
        }
        prev.next = slow.next;
        slow.next = null;

        return head;

    }
}