// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

public class removeNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy_node=new ListNode(-1);
        dummy_node.next=head;
        ListNode slow=dummy_node;
        ListNode fast=dummy_node;
        int count=0;
       
        while(count<n){
            fast=fast.next;
            count++;
        }
        while(fast.next!=null){
            
            slow=slow.next; 
            fast=fast.next;    
        }
         
          slow.next=slow.next.next;    
        return dummy_node.next;
    }
    
}
