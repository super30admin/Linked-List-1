// TC: O(N)
// SC: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        if(head == null) return prev;
        ListNode cur = head;
        ListNode fast = head.next;
        
        while(fast != null){
            cur.next = prev;
            prev = cur;
            cur = fast;
            fast = fast.next;
        }
        cur.next = prev;
        return cur;
        
    }
}
