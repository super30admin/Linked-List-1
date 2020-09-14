//
//  main.cpp
//  19_Remove_Nth_Node_From_End_of_List

#include <iostream>
using namespace std;

class ListNode {
public:
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    //Two pass approach TC:O(N), N = Length of list
    ListNode* removeNthFromEnd(ListNode* head, int n) {
         if(head == NULL || head->next == NULL)
             return NULL;
         ListNode* curr = head;
         int length = 0;
         while(curr != NULL){
             curr = curr->next;
             length++;
         }
         if(length == n) {
             head = head->next;
             return head;
         }
         curr = head;
         int index = length - n;
         int i = 1;
         while(i < index ){
             curr = curr -> next;
             i++;
         }
         curr -> next = curr -> next ->next;
         return head;
    }
    
    //one pass
    //maintain n nodes gap between fast and slow
    //TC: O(N), SC:O(1), N = Number of nodes;
    ListNode* removeNthFromEnd1(ListNode* head, int n) {
        ListNode* dummy = new ListNode();
        dummy->next = head;
        ListNode* fast = dummy;
        ListNode* slow = dummy;
        
        int i=0;
        while(i <= n){
            fast = fast -> next;
            i++;
        }
        
        while(fast != NULL){
            fast = fast -> next;
            slow = slow -> next;
        }
        
        slow -> next = slow -> next -> next;
        
        return dummy -> next;
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
    head=s.removeNthFromEnd(head, 2);
    while(head!=NULL){
        cout<<head->val<<endl;
        head=head->next;
    }
    
    return 0;
}
