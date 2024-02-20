//Time Complexity = O(n)
//Space Complexity = O(1)
// Does it run on LeetCode successfully? : Yes
// Any difficulties: not as such once we get knack of logic

/*
It is three pointers approach.
prev = null
curr = head
fast = head.next

At the end, return prev node which is starting point (head of your new reversed LinkedList)
*/

public class ReverseLinkedList_2 {

    class ListNode{// Singly Linkedlist representation
        int val;
        ListNode next; //initially it is alway null unless specified. This is object reference.

        ListNode(){ //Empty Constructor
        }

        //One argument constructor
        ListNode(int val){
            this.val = val;
        }

        //two arguments constructor
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode prev = null;
//        ListNode curr = head;
//        ListNode fast = head.next;
//
//        while(fast != null){
//            curr.next = prev;
//            prev = curr;
//            curr = fast;
//            fast = fast.next;
//        }
//        curr.next = prev;
//        return curr;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = null;

        while(curr != null){
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
//            fast = fast.next;
        }
//        curr.next = prev;
        return prev;
    }

    public static void main(String[] args){
        ReverseLinkedList_2 rvslist = new ReverseLinkedList_2();
        ListNode head = rvslist.new ListNode(2);
        head.next = rvslist.new ListNode(03);
        head.next.next = rvslist.new ListNode(5);
        head.next.next.next = rvslist.new ListNode(9);
        head.next.next.next.next = rvslist.new ListNode(-11);
        head.next.next.next.next.next = rvslist.new ListNode(31);
    }
}