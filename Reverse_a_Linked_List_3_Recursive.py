# Created by Aashish Adhikari at 11:05 AM 1/19/2021

'''
Time Complexity:
O(n)

Space Complexity:
O(1)

'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):

    def helper(self, node):

        if node.next is None:
            self.global_newhead = node
            return node
        else:


            self.helper(node.next).next = node

            '''
            The above can be broken down into
            
            new_node = self.helper(node.next)
            new_node.next = node
            
            but this will use extra space and also increase the time taken.
            '''

            return node

    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return None
        new_lastnode = self.helper(head) #<-- need to make sure the new last node has the next attributed equal to None
        new_lastnode.next = None

        return self.global_newhead





