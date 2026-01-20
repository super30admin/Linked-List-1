/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //Two pointers. Slow by one step; Fast by 2 steps. If there is a cycle, they will meet in first round.
 //The distance between meet point to node where cycle start and head of linkedlist to node where cycle start will be same.
 //to avoid corner cases, use dummy nodes
 //TC: O(n)+(n); SC:O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;

        if(head==null){
            return head;
        }

        slow=slow.next;
        fast=fast.next.next;

        while(fast!=null && fast.next!=null){
            if(slow!=fast){
                 slow=slow.next;
                fast=fast.next.next;
            }else{
                break;
            }
           
        }

        slow=dummy;

        while(fast!=null && slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
    }
}
