#Time Complexity : O(N)
#Space Complexity: O(1)
#Yes it ran on leetcode

class Solution(object):
    def detectCycle(self, head):
        if head == None:
            return None
        fast = head
        slow = head
        flag = False
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                slow = head
                while (slow != fast):
                    slow = slow.next
                    fast = fast.next
                return fast