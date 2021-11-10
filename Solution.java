// Time Complexity : O(N);
// Space Complxity : O(1);
// DID it run on Leetcode : YES
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        return rec(head);
        
    }
    private ListNode rec(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode tail = rec(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }
}