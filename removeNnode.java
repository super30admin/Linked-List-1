//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //base case
        if(head==null) 
            return head;
        //create a dummy node and set it to slow node
        ListNode d=new ListNode(-1);
        d.next=head;
        //initialize slow, fast and count
        ListNode s=d, f=d;
        int c=0;
        //when the count <= given n value
        while(c<=n){
            //increment count and move fast by 1 node
            c++;
            f=f.next;
        }
        //check if fast is equal to null or not
        while(f!=null){
            //then move slow and fast by 1 node
            s=s.next;
            f=f.next;
        }
        //once the iteration is done, move slow by 2nodes
        s.next=s.next.next;
        
        //and return the next node of dummy
        return d.next;
    }
}