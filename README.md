# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)


class Solution:
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if (head == None or head.next == None):
            return head

        reverseList = self.reverseList(head.next)

        head.next.next = head
        head.next = None

        return reverseList

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return None

        fast = head

        count =0
        while count<n:
            fast = fast.next
            count += 1
        slow = head

        if (fast == None):
            return head.next

        while (fast.next != None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next

        return head

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
        using set time complexity is o(n) and space complexity is o(n)
        if not head:
            return None
        nodes= set()

        curr = head
        while(curr!= None):
            if (curr in nodes):
                return curr
            nodes.add(curr)
            curr = curr.next
        return None
        '''
        if not head:
            return None
        slow  = head
        fast = head.next
        while (fast!= None and fast.next != None):
            if (fast == slow):
                slow = head
                fast = fast.next
                break
            slow = slow.next
            fast = fast.next.next

        while fast != None and fast.next != None:
            if (slow == fast):
                return slow
            slow= slow.next
            fast = fast.next
        return None


        

