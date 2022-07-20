/**Time Complexity :
    O(n)
// Space Complexity :
    O(n)
// Did this code successfully run on Leetcode :
     Accepted
// Any problem you faced while coding this :   
    NO
// Your code here along with comments explaining your approach**/


class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode reversed = reverseList(head.next);
        //stack pop
        head.next.next=head;
        head.next=null;
        return reversed;
    }
}