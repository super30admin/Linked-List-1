// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We use two pointers, the second pointer starts traversing only after the first pointer is at a distance of n

class Solution
{
public:
    ListNode *removeNthFromEnd(ListNode *head, int n)
    {
        ListNode *p1 = head;
        ListNode *prev = new ListNode(-1, head);
        ListNode *p2 = prev;
        int count = 0;
        while (p1)
        {
            p1 = p1->next;
            if (count++ >= n)
            {
                p2 = p2->next;
            }
        }
        p2->next = p2->next->next;
        return prev->next;
    }
};