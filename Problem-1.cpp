//Code for both recursive + iterative
//recursive is O(n) stack space, O(n) time
//iterative is O(n)+O(1)

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
       ListNode* current = head; 
        ListNode *prev = NULL, *next = NULL; 
  
        while (current != NULL) { 
            // Store next 
            next = current->next; 
  
            // Reverse current node's pointer 
            current->next = prev; 
  
            // Move pointers one position ahead. 
            prev = current; 
            current = next; 
        } 
         return prev;
    }
};

/*//recursive
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (!head || !(head -> next)) {
            return head;
        }
        ListNode* node = reverseList(head -> next);
        head -> next -> next = head;
        head -> next = NULL;
        return node;
    }
};*/
