
/*
1) Iterative Approach

    Time Complexity : O(N)
    Space Complexity: O(1)
    Worked on leetcode :  YES

2) Recursive Approach

   

    Time Complexity : O(N)
    Space Complexity: O(N) recursive space
    Worked on leetcode :  YES
*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Reverse_LinkedList{
    public ListNode reverseList_Iterative(ListNode head) {
        
        // if head is null or there is only one element in linkedlist return head         
        if (head == null || head.next == null ) return head;
        
        ListNode prev = null;
        ListNode curr =  head;
        ListNode curr_next = head.next;
        
        while (curr_next != null){
            // Null ->1->2 becomes 
            // null <- 1 2 -> 3 -> 4 -> 5
            curr.next = prev;
            
            prev =  curr;
            curr  = curr_next;
            curr_next = curr_next.next;
        }
        
        // for handling 4 -> 5 case and current is on 5 
        curr.next = prev;
        
        return curr;
        
    }

    public ListNode reverseList_Recursion(ListNode head) {
        
        if ( head == null || head.next == null) return head;
        
        
        ListNode res = reverseList_Recursion(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return res;
        
    }
}