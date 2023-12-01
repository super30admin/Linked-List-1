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
    ListNode *detectCycle(ListNode *head) {
          if (!head)
        return nullptr;
        
        bool flag = false;
        ListNode *slow = head; 
        ListNode *fast = head;

        while (fast != NULL && fast->next != NULL) 
        {
            slow =slow->next;
            fast=fast->next->next;

            if(slow == fast)
            {
                //cycle found
                flag =true;
                break;
            }
        }
        if(!flag) return NULL;

        slow = head;

        while(slow!=fast)
        {
            slow = slow->next;
            fast = fast->next;
        }

        return fast;
        
    }
};
