//TC O(N)
//SC O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        int count = 0;
        
       // ListNode dummy = new ListNode(Integer.MAX_VALUE);
       // dummy.next = head;
        ListNode fast = head, slow = head;
        
        
        while(count <= n && fast != null){
            fast = fast.next;
            count++;
            
        }
        
        //the nth node from last is head for ex: 1-> 2 -> null , n = 2
        if(fast == null && count <= n)
            return head.next;
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;            
        }
        
        slow.next = slow.next.next;
        
        return head;
        
        
    }
}