/*
Time Complexity: O(N)
Space Complexity: O(1)
Code run on leetcode: yes
any difficulties: no
 */
public class RemoveNthNodeFromEndOfList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void printList(ListNode head){
        ListNode node = head;
        while(node!= null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println("\n");
    }
    public static ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode traversalPtr = head;
        int length = 0; // length of the ListNode
        /*
        Measure length node using traversal pointer and keep increase count of length
         */
        while(traversalPtr!= null){
            length++;
            traversalPtr = traversalPtr.next;
        }
        /*
        The element which we want to remove is from the end, so we have to take length till length-n
         */
        length = length-n;
        traversalPtr = dummy;
        while(length>0){
            length--;
            traversalPtr = traversalPtr.next;
        }

        traversalPtr.next = traversalPtr.next.next;

        return dummy.next;
    }
    public static void main(String[] args){
     ListNode head= new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;
        System.out.print("Input linked list: "+"\t");
        printList(head);

        System.out.print("Listnode after removal: "+"\t");
        removeNthNodeFromEnd(head, 4);
        printList(head);

    }
}
