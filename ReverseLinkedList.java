// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
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