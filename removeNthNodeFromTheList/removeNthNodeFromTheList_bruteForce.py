'''
Time Complexity : 0(n) + 0(n), 2 iterations
Space Complexity : None
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : (Checking base condition and deleting the 1st element, 
but resolved)

// Your code here along with comments explaining your approach
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        # Iterate the linkedList to get the count
        totalCount = 0
        itr = head
        while itr!= None:
            itr = itr.next
            totalCount+=1
        
        # Iterate till (totalCount-k)+1, it will be the "currentNode" to delete
        # Also maintain a previous i.e. (currentNode-1) node
        
        
        itr = totalCount - n
        previous = None
        
        
        current = head
        while itr !=0:
            previous = current
            current = current.next
            itr-=1
        
        # base-case; previous = None
        if previous == None:
            # current at 0th index only
            if current.next == None:
                head = None
            else:
                head = head.next
            current = None
            
        else:
            # I am at my "current" i.e. node to delete
            previous.next = current.next
            current.val = None
            current.next = None
            current = None

        return head
        