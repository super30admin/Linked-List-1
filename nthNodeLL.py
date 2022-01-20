#TimeComplexity:O(n)
#SpaceComplexity:O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No
# Used two pointers and the length of the list to remove the nth node






# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        
        
        count = 0
    
        
        dummy = ListNode(0,0)
        
        dummy.next = head
        
        slow = dummy
        fast = dummy
        
        print(dummy.val)
        
        
        
        
        while count < n:
            
            fast = fast.next
            count +=1
            
        # print(fast.val)
        
        while fast.next != None:
            
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        
        
        return dummy.next
        
        
            