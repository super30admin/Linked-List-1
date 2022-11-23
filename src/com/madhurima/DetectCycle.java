// Time Complexity : O(n)
// Space Complexity : O(n) if using HashSet, O(1) is using slow and fast pointers
// Did this code successfully run on Leetcode : yes


package com.madhurima;

import java.util.HashSet;

public class DetectCycle {
}


// * Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }


class SolutionA1 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while(curr!= null){
            set.add(curr);
            if(set.contains(curr.next)){
                return curr.next;
            }
            curr = curr.next;
        }

        return null;

    }
}

class SolutionA2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // if(slow.next == slow){
        //     return slow;
        // }

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }

        fast = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}
