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
        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* jay = head;
        do{
            fast = fast->next->next;
            slow = slow->next;
        }
        while(fast!=slow);
        while(fast!=jay){
            jay=jay->next;
            fast=fast->next;
        }
        return jay;
    }
};
