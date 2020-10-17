//Time Complexity:O(N) where N is the length of the list
//Space Complexity:O(1)
//In this problem, I'll iteratively move along the nodes of the list until the node is not null. I'll crete a temporary node, which will hold my next node's value. I'll assign my next node to my previous node and my previous node to my current node and my current node to my next node. At the end, I'll be returning the reversed list.
//This code was executed successfully and got accepted in leetcode.

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}