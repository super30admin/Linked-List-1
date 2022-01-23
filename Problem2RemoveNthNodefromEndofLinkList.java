//TC: O(N);
//SC: O(1);

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null) return head;
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        int count=0;
        
        ListNode slow= dummy;
        ListNode fast= dummy;
        
        while(count<=n){
            fast=fast.next;
            count++;
        }   //making the fast reach upoto =n value;
        
        //After so keep the fast going untill fast becomes null;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        //if writing reurn head then firt element if want to nullify only will still come in output until unless head is altered specifically;
        //that is why always return the dummy.next node, as it will be true for all the functions;
        return dummy.next;
    }
}
