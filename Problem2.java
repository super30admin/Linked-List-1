// Time Complexity - O(n) where n is the number of nodes in the linked list
// Space Complexity - O(1) Since we are using constant space variables for space only
// This solution worked on LeetCode

// In this solution we need to remove the nth node from the end in the list. In order to do that, we need to reach to the node previous to the node that needs to be removed. Which is why we needed a dummy node added at the start of the head. 

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null )    return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count =0;
        while(count < n && fast.next != null){  // traverse the fast pointer n times to reach the nth element from the start
            fast = fast.next;
            count+=1;
        }
        while( fast.next != null){
            fast = fast.next;               // traverse the slow starting from the dummy and the fast starting from the nth node till the fast reaches the last node. Doing so, the slow will reach the n-1th node from the end
            slow = slow.next;
        }
        slow.next = slow.next.next;         // Now, point the n-1th node next to the n+1 node from the end. This will skip the nth node from the end
        return dummy.next;                  // Return the head or dummy.next
    }
}
