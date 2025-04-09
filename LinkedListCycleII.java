public class LinkedListCycleII {
}
//brute force using Hashset. extra space
//time is linear
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

        HashSet<ListNode> set = new HashSet<>();
        ListNode start = head;
        int count = 0;

        if (head == null) return null;

        set.add(head);

        while(start.next != null)
        {
            if(!set.contains(start.next)){
                set.add(start.next);
                count++;
            }
            else{
                return start.next;
            }

            start = start.next;

        }

        return null;

    }
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
    // Identify mid element
    //taking two pointers slow and fast
//now what happens
//in cycle if one travels with 1x and 2nd with 2x there point where both meet in a same point
//3, 2, 0, -4
// s,f] - 3,3 - >  2,0, -> 0,2 -> -4,-4 (meeting point)

//lets consider odd list

// 3,2,0,-4, 7 cycle from 7 to 2
//3,3 -> 2,0, -> 0,7 -> -4,0 -> 7,7 (mid)

// 1,2,3 11, 23, 31, 13, 21, 33 (meeting point)

// meeting point to head of the cycle distance

    public class Solution {
        public ListNode detectCycle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null &&fast.next != null)
            {

                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    break;
                }
            }
            if(fast == null || fast.next == null) return null;
            slow = head;
            while(slow != fast){
                slow= slow.next;
                fast=fast.next;

            }
            return slow;

        }
    }


