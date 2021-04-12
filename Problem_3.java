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
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Your code here along with comments explaining your approach
//use 2 pointers one fast and one slow, fast moves two steps while slow moves 1 step, if they come to some node at any point, it means they have a cycle,
//after finding cycle, reset one pointer  and then start moving both by 1 pointer, when they are same that is first point of cycle.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        Boolean check= false;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                check=true;
                break;}
        }
        System.out.print(check);
        if(check==false) return null;
        slow= head;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
   
}