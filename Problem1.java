//Accepted on LT
//The idea is to maintain a temp for next node and change the pointer direction
//Time should be O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode c = head;
    ListNode p = null;
    ListNode next = null;
    while(c!=null){
        next = c.next;
        c.next = p;
        p=c;
        c=next;
            
    }
        return p;
        
    }
}