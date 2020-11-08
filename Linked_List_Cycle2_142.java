//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

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
public class Linked_List_Cycle2_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        boolean flag = false;
        while(hare != null && hare.next != null)
        {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            return null;
        tortoise = head;
        
        while(tortoise != hare)
        {
            tortoise = tortoise.next;
            hare = hare.next;
        }
        return hare;
    }
}

