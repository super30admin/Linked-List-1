Executed in leet code -Yes
Time complexity -O(n)
Space Complexity-constant

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sp=head;
        ListNode fp = head;
        
        for(int i=0;i<n;i++){
            fp=fp.next;
        }
        if(fp==null) {
            return head.next;
            
        }
        while(fp.next!=null){
           sp= sp.next;
           fp= fp.next;
        }
        sp.next=sp.next.next;
        return head;
    }
}
