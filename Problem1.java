
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Used a stack and stored all the values. then popped each element to put that in the stack

import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {

        Stack<Integer> st = new Stack<Integer>();

        ListNode mynode = head;
        ListNode mynode2 = head;

        while (mynode != null) {
            System.out.println(mynode.val);
            st.push(mynode.val);
            mynode = mynode.next;
        }

        int result = 0;
        // System.out.println("re"+result);
        while (mynode2 != null && !(st.empty())) {
            System.out.println("re" + result);
            result = st.pop();
            mynode2.val = result;
            mynode2 = mynode2.next;
        }

        return head;

    }
}