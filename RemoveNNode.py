# Time Complexity : O(N) to find the length and O(length - n) to find node to remove
# Space Complexity : O(1)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        current = head
        count =0
        if head.next == None:
            return None
        while(current!=None):
            count+=1
            current = current.next
        
        if count == n:
            head = head.next
            return head
        else:
            count-=n
            remove = head    
            while(count > 1):   
                remove = remove.next
                count-=1
            remove.next = remove.next.next
            return head
==========================================================
#Time Complexity : O(N) as It done in one pass where N is number of Nodes
#Space Complexity : O(1)        
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(None)
        dummy.next = head
        fast = dummy
        slow = dummy
        i = -1
        while(fast!=None):
            if i >=n:
                fast = fast.next
                slow= slow.next
            else:
                fast = fast.next
            i+=1
        slow.next = slow.next.next
        return dummy.next
