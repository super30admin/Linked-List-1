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
 * recursive approach
 * 
 * time: O(n)
 * space: O(n)
 * 
 * Leetcode run: yes
 * 
 * Approach:
 * 1. Traverse till the last element of the list
 * 2. When base case is reached recursion will unfold
 * 3. Stack will pop the 2nd last element
 * 4. Link the last element's next (head.next.next) to the 2nd last element(head)
 * 5. repeats till the recursion unfolds completely
 *  Here the reversed in local scope doesn't change while unfolding
 * 
 */
class ReverseLinkedListEx2 {
    public ListNode reverseList(ListNode head) {
        // base
        if(head == null || head.next == null) return head;
        
        // logic
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;
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