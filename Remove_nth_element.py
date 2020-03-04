Iterative solution without one pass:
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
we have done this problem using a dummy node.where we find the length of the linked list using traversal and then calculate the length required to reach the nth element from the start.we then delete the nth element from the linked list.


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        c=0
        dummy=ListNode(1)
        dummy.next=head
        temp=head
        temp1=dummy
        temp2=dummy
        while(temp1!=None):
            c=c+1
            temp1=temp1.next
        # print(c)
        k=c-n
        # print(k)
        while(k>0):
            if k>1:
                temp2=temp2.next
            k=k-1
            temp=temp.next
        temp2.next=temp
        return(dummy.next)

One pass solution:
Iterative solution without one pass:
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
For this problem we traversed the fast pointer till n hops and then set slow to head.Then travserse both slow and fast by one hop till fast reaches the end.Then with sow pointer we can delete the nth element from the linked list.

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if head==None:
            return
        temp=head
        while n>0:
            temp=temp.next
            n=n-1
        fast=temp
        slow=head
        if fast==None:
            return head.next
        print(fast.val,slow.val)
        while(fast.next!=None):
            slow=slow.next
            fast=fast.next
        # print(slow.val,fast.val)
        slow.next=slow.next.next
        return head
        
