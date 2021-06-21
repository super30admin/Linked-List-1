//TC O(N)
//SC O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean flag = false;
        
		//fast and slow meet inside the cycle 
        while(fast != null && fast.next != null){
                        
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                flag = true;
                break;
            }
                     
        }
        
		// reset one of slow or fast to head and move at 1x speed
		// the point at where they meet is the start of cycle
        if(flag == true){
            
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
            
        }
        else {
            return null;
        }
        
        
        
    }
}