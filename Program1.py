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
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #If the head is None or if there is only one element in the linked list
        #return the head
        if(head==None or head.next==None):
            return head
        #Creating previous and current variables of ListNode type
        self.prev=None
        self.curr=head
        #Iterating through the linked list until the current not Null
        while(self.curr!=None):
            self.temp=self.curr.next
            self.curr.next=self.prev
            self.prev=self.curr
            self.curr=self.temp
        #Finally returning previous pointer as output
        return self.prev