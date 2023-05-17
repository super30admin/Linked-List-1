#Time Complexity: O(n)
#Space Complexity: O(1)

class Solution:
    def detectCycle(self, head):

        s = set()

        while(head != None):
            if head in s:
                return head
            
            s.add(head)
            head = head.next

        return None