#
# @lc app=leetcode id=206 lang=python3
#
# [206] Reverse Linked List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    '''
    Time Complexity - O(n). we traversing the entire linked list
    Space Complexity - O(n). We are using the recursive stack space.

    This code works on Leet code
    '''
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # if head.next == None:
        #     return head
        # curr = head
        # prev = None
        # while curr:
        #     fast = curr.next #set fast as the next of current
        #     curr.next = prev #now set the next of current as prev
        #     prev = curr #point prev to curr
        #     curr = fast #point curr to fast
        # return prev #return prev as in the curr will be None
        #recursive approach
        return self.getReversedList(head)
    
    def getReversedList(self, head):
        if head == None or head.next == None: #return the last node when we reach it
            return head
        res = self.reverseList(head.next) #if not the last node call the same function with next node
        head.next.next = head # make the next of the next element point to the current element
        head.next = None #make next of current element point to null
        return res #result will always point to last element in original list.

        
# @lc code=end

