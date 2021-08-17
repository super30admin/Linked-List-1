"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if head == None :
            return head
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy 
        count = 0
        while(count <= n):
            fast = fast.next
            count += 1
        while(fast!=None):
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return dummy.next
    
        
        
        # T.C = O(n)
        # S.C=O(n)
        # ans=[]
        # while head:
        #     ans.append(head.val)
        #     head=head.next
        # del ans[len(ans)-n]
        # dummy = ListNode(0)
        # temp=dummy
        # for i in ans:
        #     temp.next=ListNode(i)
        #     temp=temp.next
        # return dummy.next
            
          
        