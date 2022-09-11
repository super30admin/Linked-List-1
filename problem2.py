'''
19. Remove Nth Node From End of List
APPROACH 1: Brute Force
TIME COMPLEXITY: O(N) + O(sz-n)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTY: Nope

APPROACH 2: Two pointer
TIME COMPLEXITY: O(N) (1 parse)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTY: A bit, but could manage it


'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next == None and n == 1:
            return None
        
        def approach1(head):
            # brute force
            tmp = head
            sz = 0
            while head != None:
                head = head.next
                sz += 1
            if sz == n:
                return tmp.next
            
            ct = sz - n -1
            head = tmp
            tmp = head
            while ct != 0:
                ct -= 1
                head = head.next
            
            
            if head.next != None:
                head.next = head.next.next
            else:
                head.next = None
            
            return tmp
        
        
        def approach2(head):
            # two pointer
            slow, fast = head, head
            tmp = slow
            ct = 0
            while ct < n:
                ct += 1
                fast = fast.next
            
            if fast == None:
                return head.next
            
            while fast.next != None:
                slow = slow.next
                fast = fast.next
            
            if slow.next != None:
                slow.next = slow.next.next
            return tmp
        
        return approach1(head)
        # return approach2(head)
