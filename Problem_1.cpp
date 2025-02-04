// Author: Subhed Chavan
// Batch: December 24
// Problem Statement:
// Approach: Reverse Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution
{
public:
    ListNode *reverseList(ListNode *head)
    {

        // Base Case
        if (head == NULL || head->next == NULL)
        {
            return head;
        }

        // Pointers to Swap
        ListNode *curr = head;
        ListNode *next = NULL;
        ListNode *prev = NULL;

        // Loop till last node
        while (curr != NULL)
        {
            // Store the next
            next = curr->next;

            // Make the current Point to Previous
            curr->next = prev;

            // The current becomes prev for next iteration
            prev = curr;

            // And current's Next becomes new Current as we move forward
            curr = next;
        }

        // As we have done reverse in place we return the prev which is the last
        // node which was not null
        return prev;
    }
};