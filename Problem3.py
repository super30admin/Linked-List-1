"""

    Student : Shahreen Shahjahan Psyche
    Time : O(N^2)
    Space : O(N)

    This code ran successfully for all the test cases in Leetcode

"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        # edge case
        if head is None:
            return None
        
        records = {}
        
        # saving the nodes in a hashmap to track whether I have eencountered the nodee before or not!
        while(head is not None): # O(N)
            if head not in records.keys(): # O(N)
                records[head] = True
            else:
                return head
            head = head.next
        
        return None
        
        