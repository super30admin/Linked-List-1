/*
 * Approach #1:
 * The goal is to remove the Nth node from the end of a singly linked list.
 * First we calculate the length of linkedlist.
 * Then we determine the position of the node to be removed from the start (ie. length-n)
 * We use a dummy node before the head to simplify edge cases(like deleting the head)
 * We traverse to the node just before the one we want to delete and adjust pointer to remove it.
 * 
 */

public class ListNode {
    int val;
    ListNode next; // Fixed typo: Changed 'Listnode' to 'ListNode'
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n){

        
        //Create a dummy node that points to the head of the list
        //This helps handle edge cases (eg, removing head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //Variable to store total length of the linkedlist
        int length = 0;

        //Use 'first' to calculate the length of the linkedlist
        ListNode first = head;
        while(first != null){
            length++;
            first = first.next;
        }

        //Calculate the position of the node just before the one to be removed
        length -= n;

        //Start again from the dummy node
        first = dummy;

        //Move 'first' to the node right before the target node
        while(length>0){
            length--;
            first = first.next;
        }

        //Remove the Nth node from the end by skipping it in the first
        first.next = first.next.next;

        //Return the new head of the list(could be different if head was removed)
        return dummy.next;
    }
}


//Time Complexity: O(L) : The algorithm makes teo traversal of the list, first to calculate list length L and second to find the (L-n)th node.
//Space Complexity: O(1): We only use constant extra space for the dummy node and a few variables.