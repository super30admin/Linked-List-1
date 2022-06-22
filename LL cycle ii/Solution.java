// Time Comlpexity: O(n)
// Space Complexity: O(1)
public class Solution {
     public ListNode detectCycle(ListNode head) {  
        // write your code here
        if(head == null) return null;
        ListNode slow = head, fast = head;
        do{
            if(fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            
        }while(slow != fast);
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
