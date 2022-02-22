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
 
 head = [3,2,0,-4], pos = 1
 
 Let's define m = number of nodes included in cycle. c= number of nodes outside of cycle., d = nodes from point where cycle sarts to intersection. 
 TC - fastptr will travel = to find the cycle(m + n*c + d). where n is some integer. slowPtr will travel m + d. currentPtr will travel c times. 
 Overall = m+n*c+d+m+d+c = 2(m+d+c) = which is little over number of nodes. O(n) where n is the number of nodes in the list.
 SC - O(1)
 */
public class Solution {
    
        
    public ListNode detectCycle(ListNode head) {

            ListNode intersection = getIntersection(head);
        
            if (intersection == null)
            {
                return null;
            }
        
            ListNode current = head;
        
            while(current != intersection)
            {
                current = current.next;
                intersection = intersection.next;
            }
        
        return current;
    }
    
    public ListNode getIntersection(ListNode head)
    {
        if (head == null)
        {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast)
            {
                return fast;
            }
        }
        
        return null;
    }
}