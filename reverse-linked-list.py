#-----------Solution 1 : Using 3 pointers
''' Time Complexity : O(n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No
'''

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev


#-----------Solution 2 : Recursion-----------
''' Time Complexity : O(n) 
    Space Complexity : O(n) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

    Approach : Reaching till n-1 node, and updating the next value
'''
class Solution:
    def __init__(self):
        self.top = ListNode()

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        def helper(head):
            #base
            if head is None or head.next is None:
                self.top = head
                return
            #logic
            helper(head.next)
            print(head.val)
            head.next.next = head
            head.next = None
            
        helper(head)
        return self.top

#-----------Solution 3 : Recursion-----------
''' Time Complexity : O(n) 
    Space Complexity : O(n) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

    Approach : Passing head and head.next as parameters
               updating head.next = head
'''
class Solution:
    def __init__(self):
        self.top = ListNode()

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        self.top = head
        def helper(head,newhead):
            #base
            if head is None or newhead is None:
                return 
            if newhead.next is None:
                self.top = newhead

            #logic
            helper(newhead,newhead.next)
            newhead.next = head
            head.next = None

        if head : 
            helper(head,head.next)
        return self.top