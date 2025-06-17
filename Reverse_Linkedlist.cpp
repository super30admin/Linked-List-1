//Time Complexity : O(n)
//Space Complexity : O(1)
#include<iostream>
#include<vector>
using namespace std;
struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
};
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode * prev = nullptr,*next1;
        while(head != nullptr)
        {
            next1 = head -> next;
            head -> next = prev;
            prev = head;
            head = next1;
        }
        
        return prev;
    }
};