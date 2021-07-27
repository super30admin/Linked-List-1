class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode P1 = dummy;
        ListNode P2 = dummy;
        
        while(n > 0 && P2.next != null){
            P2 = P2.next;
            n -= 1;
        }
        
        while(P2.next != null){
            P1 = P1.next;
            P2 = P2.next;
        }
        //System.out.println(P1.next.val);
        P1.next = P1.next.next;
        return dummy.next;
    }
}

//Time : O(n)
//Space : O(1)