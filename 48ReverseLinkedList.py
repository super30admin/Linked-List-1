"""
// Time Complexity :O(n) for traversing till the end of the list
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Iterative - YES/ Recursive-NO
// Any problem you faced while coding this : Not able to assign
pointer1.next values in recursive

//Explanation:
#iterative
Use 3 pointers - pointer1,pointer2 and pointer3
pointer1 is initially None
Perform reverse and shift pointer1,pointer2 and pointer3 .
When pointer2 is None, return pointer1(Reversed LL) 
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# iterative solution
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        pointer1, pointer2 = None, head

        while pointer2 is not None:
            pointer3 = pointer2.next
            pointer2.next =pointer1
            pointer1 = pointer2
            pointer2 = pointer3
        return pointer1
