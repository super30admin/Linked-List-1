//time :O(n) n - number of elements
//space : O(1);
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }else{
            ListNode p1=head;
            ListNode p2=head.next;
            ListNode temp=null;
            p1.next=null;
            boolean done=false;
            while(!done){
                if(p2.next!=null){
                    temp=p2.next;
                    p2.next=p1;
                    p1=p2;
                    p2=temp;
                    temp=null;
                }else{
                    p2.next=p1;
                    done=true;
                }
            }
            return p2;
        }

    }
}