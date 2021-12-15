// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * We are using three pointers prev, curr and fast.
 * For each node we will make curr point to prev (curr.next = prev)
 * Then we make all three move one position ahead.
 * This we will keep on doing till fast is not null 
 * Once fast is null, we will come out of loop and we will perform curr pointing to prev one last time.
 * Then we have our LL reversed with curr pointing to head of reversed LL so we return curr.
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
class Solution {
    
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null)return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr= fast;
            fast = fast.next;
        }
            curr.next = prev;
            
        return prev;
    }
//     1. Approach one -> Time = O(n) and Space = O(n)
 
//     if(head == null || head.next == null)return head;
        
//         ListNode prev = new ListNode(head.val);
//         head = head.next;
        
//         while(head.next != null){
//             ListNode node = new ListNode(head.val);
//             node.next = prev;
//             head = head.next;
//             prev = node;
//         }
//         ListNode node = new ListNode(head.val);
//         node.next = prev;
        
//         return node;
}