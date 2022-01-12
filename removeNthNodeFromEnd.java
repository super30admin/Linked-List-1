// Did this code successfully run on Leetcode : Yes
// Time Complexity :O(n)
// Space Complexity :O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        
        while(n>0 && fast !=null){
            fast= fast.next;
            n--;
        }
        
        while(fast !=null){
            fast = fast.next;
            slow=slow.next;
        }
        slow.next= slow.next.next;
        return dummy.next;
    }
}