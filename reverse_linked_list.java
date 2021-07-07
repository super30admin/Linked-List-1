Working code
Didnot put the curr.next = prev in the last step

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode curr, prev, succeed;
        
        curr = head.next;
        prev = head;
        succeed = curr.next;
        head.next = null;
        while(succeed!= null){
            curr.next = prev;
            prev = curr;
            curr = succeed;
            succeed = succeed.next;
            System.out.print("curr "+ curr.val); 
        }
        curr.next= prev;
        return curr;
        
    }
}
