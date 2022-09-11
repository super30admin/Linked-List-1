'''
142. Linked List Cycle II

APPROACH 1: using set
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)
LEETCODE: Yes
DIFFICULTIES: Nope

APPROACH 2: Using slow fast pointer approach
TIME COMPLEXITY: O(N) + O(N)
SPACE COMPLEXITY: O(1)
LEETCODE: Yes
DIFFICULTIES: A bit, but I could handle it.

'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return None
        if head.next == head:
            return head
        
        def approach1(head):
            # using set
            sset = {head}
            
            while head != None:
                head = head.next
                if head in sset:
                    break
                sset.add(head)
            
            return head
        
        def approach2(head):
            # slow - fast pointer approach
            slow, fast = head, head.next
            
            while slow != fast and fast != None and fast.next != None:
                slow = slow.next
                fast = fast.next.next
                
            if fast == None or fast.next == None:
                return None
            
            slow = slow.next
            fast = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            
            return slow
        
        
        return approach1(head)
        # return approach2(head)
    
