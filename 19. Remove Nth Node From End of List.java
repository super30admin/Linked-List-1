class Solution {// time of O(n) space constant
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        
        ListNode p1 = dummy ;
        ListNode p2 = dummy ;
        
        for(int i =1 ;i<= n+1;i++){
            p2 = p2.next ;
        }
        while(p2!=null){
            p1 = p1.next ;
            p2 = p2.next ;
        }
        p1.next = p1.next.next ;
        return dummy.next ;
    }
}