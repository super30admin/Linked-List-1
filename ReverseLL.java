// https://leetcode.com/problems/reverse-linked-list/description
// Your code here along with comments explaining your approach
// Time complexity : O(n)
// Space complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Approach1 : Used 2 pointer approach to reverse the LL
// At each step, we flip the direction of the pointer to the previous node.
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
// Approach2 : Recursive approach
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
       if(head==null || head.next==null) return head;
       ListNode result = reverseList(head.next);
       head.next.next = head;
       head.next = null;
       return result;
    }
}