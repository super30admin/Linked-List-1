// Time Complexity : O(n), traverse from head till next element element from tail, null
// Space Complexity : O(1), need two pointers, prev and cur 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no, this was fine, drew on paper

// Your code here along with comments explaining your approach
// make a new tail, a null node, call it prev
// add a new pointer copying head
// now move head to head.next, point cur.next to our new tail prev, move prev to cur
// iterate till head.next is not null  

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        
        ListNode prev = null;
        ListNode cur = null;
        
        while(head!=null){
            cur = head;
            head = head.next;
            cur.next = prev;
            prev = cur;
        }
        
        return cur;
    }
}