package linkedList1;
/**
 * 
 * We maintain the slow and fast pointers such that they start at n+1 distance from each other. And then we move fast and slow by one element till fast reaches the end and slow will point the 
 * element previous to the one that has to be removed. Then normal deleteion can be performed.
 *  
 * Time Complexity :
 * O(n) 
 *  
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head.next;
        if(head.next==null)
            return null;

        for(int i=1;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            ListNode temp=slow.next;
            slow.next=null;
            return temp;
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;

        return head;

    }
}
