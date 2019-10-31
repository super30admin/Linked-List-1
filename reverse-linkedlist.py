# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


#Time complexity: O(n) as we are traversing through the entire linked list
#Space complexity: O(1) as we are changing the links and not creating new linked list nor using other data structure
#Explanation: This is iterative apporach where I am traversing through each node of the list, store its next value in next and change
#its current next to previous. Make previous to be current and current to be next.

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        prev = None
        current = head
        while current != None:
            next = current.next
            current.next = prev
            prev = current
            current = next
            head = prev
        return head