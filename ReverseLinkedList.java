// Time Complexity : O(n) where n is the number of nodes as we traverse the entire list once
// Space Complexity :O(1) no extra space used; not accounting for the recursive stack space used In case of the recursive solution
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        //return iterativeReverse(head);
        return recursiveReverse(null, head);
    }

    public ListNode iterativeReverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        ListNode next;
        head.next = null;

        do{
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;

        }while(current != null);
        head = prev;
        return head;
    }

    public ListNode recursiveReverse(ListNode parent, ListNode child){

        ListNode nextChild = child.next;
        child.next = parent;
        if(nextChild == null){
            return child;
        }else{
            return recursiveReverse(child, nextChild);
        }
    }
}

