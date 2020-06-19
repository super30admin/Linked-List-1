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
public class Solution {
// Time Complexity : O(No. of list nodes )
// Space Complexity : O(No. of list nodes)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
1. Use set to check the cycle.
*/
    public ListNode detectCycle(ListNode head) {
        
        LinkedHashSet<ListNode> hs = new LinkedHashSet<>();
        while(head != null){
          if(hs.contains(head)){
              return head;
          }
          else{
                hs.add(head);
            }
  
            head = head.next;
        }
        return null;
    }
}



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
public class Solution {
// Time Complexity : O(No. of list nodes )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
1. Using slow fast pointers.
2. To detect the cycle start node, move one of the pointers to head and move bothe pointers by one untill they meet.
*/
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == true){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        else{
            return null;
        }
        return slow;
    }
}