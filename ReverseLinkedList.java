//Time Complexity = O(n)
//Space Complexity = O(1)
// Does it run on LeetCode successfully? : Yes
// Any difficulties: not as such once we get knack of logic

/*
It is three pointers approach.
prev = head
curr = head.next
fast = head.next.next

At the end, curr.next = prev is required as that link remains as is as fast becomes null
That node is yet to be processed.
Also, prev (head) node's initial next link creates cyclic dependency. That also needs to be removed at the end.
*/

public class ReverseLinkedList {
    class ListNode{// Singly Linkedlist representation
        int val;
        ListNode next; //initially it is alway null unless specified. This is object reference.

        ListNode(){ //Empty Constructor
        }
        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode fast = head.next.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        head.next = null;

        return curr;
    }

    public static void main(String[] args){
        ReverseLinkedList rvslist = new ReverseLinkedList();
        ListNode head = rvslist.new ListNode(2);
        head.next = rvslist.new ListNode(03);
        head.next.next = rvslist.new ListNode(5);
        head.next.next.next = rvslist.new ListNode(9);
        head.next.next.next.next = rvslist.new ListNode(-11);
        head.next.next.next.next.next = rvslist.new ListNode(31);
    }
}