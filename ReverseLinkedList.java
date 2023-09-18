class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;


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
Tc : O(n)

SC : O(1)


Description : 

Using 3 pointers prev, Curr, fast we can reverse Linked list with O(n) complexity 



 */



// Recursion

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode reversed = reverseList(head.next);
        //st.pop()

        head.next.next = head;
        head.next = null;

        return reversed;
    }
}