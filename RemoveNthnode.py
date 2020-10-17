"""
The approach here is maintain two pointers prev and cur. and a length var to keep track of length of LL.
keep moving the cur pointer still cur.next exsists and increment the length var. once length is greater than
given n+1 value now increment the prev pointer also starting from the head.
once we are done traversing the LL. if length = n then remove the lat node. else make next pointer of prev
point to next of next node of prev.
Leetcode - running
TIme complexity - O(N)
space comlexity - O(1)
"""

def RemoveNthNode(self.head,n):
    length = 1
    cur = prev = head
    while cur.next:
        length += 1
        cur = cur.next
        if length > n+1:
            prev = prev.next
    if length == n:
        return head.next
    else:
        prev.next = prev.next.next
        return head