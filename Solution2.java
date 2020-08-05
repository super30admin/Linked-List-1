// Leetcode 206. Remove Nth Node From End of List
/** 3 Pointer Approach: 
 *  Brute force sol: using 2 pass, 1st pass to count the nodes and 2nd to delete using count and given Nth value.
 * 
 *  Implemented ONE PASS sol: 
    1. Using 2 pointers.
    2. fast pointer advances the slow pointer by N+1 steps.
    3. also used a auxilary Dummy node to point to list head.
    4. "dummy" node is used to simplify some corner cases such as a list with only one node, or removing the head.
    5. will keep moving fast ans slow pointer till fast reaches Null and then will remove the next node to slpw pointer.
 */  
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1)

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null) return null;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        int cnt = 0;
        
        while(cnt++<n){
            fast = fast.next;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;  
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}