// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Have slow and fast pointer at head, then iterate the list where I increase the slow pointer by 1 and fast pointer by 2 until the fast pointer and the next fast pointer is not null and maintain a flag to say that the slow and fast pointer are equal, if they are not equal I will return null or else I will iterate the linkedlist again until slow is not equal to fast and then increase the slow pointer by 1 and fast pointer by 1 and at the end return the slow or fast pointer value.



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
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(!flag) return null;
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}