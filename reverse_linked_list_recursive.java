class Solution {
    
    public ListNode reverseList(ListNode head) {
        return helper(head.next,head);
    }
    public ListNode helper(ListNode head, ListNode node){
        if(head==null) return node;
        ListNode temp = head.next;
        head.next=node;
        return helper(temp,head);
    }
}
