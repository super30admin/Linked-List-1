# Time Complexity = O(n)
# Space Complexity = O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if (n == 0 or head == None):
            return head
        
        # Creating a dummy node for situations if we are required to remove the head of the LL
        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        
        slow = dummy
        fast = dummy
        
        
        # Increment the fast pointer 'n' times first, to create gap b/w fast and slow
        while(count <= n):
            fast = fast.next
            count += 1
        
        # Increment both the pointers by 1,until fast is not equal to None
        # When fast reaches None, slow is standing at the node previous to the node that is to be removed
        while(fast != None):
            slow = slow.next
            fast = fast.next
        
        # Removing the node afer slow
        slow.next = slow.next.next
        
        # Contains head of the LL   
        return dummy.next