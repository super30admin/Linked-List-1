# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this: Mathematical Proof of the algorithm


# // Your code here along with comments explaining your approach
def detectCycle(self, head: ListNode) -> ListNode:
    if not head: return head
    slow, fast = head, head.next
    while fast and fast.next:
        if slow == fast: break
        slow = slow.next
        fast = fast.next.next
        
    # Condition check if Loop exited because cycle didn't exist
    if not fast or not fast.next: 
        return None 

    # Cycle exists
    # Detect it by travelling from Intersection point to start of the cycle
    # Start the second pointer from the beginning of the LL

    '''
    For a LinkedList, assume:
        F is length of acyclic section,
        C = (a+b) is length of cycle
    
    Fast and slow intersect at node, `a` distance from start of cycle
    fast pointer travels F + n(a+b) + a, where `n` is amt of times fast looped through the cycle
    slow pointer travels F + a

    Now, another pointer `intersect` just needs to travel `b` nodes, to reach the start of the cycle
    '''
    intersect = slow.next
    slow = head
    while slow != intersect: 
        slow = slow.next
        intersect = intersect.next
    return intersect