// Time Complexity - O(n) where n is the number of nodes in the linked list
// Space Complexity - O(1) Since we are using constant space variables for space only
// This solution worked on LeetCode

// In 

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null )    return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count =0;
        while(count < n && fast.next != null){
            fast = fast.next;
            count+=1;
        }
        while( fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;        
    }
}
