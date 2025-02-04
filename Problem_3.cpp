// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 142: Linked list cycle ii
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

class Solution
{
public:
    ListNode *detectCycle(ListNode *head)
    {

        // Base Case
        if (head == NULL)
        {
            return NULL;
        }

        // Flag to detect if a cycle exists in the list.
        bool hasCycle = false;

        // Pointers for the two-pointer approach.
        ListNode *fast = head;
        ListNode *slow = head;

        // Traverse the linked list to detect a cycle.
        while (fast != NULL && fast->next != NULL)
        {
            slow = slow->next;       // Slow pointer advances one step.
            fast = fast->next->next; // Fast pointer advances two steps.

            // If the fast and slow pointers meet, a cycle is detected.
            if (slow == fast)
            {
                hasCycle = true;
                break;
            }
        }

        // If no cycle is detected, return NULL.
        if (!hasCycle)
        {
            return NULL;
        }

        // Reset the fast pointer to the head of the list.
        fast = head;

        // Move both pointers one step at a time until they meet.
        while (slow != fast)
        {
            slow = slow->next;
            fast = fast->next;
        }

        // Return the node where the cycle begins.
        return slow;
    }
};
