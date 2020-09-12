/* https://leetcode.com/problems/reverse-linked-list
206. Reverse Linked List - EASY
*/
public class ReverseLinkedList {
    /*
    TC: O(n)
    SC: O(n)
    Approach: recurse on head.next
    each call backlinks the node after head to head and sets head to point to null. 
    head.next has to point to null at the end, since that is the last node.
    */
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode rest = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        
        return rest;
    }
    
    /*
    TC: O(n)
    SC: O(1)
    Approach: Have 3 pointers, prev, curr, and next. At every iteration, set curr to point to prev.
    And save a reference to the node after curr in next, for the next iteration.
    */
    public ListNode reverseListIterative(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode p = null, n = null, c;
        c = head;
        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        
        return p;
    }

    public void printLL(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        } 
        System.out.println();
    }

    public static void main(String args[]) {
        ReverseLinkedList r = new ReverseLinkedList();
        
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = null;

        r.printLL(r.reverseListRecursive(head));
    }
}