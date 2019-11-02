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

/* 141. Linked List Cycle
Approach 1: Hash Table
Time Complexity: O(n)
Space Complexity: O(n)
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head))
                return true;
            else
                set.add(head);
            head = head.next;
        }
        return false;
    }
}

/* 141. Two Pointers => Floyd's algorithm
Time Complexity: O(n)
Space Complexity: O(1)
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}


/* 142. Linked List Cycle II, Approach 1 => Hash Table
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        Set<ListNode> set = new HashSet<>();

        while(head != null){
            if(!set.contains(head))
                set.add(head);
            else
                return head;
            head = head.next;
        }
        return null;
    }
}

/* 142. Linked List Cycle II, Approach 2 => Two Pointers, Floyd's algorithm
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(!flag)
            return null;

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

