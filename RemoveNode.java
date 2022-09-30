// optimized approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        for(int i=0; i<n; i++)
            fast = fast.next;
        
        if(fast.next == null && slow.next == head){
            slow.next = slow.next.next;
            head = head.next;
        }
        else{
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }
        return head;
    }
}

//Time Complexity :O(n)
//Space Complexity :O(1)