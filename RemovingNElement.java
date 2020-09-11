// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    
    // Only one pass
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        
        while(n>=0) {
            p1 = p1.next;
            n--;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
            
        }
        p2.next = p2.next.next;
        return dummy.next;
    }

    
    // Passing the list two times
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = 0;
        while(curr != null){
          curr = curr.next;  
            len++;
        }

        n = len-n;
        ListNode prev = null;
        curr = head;
        int pos = 0;
        while(curr != null){
            if(pos==n){
                if(prev==null){
                    head = curr.next;
                }else{ 
                    prev.next = curr.next;
                }
                break;
            }
            prev = curr;
            curr = curr.next;
            pos++;
        }     
        return head;
    }
}