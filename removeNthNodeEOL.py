# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

# Discussion of first intuition(Two pass solution):
# 1. Go till the node n from the end to find the size of our traversal or position of the element whose next value we want to change
# 2. Then we traverse till that point and change the element's next
# 3. Time Complexity: O(n+n), find poistion/size + go to the element

# Approach discussed in class: 

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        # To handle the edge case of single element, we introduce a dummy head
        dummyHead = ListNode(-1)
        dummyHead.next = head
        
        # initialise the pointers as dummy head
        p1 = dummyHead
        p2 = dummyHead
        
        # n is always valid, so move the pointer p2 ahead until n is zero-> if the two pointers are n distance apart, it would mean that when p2 is at the end, p1 will be at the position whose element's next value should be changed
        while n>0:
            p2 = p2.next
            n -= 1
         
        # Now traverse till the end and move p1 and p2 ahead
        while p2.next != None:
            p1 = p1.next
            p2 = p2.next
            
        #after the loop ends, p1 is pointing to the element whose next element needs to be removed. Point p1's next to p1.next's next
        p1.next = p1.next.next
        
        #return the head of the array, i.e. dummyHead.next
        return dummyHead.next
            
        
            
        


