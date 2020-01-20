"""
Time Complexity : reverseList_iterative - O(n)
                  reverseList_recur - O(n)
Space Complexity : reverseList_iterative - O(1)
                   reverseList_recur - O(1) (stack space - O(n))
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseList_iterative(self, head):
        if head == None or head.next == None:
            return head
        
        prev = None
        curr = head
        fast = head.next
        
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
            
        curr.next = prev
        prev = curr
        return prev
    
    def reverseList_recur(self, head):
        if head == None or head.next == None:
            return head
        
        reverse = self.reverseList_recur(head.next)
        head.next.next = head
        head.next = None
        
        return reverse
        
def printLL(new_h):
    while new_h:
        if new_h.next == None:
            print(new_h.val)
        else:
            print(new_h.val, end=" -> ")
    
        new_h = new_h.next
    
h1 = ListNode(1)
h1.next = ListNode(2)
h1.next.next = ListNode(3)
h1.next.next.next = ListNode(4)
h1.next.next.next.next = ListNode(5)

s = Solution()
new_h = s.reverseList_iterative(h1)
recur_h = s.reverseList_recur(h1)
printLL(new_h)
printLL(recur_h)