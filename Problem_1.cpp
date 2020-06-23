//Time Complexity: O(N), where n is the number of elements in the linked list.
//Space Complexity: O(1).
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
        if(head == nullptr) return nullptr;
        ListNode* start = head;
        ListNode* end = nullptr;
        while(head->next!=nullptr){
            head = head->next;
        }
        end = head;
        while(start!=end){
            ListNode* temp = start->next;
            start->next = end->next;
            end->next = start;
            start = temp;
        }
        return start;
    }
};