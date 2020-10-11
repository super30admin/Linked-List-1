class Solution {// Class Time O(n) space constant
    public ListNode reverseList(ListNode head) {
        
        // Base case 
        if(head == null)
            return head;
        
        ListNode p1 = head ;
        ListNode p2 = head.next;
        head.next = null ;
        while(p2!=null){
            ListNode temp = p2.next;
            p2.next= p1;
            p1 = p2 ;
            p2 = temp;
            
        }
        return p1;
    }
}