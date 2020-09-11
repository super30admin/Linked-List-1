Time Complexity: O(n)
Space Complexity: O(1)
Ran successfully on leetcode?: yes

class Solution {
    int count = 0, target;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        target = n;
        helper(dummy, head);
        return dummy.next;
    }
    
    private void helper(ListNode prev, ListNode curr){
        if(curr.next == null){
            count = 1;
        } else {
            helper(curr, curr.next);
            count++;
        }
        
        if(count == target){
            prev.next = curr.next;
            curr.next = null;
        }
    }
}
