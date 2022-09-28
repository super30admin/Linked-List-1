// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

//206. Reverse Linked List (Easy) - https://leetcode.com/problems/reverse-linked-list/
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
// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while (fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        return curr;
    }
}

// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(n) where n = length of linked list
class Solution {
    
    // ListNode reversed;
    
    public ListNode reverseList(ListNode head) {
        // base
        if (head == null || head.next == null) return head;
        
        // logic
        ListNode reversed = reverseList(head.next); // can be declared as global also
        // st.pop() 4 3 2 1 because only head is in the local scope of recursion
        //System.out.println(reversed.val); // 5 5 5 5
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}