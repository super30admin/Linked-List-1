#time complexity: o(n), traversing all nodes once
#space complexity:o(1)
#passed all cases on LeetCode:yes
#difficulty faced:-
# comments:in the code
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: 'Optional[ListNode]', n: int) -> 'Optional[ListNode]':
        
        #dummy node is introduced for edge case when we have to remove the head
        #the algo will remain the same
        dummy = ListNode(-1)
        slow = fast = dummy 
        dummy.next = head

        count = 0

        #we start fast pointer from n and move till it reaches end
        #this ensures slow ptr starting at start while fast ptr starts at n will goto ()n-i)th pos from start
        #which is what we want to remove 

        #this loop is one way to start fast ptr at nth place
        while count <= n:
            count += 1
            fast = fast.next
        
        while fast!= None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return dummy.next

