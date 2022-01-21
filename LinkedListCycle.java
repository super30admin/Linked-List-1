public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
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
        fast = head;
        if(flag == false) return null;
        while(slow != fast)
        {
            slow= slow.next;
            fast = fast.next;
            
        }
        return slow;
        
    }
}
//Time complexity:- O(N)
//space Complexity: o(1)