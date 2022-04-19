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
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){   // checking condition when fast won't be able to move two steps         
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){                   //setting flag true when we get the match
                flag = true;
                break;
            }
        }
        if(!flag){                              //no need to execute if there is no match 
            return null;
        }
        slow = head;
        while(slow != fast){                    // resetting slow pointing to head and moving each pointer unless its a match to get the node from where cycle started
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)