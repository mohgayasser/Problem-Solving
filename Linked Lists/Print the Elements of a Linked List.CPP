void printLinkedList(SinglyLinkedListNode* head) {
    SinglyLinkedListNode *n=head;
    while(n){
        cout<<n->data<<endl;
        n=n->next;
        
    }
    delete n;
    
    
}
