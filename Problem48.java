Excuted in Leet Code - Yes
Time complexity - o(n)
Space complexity-constant

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode cn= head;
        ListNode ln = head;
        ListNode nn = cn.next;
        while(ln.next!=null){
         ln=ln.next;
        }
        while(cn!=ln){
            cn.next = ln.next;
            ln.next=cn;
            cn=nn;
            nn=nn.next;
        }
        return ln;
    }
}
