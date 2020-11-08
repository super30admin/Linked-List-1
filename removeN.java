//Time complexity: O(n)
//Space complexity: O(1)
//Program ran successfully
/*
    Algorithm: 1. Two pointers are used: one is slow and the other one is fast
               2. The algorithm is based on the idea that the difference between the two pointers is n+1
               3. Once the fast pointer reaches null, the slow pointer is at one node prior to the node that is to be removed
*/
class removeN{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count <= n){
            fast = fast.next; 
            count++; 
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;        
        return dummy.next;
    }
}
