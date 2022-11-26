void reversePrint(SinglyLinkedListNode* llist) {
   if(llist==NULL) return;
   else {
   reversePrint(llist->next);
   }
   cout<<llist->data<<endl;
    
}
