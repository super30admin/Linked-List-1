'''
206. Reverse Linked List
Approach 1: Brute force
TIME COMPLEXITY: O(N) + O(N)
SPACE COMPLEXITY: O(N)
LEETCODE: Yes
DIFFICULTY: nope

Approach 2: Three pointer approach
TIME COMPLEXITY: O(N) (single parse)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTY: A bit, but manageable

'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        
        def approach1(head):
            # brute force approach
            lst = []
            while head != None:
                lst.append(head.val)
                head = head.next
            n = len(lst)
            head = ListNode(lst[n-1])
            tmp = head
            for i in range(n-2, -1, -1):
                head.next = ListNode(lst[i])
                head = head.next
            
            return tmp
        
        def approach2():
            # Three pointer approach
            tmp = None
            p1 = head
            p2 = head.next
            while p2 != None:
                p1.next = tmp
                tmp = p1
                p1 = p2
                p2 = p2.next

            p1.next = tmp
            return p1
        
        return approach1(head)
        # return approach2()
