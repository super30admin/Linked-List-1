// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Apprach: The first pointer advances the list by n+1n+1 steps from the beginning, while the second pointer starts from the beginning of the list.
// Now, both pointers are exactly separated by n nodes apart. 
// We maintain this constant gap by advancing both pointers together until the first pointer arrives past the last node. 
// The second pointer will be pointing at the nth node counting from the last. 
// We relink the next pointer of the node referenced by the second pointer to point to the node's next next node.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        for(int i=1;i<=n+1;i++)
            first=first.next;
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }
}