'''
Time Complexity : 0(k) [To Iterate fastPtr] + 0(n-k) [To reach toDelete node]
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
        
        # base-case, 1 element in the list
        if head.next == None:
            # 1 element in the linkedList
            head = None
        
        else:
            # Create a fastPtr and iterate it till (n) is 0
            fastPtr = head
            while n != 0:
                fastPtr = fastPtr.next
                n-=1
                continue

            # fastPtr is kth position ahead now
            # fastPtr-slowPtr = (n) distance -- maintainable gap
            slowPtr = head

            # previous should be 1 step behind slowPtr
            previous = None

            # Iterate the linkedList
            while fastPtr != None:
                previous = slowPtr
                slowPtr = slowPtr.next
                fastPtr = fastPtr.next
                continue

            # We have got our toDelete node
            
            # base-case, my toDelete node is head
            if previous == None and slowPtr == head:
                head = head.next
                slowPtr.next = None
            
            else:
                previous.next = slowPtr.next
                slowPtr.next = None

            # Dangling ptr take care
            slowPtr = None
            previous = None

        return head
        