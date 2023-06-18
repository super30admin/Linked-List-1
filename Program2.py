#time complexity is: O(n)
#Space Complexity is: O(1)
#Program ran successfully on leetcode
#No issues while coding the program

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
        #Creating a dummy pointer
        self.dummy=ListNode(-1)
        self.dummy.next=head
        #Assigning slow and fast pointers to the dummy pointer
        self.slow=self.dummy
        self.fast=self.dummy
        #we will be moving fast pointer n positions
        while(n>=0):
            self.fast=self.fast.next
            n-=1
        #we will be moving fast pointer until we reach Null poisiton
        while(self.fast!=None):
             self.slow=self.slow.next
             self.fast=self.fast.next
        #After that we will removing the required value from the linked list
        temp=self.slow.next
        self.slow.next=self.slow.next.next
        temp.next=None
        #we will be returning the final linked list which is next to dummy
        return self.dummy.next