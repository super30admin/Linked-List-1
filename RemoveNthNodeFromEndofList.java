// Time Complexity O(L) 
//Space Complexity  O(1)


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        ListNode slow = temp;
        ListNode fast = temp;
        
        for(int i = 1; i<=n+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return temp.next;
    }
}