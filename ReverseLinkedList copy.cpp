// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We iterate through each of the elements and reverse the list on the go

class Solution
{
public:
    ListNode *reverseList(ListNode *head)
    {
        if (head == NULL)
            return NULL;
        ListNode *temp0 = NULL;
        ListNode *temp1 = head;
        ListNode *temp2 = head->next;
        while (temp1 != NULL)
        {
            temp2 = temp1->next;
            temp1->next = temp0;
            temp0 = temp1;
            temp1 = temp2;
        }
        return temp0;
    }
};