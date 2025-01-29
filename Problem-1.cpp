/*recurssion approch
    TC : O(N)
    SC : O(N)
*/
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
// iterative approach
class Solution
{
public:
    ListNode *reverseList(ListNode *head)
    {
        ListNode *prev = nullptr;
        ListNode *curr = head;

        while (curr)
        {
            ListNode *temp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
};

// recursive approach
class Solution
{
public:
    ListNode *reverseList(ListNode *head)
    {
        if (head == nullptr || head->next == nullptr)
        {
            return head;
        }

        ListNode *rev = reverseList(head->next);
        head->next->next = head;
        head->next = nullptr;

        return rev;
    }
};