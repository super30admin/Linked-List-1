// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        int len = 0;
        
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        
        if(len == n) return head.next;
        
        int count = 0;
        curr = head;
        while(count < len - n -1){
            count++;
            curr = curr.next;
        }
        
        if(curr.next == null){
            return null;
        }
        else{
            curr.next = curr.next.next;
        }
        
        return head;
    }
}
