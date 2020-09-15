#Time Complexity : O(n) where n is the number of elements
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 
#Your code here along with comments explaining your approach

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
        cur=head
        count=0
        while cur!=None:
            count=count+1
            cur=cur.next
        #print(count) 
        
        k=count-n+1
        #print(k)
        
        if k==1:
            return head.next
        else:
            cur2=head
            count2=0
            while cur2:
                count2+=1
                if count2==k-1:
                    cur2.next=cur2.next.next
                    cur2=cur2.next
                else:
                    cur2=cur2.next
            return head         