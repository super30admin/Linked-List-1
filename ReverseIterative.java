// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

    class Solution {
        public ListNode reverseList(ListNode head) {
            
            if(head==null) return null;
            ListNode prev = null;
            ListNode curr = head;
            ListNode fast = curr.next;
            while(fast!=null){
                curr.next = prev;
                prev = curr;
                curr= fast;
                fast = fast.next;
            }
            curr.next = prev;
            return curr;
            
        }
    }

