    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    Time Complexity for operators : o(n) 
    Extra Space Complexity for operators : o(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Traverse List and calculate length and substract N from length and then go till that point and remove node.

        # Optimized approach same like basic approach: Recursion or Iterative.
                              
                #
                    A. Create dummy head pointint to -1. Does not exist. Point dunnyhead to head.
                    B. start both slow and fast pointer from head.
                    C. first, move fast till the N
                    D. The move fast and slow till slow is not null and then remove fast.next

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

   class reverseLinkedList {

        public ListNode removeNthFromEnd(ListNode head, int n) {
        
            ListNode dummyHead = new ListNode(-1);
            dummyHead.next = head;   
            ListNode slow = dummyHead;
            ListNode fast = dummyHead;

            
            while(n>=0){
                fast = fast.next;
                n -= 1;
            }
            
            while(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
            
            slow.next = slow.next.next;
            
            return dummyHead.next;
        }

}