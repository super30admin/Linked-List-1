'''
In this problem we need to check if there is a cycle in the linked list, if there is a cycle we need to return the starting point of the cycle.
Here I considered 2 pointers, slow and fast, both starting at the head of liked list.
I moved slow pointer by 1 node and fast pointer by 2 nodes.
Since fast pointer is moving at twice the speed of slow pointer, they will meet at least once inside the cycle, before both the pointers complete one rotation in the list.
The distance between the starting point to head and meeting point of the pointers to start of the cycle are equal, so we move one of the pointer to start from the meeting point.
and move both the pointers at same speed, the point at which both of them meet is the start of the cycle.
'''
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        flag = False
        slowPointer = head
        fastPointer = head
        # as long as fastPointer does not become null
        while fastPointer != None and fastPointer.next != None:
            # moving the slowPointer by once and fastPointer by twice
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next.next
            # if both pointers meet, there exists a cycle
            if slowPointer == fastPointer:
                flag = True
                break
        
        if flag is False: return None
        # moving the pointer to start
        slowPointer = head
        while slowPointer != fastPointer:
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next
        
        return slowPointer
'''
Time Complexity: O(n)
we iterate once on all the number of nodes of linked list, time taken O(n)
Space Complexity: O(1)
we are not using any extra space, we are just using pointers.
'''