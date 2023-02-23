/*
 * Time Complexity : O(n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - For this question we consider 2 pointers, slow and fast. We increment the slow pointer by 1 and fast pointer by 2 until either fast pointer becomes null or slow and fast are equal.
 * If the fast pointer equals to slow then a cycle was not detected. If a cycle was detected then, We start the slow pointer from the beginning and increment both slow and fast by 1 until slow
 * and fast are equal again. Then we return that node as the starting point of the cycle.
 */

//https://leetcode.com/problems/linked-list-cycle-ii

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
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(!flag && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)flag=true;
        }
        if(flag){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
        }else{
            return null;
        }
    }
}