


// three pointers approach

// TC : O(N)
// SC: O(1)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = null, curr = head, temp = head.next;
        
        while(temp!=null){
            
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
            
        }
        
        curr.next = prev;
        
        return curr;
        
        
        
    }
}






// recursion

// tc: O(N)
// sc: O(N)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return reversed;
        
    }
}









