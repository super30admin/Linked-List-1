#206. Reverse Linked List
#Time Complexity : O(n) 
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#create a temp node with value null . Make current point to head , fast to next node of head. Now make the current node point to prev node, make prev poin to current, current to fast #and finally increment the fast node. when fast reaches null , we have current at last node make it point to prev and return currennt.
#iterative sol
#class Solution:
#    def reverseList(self, head: ListNode) -> ListNode:
#        prev = None
#        curr = head
#        fast = head.next
#        while curr.next:
#            curr.next = prev
#            prev = curr
#            curr = fast
#            fast =  fast.next
#        curr.next = prev
#        return curr
		
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next :
            return head
        node = self.reverseList(head.next)
        #head = stack.pop()
        head.next.next = head
        head.next = None
        return node