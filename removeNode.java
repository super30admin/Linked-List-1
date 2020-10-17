//time Complexity:O(N)
//Space complexity:O(1)
//In this problem, i'll be creating a dummy node, before my head. Both my slow and fast pointers will be pointing to the same dummy location. I'll first move my fast pointer to move to n+1th node. Then until my fast pointer is not null, i'll move both my fast and slow pointer one step each. Once fast becomes null and I break out of the loop and make the next node of slow point to the node next to the next node.
//This code was executed successfully and got accepted in leetcode.


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}