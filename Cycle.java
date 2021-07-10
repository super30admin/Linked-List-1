
// Time Complexity :O(n)
// Space Complexity :(1)
// Did this code successfully run on Leetcode : Yes     
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode p = head, q = head;
        int flag = 0;
        while (q != null && q.next != null) {
            if (flag == 0) {
                p = p.next;
                q = q.next.next;
            } else {
                while (p != q) {
                    q = q.next;
                    p = p.next;
                }
                return q;
            }
            if (p == q) {
                q = head;
                flag = 1;
            }
        }
        return null;
    }
}