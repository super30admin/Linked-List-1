//Time Complexity = O(n)
//Space Complexity = O(1)
// Does it run on LeetCode successfully? : Yes
// Any difficulties: no

/*
It is two pointers approach.
Bring fast pointer to kth difference. Then after keep moving slow and fast pointer by 1.

If n=length of list (remove head). In order to handle that special condition being introduced.

#Sliding Window pattern
*/

public class RemoveNthNodeFromEndWODummyNode {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <=0 ) return null;
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;

        while(count<=n){
            fast = fast.next;
            //if n is length of LinkedList. i.e. remove the head
            if(fast == null && count <n){
                return head.next;
            }
            count++;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        //Remove the node
        ListNode temp = slow.next; //Node to delete
        slow.next = slow.next.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args){
        RemoveNthNodeFromEndWODummyNode nth = new RemoveNthNodeFromEndWODummyNode();
        ListNode head = nth.new ListNode(2);
        head.next = nth.new ListNode(03);
        head.next.next = nth.new ListNode(5);
        head.next.next.next = nth.new ListNode(9);
        head.next.next.next.next = nth.new ListNode(-11);
        head.next.next.next.next.next = nth.new ListNode(31);

//        2->03->5->9->-11->31
//        9th node (3rd from last to be removed here)
        nth.removeNthFromEnd(head, 3);
    }

}