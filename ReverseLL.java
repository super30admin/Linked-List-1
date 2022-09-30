class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return null;
        
        ListNode prev = null;
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

//Time Complexity :O(n)
//Space Complexity :O(1)