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
    ListNode* removeNthFromEnd(ListNode* &head, int n) {
        if(head == NULL || head->next == NULL){
            return NULL;
        }
        
        ListNode* slow = head;
        ListNode* fast = slow;
        
        int count = 1;
        while(count<=n){
            fast = fast->next;
            count++;
        }
        if(fast == NULL){
            head = head->next;
            return head;
        }
        while(fast->next != NULL){
            fast = fast->next;
            slow = slow->next;

        }
     
        slow->next = slow->next->next;
        
        return head;
    }
        
};
