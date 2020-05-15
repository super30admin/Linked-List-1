"""
// Time Complexity :O(n) for traversing till the end of the list
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Iterative - YES/ Recursive-YES
// Any problem you faced while coding this : NA


//Explanation:
#iterative
Use 3 pointers - pointer1,pointer2 and pointer3
pointer1 is initially None
Perform reverse and shift pointer1,pointer2 and pointer3 .
When pointer2 is None, return pointer1(Reversed LL)

#recursive solution
Use pointer1,pointer2, and pointer3 logic used above
All manual assignments are replaced in recursive call. Line 34,35 --> Line 57
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

# recursive solution
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        result = self.helper(None,head)
        print("Final =",result)
        return result

    def helper(self,p,head)-> ListNode:
        pointer1, pointer2 = p, head

        # Base case
        if pointer2 is None:
            print("p1 =",pointer1,"p2 =",pointer2)
            return pointer1

        else:
            pointer3 = pointer2.next
            #reverse LL
            pointer2.next = pointer1
            return self.helper(pointer2,pointer3)
