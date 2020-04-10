// 142.
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
//time - O(n)
//space - constant
//algorithm - Floyd's algorithm
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) //fast == null for list of odd length and the other for ist of even length
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) //detects cycle
            {
                ListNode temp = head;
                while(slow != temp) //failure point is start of loop
                {
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null; //no cycle
    }
}
