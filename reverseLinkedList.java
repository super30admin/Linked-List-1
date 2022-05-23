// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
       ListNode prev=null;
        ListNode curr=head;
        ListNode fast=curr.next;
        while(fast!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;
       
        
    }
    //brute force space O(n)  time O(n)
    private ListNode myanswet(ListNode head){
         List<Integer> list=new ArrayList<Integer>();
        if(head==null)
            return head;
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        ListNode newhead=new ListNode(list.get(0));
        for(int i=1;i<list.size();i++)
        {
             ListNode temp=new ListNode(list.get(i));
            temp.next=newhead;
            newhead=temp;
            
        }
        return newhead;
    }
}