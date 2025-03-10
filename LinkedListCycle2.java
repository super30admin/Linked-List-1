// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//slow and fast meet at a point when cyclic. when you go one at a time and they become equal you have found head of cycle
// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
  }

 class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        fast = head;
        while(slow!=fast){
            slow=slow.next;
            fast = fast.next;
        }
        return fast;


    }
}