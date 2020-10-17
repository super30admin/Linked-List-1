"""
The approach here is to keep 3 pointers cur and front at None and cur at head. point cur.next to prev
and change position of front to cur.next now make prev = cur and cur = front and repeat the process.

Leetcode - Running
Time complexity - O(N)
"""

def ReverseLL(self,head):
    prev = front = None
    cur = head
    while curr:
        front = cur.next
        cur.next = prev
        prev = cur
        cur = front
    return prev
