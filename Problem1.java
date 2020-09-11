Time Complexity: O(n)
Space Complexity: O(1)
Ran successfully on leetcode?: yes

class Solution {
    ListNode curr, prev;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        helper(head);
        prev.next = null;
        return curr;
    }
    
    private void helper(ListNode head){
        if(head.next == null){
            curr = head;
            prev = head;
            return;
        }
        helper(head.next);
        prev.next = head;
        prev = prev.next;
    }
}
