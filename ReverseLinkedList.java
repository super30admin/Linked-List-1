//The approach here is to use three pointers previous, current and a temporary variable and traverse through the linkedlist where at every node, we reverse the linkedlist
//Time Complexity:O(n)
//Space Complexity: O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = cur;
        while(cur!=null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}

//The approach here is to use recursion to reverse the linkedlist. Here, when we reach the last -1 node, then we make it's next node's next point to the latest head, which is last-1 node.
//We repeat this process for all the nodes
//Time Complexity: O(n)
//Space complexity: O(1)
class Solution1 {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        result = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return result;
    }

}