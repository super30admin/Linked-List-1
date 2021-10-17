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
        if(head == NULL || head->next == NULL){
            return NULL;
        }
        ListNode * temp = new ListNode(-1);
        temp->next = head;
        ListNode * ptr1 = temp;
        ListNode * ptr2 = temp;
        int i=1; 
        while(i<=n){
            ptr1 = ptr1->next;
            i++;
        }
        
        while( ptr1 != NULL && ptr1->next != NULL ){
            ptr1 = ptr1->next;
            ptr2 = ptr2->next;
        }
        cout<< ptr2->val;
        
        ptr2->next = ptr2->next->next;

        return temp->next;
    }
};

// Time Complexity: O(n), where n is the number of nodes of the list
// Space Complexity: O(1)
