//reverse linked list 
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
It is three pointer approach. First pointer will point to head, another to head.next and another to head's
prev node. while we reach the end of the node, we reverse each node. We make curr's next to prev node and then 
moving onto next of curr
*/
class Problem1{
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = reverseList(head);
        while(res != null){
            System.out.print(" " +res.val);
            res = res.next;

        }
        

    }
    public static ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }
}



