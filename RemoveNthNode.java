/*
Desc : We use a buffernode that would point to head node just to handle an edge case where the headnode would be required to
be removed, we create a space between the slow and fast pointer at first and then iterate over the whole list by moving both slow and fast pointer
one node at a time until the next of fast pointer would result in a null. Later we just point the nex pointer of slow to the nex.next of itself thus removing the immidiate
consecutive node from slow i.e; the nth element of the list.
Time Complexity : O(n)
Space Complexity : O(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode buffernode = new ListNode(-1);
        buffernode.next = head;
        ListNode slow = buffernode;
        ListNode fast = buffernode;
        int count=0;
        while(count<n){
            count++;
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return buffernode.next;
    }
}
