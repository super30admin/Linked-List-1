//Time Complexity: O(n)
//Space complexity: O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return null;
        //We make use of a fast and a slow pointer to find the cycle in the linked list. Fast moves at 2x speed of the slow pointer  
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            // break condition for when we have found the cycle in the linked list
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        
        //resetting one of the pointers to the starting of the node
        fast = head;
        {
            //looping till we find the index of the loop
            while(fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }    
        
    }
}