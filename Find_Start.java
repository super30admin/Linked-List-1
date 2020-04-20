// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int cycleLength = 0;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycleLength = getLength(slow);
                break;
            }
        }
        
        if(cycleLength==0)return null;
        
        return findStart(head,cycleLength);
    }
    
    private int getLength(ListNode slow){
        int length = 0;
        ListNode current = slow;
        do{
            current=current.next;
            length++;
        }
        while(current!=slow);            
        return length;       
    }
    
    private ListNode findStart(ListNode head, int cycleLength){
        ListNode pointer1=head;
        ListNode pointer2=head;
        
        while(cycleLength>0){
            pointer2=pointer2.next;
            cycleLength--;
        }
        
        while(pointer1!=pointer2){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return pointer1;
    }
    
    
}