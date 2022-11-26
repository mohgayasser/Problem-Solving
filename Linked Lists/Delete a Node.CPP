
SinglyLinkedListNode* deleteNode(SinglyLinkedListNode* llist, int position) {
    
    SinglyLinkedListNode * node=llist;
    int counter=0;
   
    while(counter<position-1){
        
        node=node->next;
        
        counter++;
    }
    if(position==0&&(node->next)==NULL){
        return NULL;
    }else if (position==0&&(node->next)) {
        return node->next;
    }
    node->next=node->next->next;
    
     return llist;
}
