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
 // This solution uses a two step technique. First step involves moving the slow pointer and fast pointer with 1x and 2x speeds and breaking at the meeting point which determines the cycle. We can parallely track a flag to see if the flag is not deteceted. Step 2 involves moving the slow pointer to head and moving both the pointers with 1x speed until they meets. This formula will ensure that they meet at the start of cycle although fast pointer might take 1 to many cycles until slow pointer reaches it.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean singleNodeChecker = false;
  
        while(slow.next!=null && fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) {
                singleNodeChecker = true;
                break;
            }
        }

        if(!singleNodeChecker) return null;
        slow = head;
        while(slow!=fast) {
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(fast.val);
        System.out.println(slow.val);
        return slow;
    }
}

