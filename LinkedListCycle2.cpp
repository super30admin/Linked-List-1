// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We use the concept of slow and fast pointers to detect the cycle and find the element where the cycle is formed.

class Solution
{
public:
    ListNode *detectCycle(ListNode *head)
    {
        ListNode *slow = head;
        ListNode *fast = head;
        do
        {
            if ((fast == NULL) || (fast->next == NULL))
                return NULL;
            slow = slow->next;
            fast = fast->next->next;
        } while (slow != fast);

        slow = head;
        while (slow != fast)
        {
            slow = slow->next;
            fast = fast->next;
        }

        return fast;
    }
};