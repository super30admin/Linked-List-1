Iterative solution:
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
we do this problem using three pointers.we start by adjusting these three pointers to get the linked list reversal.

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev=None
        curr=head
        while curr!=None:
            next1=curr.next
            curr.next=prev
            prev=curr
            curr=next1
        return prev


Recursive solution:
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
Inorder to reverse the linked list we traverse to the end of the linked list and point the next of next element of the current element to the current element.In this manner we do this for all the nodes.


class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None or head.next==None:
            return head
        rev=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return rev