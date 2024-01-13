#time complexity: O(n) 
#space complexity: O(1) 
#submit on leetcode: yes


# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution:
    def removeNthFromEnd(self, head: [ListNode], n: int) -> [ListNode]:
        dummyNode = ListNode(0)
        dummyNode.next = head
        slow = dummyNode
        fast = dummyNode
        count = 0
        while count <= n:
            count += 1
            fast = fast.next
        while fast is not None:
            slow = slow.next
            fast = fast.next
        
        temp = slow.next
        slow.next = slow.next.next 
        return dummyNode.next



        