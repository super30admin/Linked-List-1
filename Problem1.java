// 206. Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {
        //base
        if(head == null || head.next == null)
            return head;
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
  }
}

/* 

Complexity analysis

Time complexity : 
O(n). Assume that 
n is the list's length, the time complexity is O(n).

Space complexity : 
O(n). The extra space comes from implicit stack space due to recursion. The recursion could go up to n levels deep.
*/ 
