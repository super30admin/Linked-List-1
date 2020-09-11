    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/linked-list-cycle/
    Time Complexity for operators : o(n) 
    Extra Space Complexity for operators : o(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : create hasmap and check element is revisited or not.

        # Optimized approach same like basic approach: Recursion or Iterative.
                              
                #
                    A. take 2 pointers fast and slow and traverse thru the list till end.
                    B. move slow pointer by one annd fast pointer by 2.
                    C. if anywhere slow == fast that means we found the loop and return true.
                    D. else return false; that means fast is reached to null.

       */

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

   class findLoopinList {

    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast){
            
            if(fast == null || fast.next == null)
                return false;
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return true;
    }
}