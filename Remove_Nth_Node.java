// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Failed for [1],1
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode slow = head;
        ListNode fast = head;
        int len=0;
        
        for(int i=0;i<n;i++){
            if(fast==null)return null;
            fast=fast.next;
            len++;
        }
        
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}