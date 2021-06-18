class Solution:
    '''
    Time Complexity: O(n)
    Space Complexity: O(n)
    '''
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head.next == None: return
        # you can use a two pointer solution
        runner = walker = head
        
        pos = n
        
        for _ in range(n):
            runner = runner.next
        
        if runner == None:
            return head.next

        while runner.next:
            runner = runner.next
            walker = walker.next
        walker.next = walker.next.next
        return head