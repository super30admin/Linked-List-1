

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

/**
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        //tortoise = x+y distance
        // hare = x + y + z + y distance



        ListNode tortoise = head;
        ListNode hare = head;

        do{
            // if it doesn't have cycle then return null
            if(tortoise == null || tortoise.next==null)
                return null;

            tortoise = tortoise.next.next;
            hare = hare.next;
        }while(tortoise != hare);

        ListNode first = head;
        ListNode second = hare;

        while(first != second){
            first = first.next;
            second = second.next;
        }

        return first;

    }
}