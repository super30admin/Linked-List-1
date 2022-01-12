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
    ListNode* prev;
public:
    ListNode* reverseList(ListNode* head) {
     
       
        return reverse(head);
        
    }
    
    ListNode* reverse(ListNode* head) {
        
        // base
      
           if(head == NULL || head->next==NULL) return head;
        
        ListNode* temp = reverse(head->next);
        head->next->next = head;
        cout<<"setting null: "<<head->val<<endl;
        head->next = NULL;
    
        return temp;
        
    }
};
