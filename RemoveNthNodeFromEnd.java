// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// - Use a dummy node before the head to handle edge cases like removing the first node.
// - Use two pointers: `fast` and `slow`, both starting at the dummy node.
// - Move `fast` pointer n+1 steps ahead (so there are `n` nodes between `slow` and `fast`).
// - Move both `slow` and `fast` one step at a time until `fast` reaches the end.
// - At this point, `slow` is right before the node to be removed.
// - Modify `slow.next` to skip the target node (`slow.next = slow.next.next`).
// - Return `dummy.next` as the new head of the list.



class ListNode {
    int val;
    ListNode next;
    ListNode () {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}



public class RemoveNthNodeFromEnd {
    public ListNode solve(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int c = 0;

        while(c<=n){
            c++;
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }


    public static ListNode creaList(int[] arr){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for(int num : arr){
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            if(head.next!=null){
            }
            head=head.next;
        }
        System.out.println();
    }



    public static void main(String[]args){
        RemoveNthNodeFromEnd ob = new RemoveNthNodeFromEnd();
        int[] input = {1,2,3,4,5};
        int n = 2;

        ListNode head = creaList(input);
        System.out.println("Original List: ");
        printList(head);

        ListNode updated = ob.solve(head, n);
        System.out.println("After removing " + n + "th node from end: ");
        printList(updated);

    }
    
}
