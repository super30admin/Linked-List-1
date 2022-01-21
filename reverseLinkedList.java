class Solution {
    public ListNode reverseList(ListNode head) {
        
    if (head == null || head.next == null) return head;
       
    ListNode p = reverseList(head.next);
    System.out.println(p); 
    head.next.next = head;   
    head.next = null;
    return p;
        
    }
}

//time complexity:- o(n)
//space complexity:- o(1)