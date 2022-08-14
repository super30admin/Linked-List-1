// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode list = new ListNode();
        list.next=head;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int num=count-n;
        int i=0;
        head=list;
        while(num>0){
            num--;
            head=head.next;
        }
        head.next=head.next.next;
        return list.next;
    }
}