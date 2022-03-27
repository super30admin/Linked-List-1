// Time Complexity : O(n) where n is the no.of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// CODE 


public class removeNthNodeFromEndofLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count=0;
        while(count<n){   
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null){  //creating a sliding window ;till the time fast.next will be null , we will reach one node previous to the node to be deleted
            slow = slow.next;
            fast = fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;  //we cannot return head here because head can also be the element to be deleted
    }
}
