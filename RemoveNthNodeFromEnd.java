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
 //This solution employs a two-pointer approach with a dummy node to remove the Nth node from the end of a singly-linked list. 
 //It initializes slow and fast pointers, moves fast N+1 steps ahead, then advances both pointers until fast reaches the end. 
 //Finally, it adjusts the slow.next pointer to skip the Nth node, achieving O(N) time complexity and O(1) space complexity.
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        int cnt =0;
        while(cnt <= n){
            fast = fast.next;
            if(fast == null & cnt<n){
                return head.next;
            }
            cnt++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode t = slow.next;
        slow.next=t.next;
        t.next = null;
        return head;
        
    }
}