// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        prev=None #previous is None
        curr=head
        while curr:  # traversing every node using current
            new=curr.next #introduce next
            curr.next=prev # direct link back to prev to reverse
            prev=curr # change previous to curr
            curr=new # change curr to new
        return prev # r
        

            