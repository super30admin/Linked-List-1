// Time Complexity :O(n)
// Space Complexity : considering recursion stack, O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Approach: 1.Iterate through the list recursively until you find end of list.
// 2. Initialize head to be the last node. 
// 3. While coming down the recursion stack, change the nodes to point to previous nodes and return new head.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        return reverse(head,null);
    }
    private ListNode reverse(ListNode curr, ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode head = reverse(curr.next,curr);
        curr.next=prev;
        return head;
    }
}

// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Approach:
//1. Keep 2 pointers 'a','b' at a distance of n+1.
//2. when pointer 'b' reaches end of list, pointer 'a' points to node that has to be deleted. 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N=n+1;
        ListNode a = head;
        ListNode b = head;
        while(N>0){
            if(b==null){
                return head.next;
            }
            b=b.next;
            N--;
        }
        while(b!=null){
            a=a.next;
            b=b.next;
        }
        ListNode t = a.next.next;
        a.next.next = null;
        a.next = t;
        return head;
    }
}
