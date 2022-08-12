
//TC:O(n)
//SC:O(1)
	

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //create a dummy node to avoid the edge case of removing first element, then if slow is at dummy , slow.next = slow.next.next will remove first element
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
       //to move the fast point by n nodes and maintain gap of 2 between fast and slow
        for(int i=0; i<=n;i++){
            fast = fast.next;
        }
        //move both pointers by 1 node equally so when fast reaches the end slow will be exactly behind the node that needs to be removed
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //change the link to slow.next.next
        slow.next = slow.next.next;
        head = dummy.next;
        //return dummy.next which represents the head, when there is 1 node and you delete the head then you cannot return head return head then 
        return head;
    }
    
}