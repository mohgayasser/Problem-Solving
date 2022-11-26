int getNode(SinglyLinkedListNode* llist, int positionFromTail) {
    
    int counter=0;
    SinglyLinkedListNode* temp= llist;
    while (temp) {
        
        temp=temp->next;
        counter++;
        
    }
    
    int rigthPos=(--counter)-positionFromTail;
    temp=llist;
    counter=0;
    if(rigthPos==0) return llist->data;
    
    else {
        while (counter<rigthPos) {
            temp=temp->next;
            counter++;
        }
        return temp->data;
    }
}
