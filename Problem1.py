# Time Complexity : O(n) (We have to pass throught every element of Linked List.)
# Space Complexity : O(1) (We are using only some temperory variables)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - In link list every element points to the next element.
# - So, iterate through every element and instead of first element pointing to second element. Make second element point to the first one.
# - Return Last element as head of link list.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
#       Take two variable pointing to None
        prv = None
        nex = None
#       Run while loop until we have any element
        while head:
#           Store head's next element into the nex variable
            nex = head.next
#           We stored next element in variable nex, so now we can change head's next to the prv variable. For first element prv will be None, because in the end It will become last element and will point to None.
            head.next = prv
#           Update prev with current head because next elements next will point to this.
            prv = head
#           Move head to the next element.
            head = nex
#       previous will have last element so return it as a head.
        return prv
        
