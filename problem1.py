#time complexity: O(n) 
#space complexity: O(n) 
#submit on leetcode: yes



# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution:
    def reverseList(self, head: [ListNode]) -> [ListNode]:
        #prev = None
        #curr = head

        #while curr is not None:
            #temp = curr.next
            #curr.next = prev
            #prev = curr
            #curr = temp
        
        #return prev


        #recursive method 

        if head is None or head.next is None:
            return head
        
        rest = self.reverseList(head.next)
        head.next.next = head
        head.next = None

        return rest
        