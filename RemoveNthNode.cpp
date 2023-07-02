// Time Complexity: O(n)
// Space Complexity: O(1)
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
        ListNode* dummy = new ListNode();
        dummy->next = head; 
        ListNode* second = dummy; 
        ListNode* first = dummy; 

        

        while(n > 0) {
            first = first->next; 
            n--; 
        }

        while(first->next != nullptr) {
            first = first->next; 
            second = second->next; 
        }    

        if(second == dummy) {
            head = second->next->next; 
        } else {
            second->next = second->next->next;  
        }
        

        return head; 
    }
};