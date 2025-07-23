//time complexity: O(n) : we travel the whole linked list
//Space complexity : O(1) : we didnot create any extra linked list 

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
        ListNode* prev = nullptr;  //initialize two pointers prev and curr
        ListNode* curr = head;
        while(curr != nullptr){ //travel through the linked list till it reach the end
            ListNode* Temp = curr->next; //store the curr->next because when we change the next pointers we cant access it again
            curr->next = prev; //make prev node as curr node next
            prev = curr; //move prev pointer
            curr = Temp; //move curr pointer 
        }//end the while when prev is head that mneans curr is nullptr
        return prev; //return new head
    }
};
