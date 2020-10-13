// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev=None
        cur=head
        after=None
        while cur is not None:
                after=cur.next
                cur.next=prev
                prev=cur
                cur=after
                
        return prev