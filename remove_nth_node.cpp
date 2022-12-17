//Time Complexity : O(n)
//Space Complexity : O(1)

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
        ListNode *dummy = new ListNode(-1) ;
        ListNode *slow = dummy ; 
        ListNode *fast  = dummy; 
        dummy -> next = head ; 
        int count = 0 ; 

        while(count <= n){
            fast = fast -> next ; 
            count ++  ; 
        }

        while(fast!= NULL){
            slow = slow -> next ; 
            fast = fast -> next ; 
        }

        slow -> next = slow -> next -> next ; 


        return dummy -> next ; 
    }
};
