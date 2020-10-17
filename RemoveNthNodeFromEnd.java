/**
 * Time Complexity: O(n)
 * Space Complexity : O(1) no extra space
 * Leetcode : Yes
 * Idea: 
 * 1. Calculate size of list
 * 2. Iterate till you find the position from end
 * 3. Make the next node of previous point to current node's next
 */

class RemoveNthNodeFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        // size calc
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }

        curr = head;
        int counter = 0;
        ListNode prev = null;
        while(curr != null){
            
            // found the position - delete
            if(counter == (size - n)){
                if(prev == null){
                    head = curr.next;
                }
                else {
                    prev.next = curr.next;
                }                                
            }
            counter++;
            prev = curr;
            curr = curr.next;
        }
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
        System.out.println("RemoveNthNodeFromEnd");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
        head = obj.removeNthFromEnd(head, 5);
        obj.printList(head);

    }
}