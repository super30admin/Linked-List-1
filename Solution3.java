// Time Complexity :O(n) traverse the whole list
// Space Complexity :O(1) no extra space needed
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution3 {

// Definition for singly-linked list.
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head==null)
           return null;
        
        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle= false;
        // find a point where they cross each other.
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            // if slow and fast cross once it will have a cycle
            if(slow==fast){
                hasCycle=true;
                break;
            }
        }
        // no cycle is there no further processing required
        if(hasCycle==false)
            return null;
        // reset slow to head and move both pointers
        // this gives us a point when the cycle start
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        // can return either slow or fast
        return fast;
    }
}
}
