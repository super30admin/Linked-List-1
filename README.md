# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

Approach:
1. Here the brute force approach is to store the linkedList in Stack and then create a new linkedlist with pooping elements from the stack.
2. I have used interative approach where I am contiuously keeping the track of previous pointerand pointing my head's next. Then changing my previous to head and changing my head to head's next. At the end, return previous.
ListNode headNext = head.next;
head.next = prev
prev = head
head = headNext

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Appraoch:
1. Here I have used two pointer approach, fast and slow. Move fast pointer such as difference between slow and fast pointer shoud be equal to n where n is the position from last which we have to remove. Once we achieved this, move fast and slow pointer by one position till fast.next!=null. Once reached at the end, do
slow.next = slow.next.next to remove the desired node.

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
Approach:
Here there are 2 steps for solving this question. First is find whether the linklist contains cycle or not. If it contains cycle then return point of start of cycle. To find the cycle, I have used famous hair and tortoise approach i.e. slow and fast pointer approach. Move slow by 1 and fast by 2 till fast.next !=null. if(slow == fast) then return either slow or fast to the function or return null if cycle is not found.
In second function, once we find the interaction, then the root of interaction is equally distanced from the head node i.e. start node and the inteeaction that I have found so I move those pointers by 1 step till head != interaction. Once they are equal, return head or interaction.


