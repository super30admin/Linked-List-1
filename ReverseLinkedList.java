//TC : o(n)
//SC : O(1)
//https://leetcode.com/problems/reverse-linked-list/

//Iterative approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != null && fast!= null){
            slow.next = temp;
            temp = slow;
            slow = fast;
            fast = fast.next;
            slow.next=temp;
            //System.out.println(slow.val);
        }
        return slow;
    }
}

//recursive 1 - reversing left to right

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        return helper(head,null,head.next);
        
    }
    private ListNode helper(ListNode slow, ListNode prev, ListNode fast){
        if(fast==null) return slow;
        
        slow.next= prev;
        prev = slow;
        slow = fast;
        fast = fast.next;
        ListNode reverse = helper(slow,prev,fast);
        slow.next = prev;
        return reverse;
    }
}

// recursive 2 - reversing right to left
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse; 
    }
}
