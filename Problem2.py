#Time complexity: O(n)
#Space complexity: O(1)

#Accepted on Leetcode

#Approach
#Use two pointers(slow and fast), create a gap of (n) between the two by moving one forward
#Now move both simultaneously until faster one reaches the end, since gap was n, slow pointer is now exactly behind the node we want to remove
#Use a dummy node to avoid handling (1) node case separately

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(None)
        dummy.next = head
        fast = dummy
        slow = dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        
        while fast != None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next

        return dummy.next
        


        
            