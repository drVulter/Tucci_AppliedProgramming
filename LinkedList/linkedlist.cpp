#include<iostream>

using namespace.std;

class HeadNode {
public:
	class Node{
	public:
		Node(int element) {this->element = element;}
		Node* next;
	}
	Node* HeadNode;
	Node* tailNode;
	void Insert();
	void deleteNode();
	void traverseElements();
	void Print();
	HeadNode* nextNodePtr;
}
//Constructor
HeadNode::HeadNode(int value) {
	element = value;
	next = 0;
	return;
}	
//insert and element to linked list
void HeadNode::Insert(HeadNode* node) {
	HeadNode* tempNode = 0;

	tempNode = this->nextNodePtr;   
	this->nextNodePtr = node;    
	node->nextNodePtr = tempNode;

	return;
}

//remove an element from linked list	
void HeadNode::remove(int value) {
	
	Node *currentPtr;
	Node *prevPtr = 0;
	for (currentPtr = frontNode; currentPtr != 0; currentPtr->next) {
		if (currentPtr->element == value) {
			if (prevPtr == 0) {
				frontNode = currentPtr->next;
				delete currentPtr;
				cout << "Delete first element" << endl;
			} else if (currentPtr == tailNode) {
				prevPtr->next = 0;
				delete currentPtr;
				cout << "Delete last element" << endl;
			} else {
				prevPtr->next = currentPtr->next;
				delete currentPtr;
			}
		}
		prevPtr = currentPtr;
	}
}

//print linked list
void HeadNode::Print() {
		cout << this->value << endl;
	return;
}

// next location
HeadNode* HeadNode::GetNextNode() {
	return this->nextNodePtr;
}

int main() {
	int value = 0;
	HeadNode *frontPtr = new HeadNode(value);
	HeadNode *tailPtr;
	tailPtr = frontPtr;
	
	int n = 9;
	
	for (int i = 1; i < n; i++) {
		tailPtr = tailPtr->append(i);
	}
	
	frontPtr->print();
	cout <<this->value<<endl;
	
	HeadNode *linkedList = new HeadNode();
	
	for (int i = 0; i < n; i++) {
		linkedList->insert(i);
	}
	
	
	return 0;
}
