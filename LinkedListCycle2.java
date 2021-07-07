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

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//time - O(n)
//space - O(n) for the recursive stack

//call stack
// 1-2-3-4-null => 2-3-4-null => 3-4-null => 4-null
//                               => 4-3-null (head.next.next = head and head.next = null)
//                 =>4-3-2-null
//    =>4-3-2-1-null (return current)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode current = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }
}
