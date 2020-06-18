"""

    Student : Shahreen Shahjahan Psyche
    Time : O(N) [One pass]
    Space : O(N)

    This code ran successfully for all the test cases in Leetcode

"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        # edge case
        if head is None:
            return
        if head.next is None:
            return None
        
        records = []
        res = head
        
        # saving the nodes in an array so that I can solve the problem in one pass
        while(head != None):   
            records.append(head)
            head = head.next
        # if I have to remove the first element, then I am just moving my head to next pointer
        if len(records)  == n:
            res = res.next
        # if I have to remove the last element then I am just making my second last's next pointer to None
        elif n == 1:
            records[len(records) - 2].next = None
        # finally, for the nth node deletion, I am just connecting the n-1 node to n+1 node
        else:
            records[len(records) - n - 1].next = records[len(records) - n + 1]
        
        del records
        
        return res