//TC: O(n) where n is number of elements
//SC: O(1) 


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
    ListNode* reverseList(ListNode* head) {
        
        // iterative
        ListNode *current = head;
        ListNode *prev = NULL;
        
        while(current != NULL){
           
            ListNode *temp = current->next;
            current->next = prev;
            prev = current;
            current = temp;            
        }
        
        return prev;
        
//         if(head == NULL || (head->next) == NULL)
//             return head;
        
//         ListNode* node = reverseList(head->next);
//         head->next->next = head;
//         head->next = NULL;
        
//         return node;
        
        
    }
};