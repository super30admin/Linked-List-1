/**
 * 
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
 * 
 * time: O(n)
 * space: O(1)
 * 
 * Leetcode run: Yes
 * 
 * Approach:
 * Two pointers for single traversal
 * 
 *  1. start the fast pointer from dummy node (head) 
 *  2. move the fast pointer till the count of nodes reach n
 *  3. after fast reaches n nodes, start the slow pointer from dummy node (head)
 *  4. move both the pointers by 1 till the fast reaches last element
 *    (this maintains gap between the two pointers (sliding the window),
 *    which places the slow pointer before the nth element from the end of the list)
 *  5. the next node to slow must be removed
 *   
 *  
 *    S       F
 *    |       |
 * [ -1   1   2   3   4   5  ]
 *    ^
 *    |
 *    dummy node 
 * 
 *   dummy node handles case like: 
 *    [ 1 ], 1 - remove 1st element from the end of the list  
 * 
 */
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);        
        dummy.next = head;
        ListNode fast = dummy;
        int count = 0;
        
        while(count < n){
            fast = fast.next;
            count++;
        }
        
        ListNode slow = dummy;
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}

/**
 * Definition for singly-linked list.
 *  */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
