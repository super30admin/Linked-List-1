//Time Complexity: O(N)
//Space Complexity: O(1)

//Iterative solution
//We make use of three pointers for this solution. We use two of these to reverse the linked list and the third one to keep a track 
//of the next element since there will be no connection between our current pointer and the list once we set curr.next to prev 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast!= null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        //for the last node
        curr.next = prev;
        return curr;
    }
}

//Revursive solution
//Time Complexity: O(N)
//Space Complexity: O(N)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reversed = reverseList (head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}