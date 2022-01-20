#TimeComplexity:O(n)
#SpaceComplexity:O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No
# Used hashmap to check for cycles in a linked list



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        map = {}
        
        # map.add(head)
        curr = head
        i = 0
        while(curr != None):
            
            if curr in map:
                print(map[curr])
                return map[curr]
            else:
                map[curr] = curr
            curr = curr.next
    
            i+=1
        
        return None
            
    
        