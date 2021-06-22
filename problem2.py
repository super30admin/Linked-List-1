# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        count = 0
        dummy = ListNode(-1)
        dummy.next = head
        prev = dummy
        nxt = dummy
        
        while count <= n:
            nxt = nxt.next
            count +=1
        print(nxt)
        while nxt != None:
            nxt = nxt.next
            prev = prev.next 

        prev.next = prev.next.next
        return dummy.next

#Time complexity O(n) where n is number of nodes in the list
#Space complexity is O(1)
#Approach: create a gap equal to n between the fast and slow pointer and move them until fast pointer hits null. Then replace slow.next with slow.next.next