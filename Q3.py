######## Linked List Cycle II

#  Time Complexity : O(n)
#  Space Complexity :  O(1)
#  Did this code successfully run on Leetcode :  Yes
#  Any problem you faced while coding this : No


#  Keep two ponters fast and slow such that fast moves two spaces ahead and slow moves one space ahead. when fast and slow meet for the first time it indicates a cycle. 
# then we reset slow to the head and keep going until slow and fast intersect this is point where the cycle starts

def detect_cycle(head):
        if not head:
            return None

        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                slow = head
                while slow!=fast:
                    slow = slow.next
                    fast = fast.next
                return slow
        return None
