/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode DetectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        bool hasCycle= false;
        while(fastPtr != null && fastPtr.next !=null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
            {
                hasCycle = true;
                break;
            }

        }
        if(!hasCycle)
        {
            return null;
        }
        ListNode temp = head;
        while(temp != slowPtr)
        {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }

        return temp;
        
    }
}