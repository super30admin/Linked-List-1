/*
TC : O(N)
SC : O(1)
*/
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
        if (head == nullptr)
        {
            return head;
        }
        bool hasCycle = false;

        ListNode *slow = head;
        ListNode *fast = head;

        // check if there is a cycle in the linkedlist
        while (fast != nullptr && fast->next != nullptr)
        {
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast)
            {
                hasCycle = true;
                break;
            }
        }

        slow = head;

        // if cycle exists find the start of the cycle
        while (hasCycle && slow != fast)
        {
            slow = slow->next;
            fast = fast->next;
        }

        if (!hasCycle)
        {
            return nullptr;
        }

        return slow;
    }
};