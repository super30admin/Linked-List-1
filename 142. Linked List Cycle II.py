# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n) in both solution
# Space Complexity: O(n) using hashset | O(1) using floyd's algo
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#1. Using hashset

class Solution:
    '''
    - put each node in a hashset while traversing
    - if the node is already present in the hashset, means the cycle starts from there
    '''
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hashset = set()
        node = head
        while node:
            if node in hashset:
                return node
            else:
                hashset.add(node)
                node = node.next
        return None
        

#2. Floyd's Algorithm solution

class Solution:
    '''
    - using two pointers: fast moves twice nodes at once.
    - after they meet for first time, initialize the slow pointer to head
    - and move both pointer now at slow speed, they will meet at the cycle.
    '''
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        if slow == None or slow.next == None:
            return None  
        fast = head.next
        while (fast) and (fast.next):
            if fast == slow:
                slow = head
                fast = fast.next
                while fast != slow:
                    slow = slow.next
                    fast = fast.next
                return slow
            else:
                fast = fast.next.next
                slow = slow.next
        return None
