# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

'''
Solution 1 : slow and fast pointers
Slow & fast pointers. We first move fast by 2x and slow by 1x. if there is a cycle, 
slow and fast will intersect at some point. When they do, we reset one of the pointers 
to head and start moving both by 1x. The next time they meet, it will be the node 
where the cycle begins. 
Time Complexity: O(N) 
Space Complexity: O(1)
'''
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while (fast!=None and fast.next!=None):
            slow = slow.next # 1x
            fast = fast.next.next # 2x
            if slow == fast:
                # found cycle
                # reset one of slow's and fast pointer to head and move 1x
                slow = head
                while slow!=fast:
                    slow = slow.next # 1x
                    fast = fast.next # 1x
                return slow # or fast
        
        return None # cycle not found

'''
Solution 2: Hash set. 
Maintain a visited set, add nodes as we iterate over the list. If we come across an
already visited node, then we have the cycle, and that node represents the start of cycle
Time complexity: O(N)
Space Complexity: O(N) - maintaing visited set of all nodes in list. 
'''
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        visited = set()
        
        while head!=None:
            if head in visited:
                return head
            visited.add(head)
            head=head.next

        return None # no cycle