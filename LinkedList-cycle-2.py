""" 
Time Complexity - O(n)
Space Complexity - O(1)
Runs on leetcode - Yes
Flyod's cycle detection algorithm
"""




class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head

        #Detect if there's a cycle
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                #Find the start of the cycle
                slow = head
                while slow != fast:
                    slow = slow.next
                    fast = fast.next
                return slow  

        return None  
