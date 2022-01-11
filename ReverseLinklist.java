// Time Complexity : algo is iterating through whole list so it will be o(n)
// Space Complexity : i am not using extra space so it will be o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach



class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        
        return prev;
        
        
        
    }
}