/**
 * time: O(n)
 * space: O(1)
 * 
 * Leetcode run: yes
 * 
 * Approach:
 * 1. have a pointer after current and before current
 * 2. switch the curr.next link to prev, job of prev is done 
 * 4. move prev to curr, job of curr is done
 * 5. move curr to fast
 *  repeat 
 * 6. finally because of while condition, 
 * the last link will be pending, switch the curr.next link to prev
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        
        return curr;
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