// Time Complexity : O(kn) = O(n) n is length of linked list
// Space Complexity : O(1) constant time
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
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
        if(head == NULL || head->next == NULL)
            return NULL;
        ListNode* fast = head;
        ListNode* slow = head;
        while(fast!=NULL && fast->next != NULL)
        {
            slow = slow->next;
            fast = fast->next->next;

            if(slow == fast)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow->next;
                    fast = fast->next;
                }
                return slow;
            } 
        }
        return NULL;
    }
};