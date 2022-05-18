#Approach, we use 2 pntrs, we have nth node from end so, we keep that offset difference n for pointers,
# First we will move END pointer to the head + n ,and then will move START pointer from head so always [START + END = n] will be there
# and when again we will move END pointer till it reaches null, start will be at nth from last.

#Time Complexity O(N) One pass for traversing Linklist
#Space Complexity O(1)
#It successfully runs on the leetcode

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        start, end = head, head
        #to maintain distance n position end to nth node from start
        for _ in range(n):
            end = end.next
        #Remove head
        if not end: return head.next
        #move start and end till end's next is null, so diff n will be maintained from start to end 
        # so if end.next = null start will be at prev node of desired node to be deleted
        while end.next:
            start = start.next
            end= end.next
        start.next = start.next.next
        return head





#Bruteforce Approach
#Time Complexity O(N) + O(N) Two pass for traversing Linklist, one for length and one for removing element
#Space Complexity O(1)
#It successfully runs on the leetcode

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        cur= head
        l=0
        #finding length
        while cur:
            cur = cur.next
            l+=1

        cur= head
        if l-n==0: 
            head = head.next
            return head
        #traversing to the elemnt previous to the node we need to remove
        for _ in range(l-n-1):
            cur= cur.next

        cur.next = cur.next.next
        return head