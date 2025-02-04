// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: Remove Nth Node from Linked List
// Approach: Two Pointers
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
    ListNode *removeNthFromEnd(ListNode *head, int n)
    {

        if (head == NULL)
        {
            return head;
        }

        ListNode *dummy = new ListNode(-1);
        dummy->next = head;

        ListNode *slow = dummy;
        ListNode *fast = dummy;
        int count = 0;

        while (count <= n)
        {
            count++;
            fast = fast->next;
        }

        while (fast != NULL)
        {
            slow = slow->next;
            fast = fast->next;
        }

        slow->next = slow->next->next;
        return dummy->next;
    }
};