/**
 * Time Complexity: O(n)
 * Space Complexity: O(1) - no extra space
 * Leetcode : Yes
 * Idea:
 * 1. Iterate through the list, make current node's next point to previous node.
 * 2. move forward until NULL
 * 3. Make the final prev node on break as head.
 */

class ReverseLinkedList {

    public static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }

    public ListNode reverseList(ListNode head) {

        if(head == null)
            return head;
        
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr;
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = temp;
            curr = nextNode;            
        }

        head = prev;
        return head;
    }


    public void printList(ListNode head){
        ListNode curr = head;

        while(curr!= null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        System.out.println("ReverseLinkedList");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList obj = new ReverseLinkedList();
        head = obj.reverseList(head);
        obj.printList(head);

    }
}