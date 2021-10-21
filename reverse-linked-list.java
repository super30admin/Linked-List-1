//Time Complexity:O(n)
//Space Complexity:O(1)
//running on leetcode:
//brute force: keep a stack , traverse linked list add elements to stack. pop from stack and make a new linked list TC: O(n), 2 passes, one for putting in stack and one for popping out. SC: O(n), one stack and a new linked list

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null)
        {
            return null;
        }
        //take 3 pointers
        ListNode prev=null, curr=head, p1=curr.next; //p1 =fast
        while (p1!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=p1;
            p1=p1.next;
        }
        curr.next=prev;
        return curr;
    }
}
