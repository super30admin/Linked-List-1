# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time: O(n)
# Space: O(n) #Dictionary
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dic = {}
        curr = head
        start = ListNode(0, curr)
        ind = 0
        while curr != None:
            dic[ind] = curr
            curr = curr.next
            ind += 1
        print(ind-n)
        if ind - n == 0:
            start.next = start.next.next
            return start.next
        if dic[ind-n-1].next != None:
            dic[ind-n-1].next = dic[ind-n-1].next.next
            return start.next
        
            
            
            
            
        
