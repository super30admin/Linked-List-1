  ---------------------- Remove Nth node from end--------------------------------------------   
# Time Complexity : O(N) N is the number of linked-list Nodes.
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have used 2 pointers slow and fast. slow I will assign to head and fast to the nth node from the beginning. 
#I will iterate through the list, and iterate until fast != null. Then my slow pointer will be before nth node. Then slow.next will be slow.next.next



class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None
        if n<0:
            return head
        
        slow = head
        fast = head
        i = 0
        while i<n:
            fast = fast.next
            i +=1
        
        if fast == None:
            return head.next
       
        while fast.next != None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return head