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

 /*
Approach :
-This problem is solved using **Floyd's Tortoise and Hare Algorithm (Cycle Detection).
-Step 1: Use two pointers, 'slow' and 'fast'.
        -'slow' moves one step at a time
        -'fast' moves two steps at a time.
-Step 2 : If there is a cycle, 'slow' and 'fast' will eventually meet inside the cycle.
-Step 3: Once they meet, to find the **entry point of the cycle**, reset 'slow' to 'head'.
    -Move both 'slow' and ' fast' one step at a time.
    -The point where they meet again will be the **starting node of the cycle**.
-If 'fast' or 'fast.next' become null, it means the list has no cycle - return null.

Time Complexity 

 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Edge case: if the list is empty or has only one node, no cycle is possible
        if(head == null || head.next == null) return null;

        ListNode slow = head;//Initialize slow pointer
        ListNode fast = head;//Initialize fast pointer
        boolean flag = false; //Flag to track if a cycle is detected

        //Step 1: Detect cycle using slow and fast pointer
        while(fast != null && fast.next != null) {
            slow = slow.next; //Move slow pointer by 1
            fast = fast.next.next;//Move fast pointer by 2

            if (slow == fast){ //If they meet, a cycle exists
                flag = true;
                break;  //Exit the loop once cycle is detected

            }


        }

        //Step2: If no cycle was detected, return null
        if (!flag) return null;

        //Step3: Reset slow to head, move both slow and fast one step at a time
        slow = head;
        while(slow != fast){
            slow = slow.next; //Move slow by 1
            fast = fast.next; //Move fast by 1
        }

        //The node where they meet is the start of the cycle
        return slow;



  
        
    }
}