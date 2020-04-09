// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

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
        if(head == null){
            return null;
        }
        ListNode node1 =findNode(head);
        ListNode result = null;
        if(node1 != null){
            ListNode curr1 = head;
            ListNode curr2 = node1;
            
            while(curr1!=curr2){
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            result = curr1;
        }
        return result;
    }
    
    public ListNode findNode(ListNode head){
        if(head == null){
            return null;
        }
        
        ListNode sp = head;
        ListNode fp = head;
        
        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;
            if(fp == sp){
                return sp;
            }
        }
        
        return null;
    }
}