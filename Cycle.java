// Time Complexity :O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

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
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> set = new HashMap<>();
        int i = 0;
        

        while(head != null){        // to traverse completely through the linkedlist
            
            if(set.containsKey(head)){  // if hashmap contains the head, then we know it's because of th cycle/loop
                System.out.println("here");
                return head;    // return the current pointer
            }
            
            set.put(head, i);   // if it's not found in the hashmap, add the node to the hashmap
            head = head.next;   // to proceed futher
            i++;
        }
        
        
        return null;
    }
}