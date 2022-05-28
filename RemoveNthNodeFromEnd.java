/**
 * Time complexity is O(n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        ListNode1 head = new ListNode1(1);
        ListNode1 curr = head;
        for(int i=1; i< a.length; i++){
            curr.next = new ListNode1(a[i]);
            curr = curr.next;
        }

        ListNode1 resultHead = removeNthFromEnd(head, 2);

        while(resultHead != null){
            System.out.println(resultHead.val);
            resultHead = resultHead.next;
        }
    }

    private static ListNode1 removeNthFromEnd(ListNode1 head, int n) {
        //base case
        if(head == null){
            return null;
        }

        ListNode1 dummy = new ListNode1(-1);
        //Adding a dummy node before the head, gives us the ease to write to code
        //without having to handle separately the case where we have to delete
        //head node or even if there is only one node in the list
        dummy.next = head;
        ListNode1 slow = dummy;
        ListNode1 fast = dummy; //fast is ahead of slow, and hence the name
        int count = 0;

        //We move the fast pointer until the count is <= n
        while(count <= n){
            count++;
            fast = fast.next;
        }

        //Then we move slow and fast at 1x speed, until fast is null
        //This places the slow at (n-1)th position form end
        //As we want to remove nth node, we reset links and we remove
        //the nth node
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        //Reset the links and remove nth node
        slow.next = slow.next.next;
        //As head is at dummy.next, we return that
        return dummy.next;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}