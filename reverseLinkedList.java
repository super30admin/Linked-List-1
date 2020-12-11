class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}


Time complexity: O(n)
space complexity: O(1)