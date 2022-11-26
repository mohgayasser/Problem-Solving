
DoublyLinkedListNode* reverse(DoublyLinkedListNode* llist) {
    DoublyLinkedListNode* temp=llist;
    while (temp->next) {
        temp=temp->next;
    }
    DoublyLinkedListNode* temp2;
    DoublyLinkedListNode * newHead=temp;
    
    while (temp) {
           temp2=temp;

           temp->next=temp->prev; 
           
           temp->prev=temp2->next;
           temp=temp->next;
    }
   
    return newHead;
}
