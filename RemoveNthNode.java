
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null)
        return null;
 
    ListNode p = head;
    int len = 0;
    while(p != null){
        len++;
        p = p.next;
    }
 
    int index = len-n+1;
    if(index==1)
        return head.next;
 
    p = head;
    int i=0;
    while(p!=null){
        i++;
        if(i==index-1){
            p.next = p.next.next;
        }
        p=p.next;
    }
 
    return head;
}
}
