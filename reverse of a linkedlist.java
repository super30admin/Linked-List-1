//	Timecomplexity:- O(n);
//Space complexity:-O(1);
//Did it run on leetcode:- Yes.
//What were the problems faced while doing it?:- got some wrong answers.
//:- Your code with explanation:- after reversing first node next will be null, second node next will be to first ,third node next will be to second and so onn.Based on this taking three pointers and changing nexts accordingly.


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        
        
   return prev; }
}