// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

//Approach:
// 1. We will use three pointers, curr, prev and temp.
// 2. We will iterate through the linked list and at each step, we will reverse the pointer of the current node to the previous node.
// 3. We will update the prev pointer to the current node and curr pointer to the next node.
// 4. Finally, we will return the prev pointer which will be the new head of the reversed linked list.
class Solution {
    public:
        ListNode* reverseList(ListNode* head) {
            if(head == nullptr || head -> next == nullptr){
                return head;
            }
            ListNode* curr = head;
            ListNode* prev = nullptr;
            while(curr != nullptr){
                ListNode* temp = curr -> next;
                curr -> next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
    };