/*
Time complexity: O(N) 
Space: O(1)
Algorithm:
=========
1. Use 2-pointer technique, iterate one node till there are N nodes between first and second nodes
2. Now, iterate till first node reaches end, second node would be N+1th node from end
3. Remove next node and return head

*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;                 
        for(int i = 0; i <= n ; i++)        // iterate first pointer till the gap between first and second is N
            first = first.next;
        
        while(first != null) {              // Now, maintain N nodes distance between both till first reaches NULL
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;    //This would be N+1th node from end. So, remove next node 
        return dummy.next;
    }
}