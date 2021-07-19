//  Time complexity: O(N), where N is the number of ListNodes.
// Space complexity: O(1) 

class Solution2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null; 
        
        // adding a dummy head to the fron of the linked list to handle edge cases
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        
        //  moving faster pointer by n.
        ListNode fast = dummyHead;
        while(n >= 0) {
            fast = fast.next;
            n--;
        }
        
        //  moving both pointers at same speed till fast reaches null
        ListNode slow = dummyHead; 
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // removing the node
        slow.next = slow.next.next;
           
        return dummyHead.next;
    }
}