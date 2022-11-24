# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''
Time Complexity -->
O(n)

Space Complexity -->
O(1) sicne we are using constant numbe of pointers
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return None
        currNode = head
        prevNode = None
        if currNode.next == None:
            return head
        nextNode = currNode.next
        while nextNode:
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
            nextNode = nextNode.next
        currNode.next = prevNode
        return currNode
            
            
        