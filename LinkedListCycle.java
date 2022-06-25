/*
This approach solves the problem using a slow and fast pointer. The fast pointer moves twice as fast as the slow pointer,
and both pointers start at the head of the linked list. If there is a cycle in the list, the fast pointer will eventually
coincide with the slow pointer at a particular location. We then reset the slow pointer to the head of the list, and then
set the fast pointer to travel at the same speed as the slow pointer. Eventually because of mathematical proof, both the
pointers will coincide at the location where the cycle occurs

Did this code run on leetcode: Yes
*/
public class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public ListNode detectCycle(ListNode head) {
        
        if(head == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag =  false;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        //No cycle found
        if(!flag)
            return null;
        
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}