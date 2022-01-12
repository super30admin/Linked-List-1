
// Did this code successfully run on Leetcode : Yes

// Recursive solution *********************************
// Time Complexity :O(n)
// Space Complexity :O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode reversed=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        
        return reversed;
    }
}

//Iteravtive Solution **********************************
// Time Complexity :O(n)
// Space Complexity :O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}