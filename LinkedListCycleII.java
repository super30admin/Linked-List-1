// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

//142. Linked List Cycle II (Medium) - https://leetcode.com/problems/linked-list-cycle-ii/
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
// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        if (head == null) return head;
//        
//        boolean flag = false;
//        
//        ListNode slow = head;
//        ListNode fast = head.next;
//        
//        // O(n)
//        while (fast != null && fast.next != null && fast.next.next != null) { // for even and odd length cases
//            slow = slow.next;
//            fast = fast.next.next;
//            
//            if (slow == fast) { // cycle is detected
//                flag = true;
//                break;
//            }
//        }
//        
//        if (!flag) return null;
//        
//        // find the head
//        slow = head;
//        fast = fast.next;
//        
//        while (slow != fast) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        
//        return slow;
//    }
//}

// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        
        boolean flag = false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // O(n)
        while (fast != null && fast.next != null) { // for even and odd length cases
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) { // cycle is detected
                flag = true;
                break;
            }
        }
        
        if (!flag) return null;
        
        // find the head
        slow = head;
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}