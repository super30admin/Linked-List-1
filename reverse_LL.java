
//Iterative:
//TC: O(n)
//SC : O(1)

// Maintain 3 nodes not to loose the connection of the current node

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next==null){
            return head;
        }
        ListNode fast = head.next;
        ListNode prev = null;
        ListNode curr=head;
        while(fast!=null){
           curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}



//recursive:
//TC: O(n)
//SC: O(n) if considered stack in the recursion

class Solution {
    public ListNode reverseList(ListNode head) {
if(head ==null || head.next==null){
    return head;
}
ListNode reversed = reverseList(head.next);
head.next.next = head;
head.next = null;
return reversed; // will return the head with the appended or modified list each time
}
}