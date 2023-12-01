//TC: O(n)
//SC: O(1)

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) 
    {
          if (!head)
        return nullptr;
        
        //dummy node
        ListNode new_head(-1);
        new_head.next = head;

        ListNode *slow = &new_head; 
        ListNode *fast = &new_head;

        for (int i = 0; i < n; i++)
            fast = fast->next;

        while (fast->next) 
        {
            fast = fast->next;
            slow = slow->next;
        }

        ListNode *to_be_deleted = slow->next;
        slow->next = slow->next->next;

        delete to_be_deleted;

        return new_head.next;
    }
};