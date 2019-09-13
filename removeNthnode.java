//time complexity O(n)
//Ran on leetcode and accepted
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Make a dummy node with value 0
        ListNode dummy = new ListNode(0);
        //such that its next points to the head
        dummy.next = head;
        //a first pointer that points to dummy 
        ListNode first = dummy;
        //a second pointer that points to dummy 
        ListNode second = dummy;
        //will iterate n+1 times 
        for(int i = 1; i<=n+1; i++)
        {
            //Moving first pointer forward
            first = first.next;
        }
        //As long as first pointer value not null 
        while(first!=null)
        {
            //move first and second pointer
            first = first.next;
            second = second.next;
        }
        //The next pointer of the previous element pointd to the next thus removing the given element
        second.next = second.next.next;
        //return values after the dummy element 
        return dummy.next;
    }
}