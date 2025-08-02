// Time Complexity : O(N) N-> no of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// - Use two pointers: `pre` (initially at head) and `cur` (initially at head.next).
// - Traverse through the list while `cur` is not null.
// - At each step, store the next node of `cur` in a temporary variable.
// - Point `cur.next` to `pre` to reverse the link.
// - Move `pre` and `cur` one step forward.
// - After the loop, make sure the old head's `next` is set to null, since it's now the tail.
// - Return `pre` which becomes the new head of the reversed list.



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}


public class ReverseLinkedList {
    public ListNode solve(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;

        while(cur!=null){
            ListNode temp = cur.next;
            cur.next  = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.println(head.val+ " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[]args){
        ListNode head = new ListNode(1,
                            new ListNode(2,
                                new ListNode(3,
                                    new ListNode(4,
                                        new ListNode(5)))));
                                
        System.out.println("Original List: ");
        printList(head);

        ReverseLinkedList ob = new ReverseLinkedList();
        ListNode reversedHead = ob.solve(head);
        System.out.println("Reversed List: ");
        printList(reversedHead);

    }
    
}
