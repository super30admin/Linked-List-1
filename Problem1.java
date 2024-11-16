// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Problem1 {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        //return reverseListItr(head);
        ListNode newHead =  reverseListRecur(head);
        head.next = null;
        return newHead;

    }
    //TC :O(N)
    //SC :O(1)
    public ListNode reverseListItr(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;

        while(curr != null){

            temp=curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }


        return prev;
    }
    //TC :O(N)
    //SC :O(N)
    public ListNode reverseListRecur(ListNode node) {

        if(node.next == null){
            return node;
        }
        ListNode nextNode =  reverseListRecur(node.next);
        node.next.next = node;

        return nextNode;
    }
}