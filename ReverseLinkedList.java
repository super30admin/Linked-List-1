/*
Time Complexity: O(n)
Space Complexity: O(1)
COde run on Leetcode: yes
Any difficulties faced: no

Approach followed:
1. Used prev pointer as null and then just swapped the next pointer to reverse the direction
 */
public class ReverseLinkedList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        while(head!= null){
            ListNode currPtr = head.next;
            head.next = prev;
            prev = head;
            head = currPtr;
        }
        printList(prev);
        return prev;
    }
    public static void printList(ListNode head){
        ListNode node = head;
        while(node!= null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        ListNode head= new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        third.next = null;
        System.out.print("Input Linked List: ");
        printList(head);
        System.out.print("Reversed Output: ");
        reverseLinkedList(head);
    }
}
