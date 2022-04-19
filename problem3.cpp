//time complexity  : o(n)

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
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        
        ListNode* dummp = new ListNode(-1);
        dummp->next = head;
        
        ListNode* slow = dummp;
        ListNode* fast = dummp;
        int count = 0;
        while(fast != NULL) {
            
            if(count <= n) {
                count++;
            } else {
                slow = slow->next;
            }
            fast = fast->next;
        }
        
        slow->next = slow->next->next;
        
        return dummp->next;
    }
};