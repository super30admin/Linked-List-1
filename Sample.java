// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast= head;
        
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                
                break;
            }}
            if(fast == null || fast.next == null) return null;
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
       
        
    
}
///////
/// 
/// 
