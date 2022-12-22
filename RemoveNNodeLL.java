//TC : o(n)
//Sc : o(1)
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        ListNode slow = temp;
        ListNode fast = temp;
        int count = 0;
        while(count <= n){
            fast=fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}
