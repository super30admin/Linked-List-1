//
//  main.cpp
//  206_Reverse_Linked_List


#include <iostream>
using namespace std;

 // Definition for singly-linked list.
  struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
  };
 

//Iterative approach TC:O(N), SC:O(1)
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        //1->2->3->4->5
        //3->2->1->4->5
        if(head == NULL)
            return NULL;
        ListNode* curr  = head;
        while(curr->next!=NULL){
            ListNode* temp = curr->next;
            curr->next = curr->next->next;
            temp->next = head;
            head = temp;
        }
       // curr->next =head;
       // head=curr;
        return head;
        
        
    }
};

int main(int argc, const char * argv[]) {
    ListNode* temp = new ListNode(1);
    ListNode* head  = temp;
    for(int i=2;i<=5;i++){
        ListNode* node1  = new ListNode(i);
        temp->next = node1;
        temp =temp->next;
    }
    Solution s;
    head = s.reverseList(head);
    while(head!=NULL){
        cout<<head->val<<endl;
        head=head->next;
    }
    return 0;
}
