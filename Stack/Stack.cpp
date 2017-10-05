//Shane Tucci Applied Programming Languages
//I used code from HeadStart file in dropbox to help with this assignment and notes from class
#include <iostream>

using namespace std;

class StackManager {
public:
	class Node {
	public:
		Node(int val) { n = val; next = 0; };
		Node *next;
		int n;
	};

	void insert(int val);
	int pop();
	void traverse();
	Node *headPtr;
	Node *currPtr;
};
	
//Stack operation to insert values into the stack 
void StackManager::insert(int value) {
	Node* newNode = new Node(value);
	if (headPtr == 0) {
		headPtr = newNode;
		currPtr = headPtr;
	}
	else {
		currPtr = new Node(value);
		currPtr->next = headPtr;
		headPtr = currPtr;
	}
}
//Stack operation to delete or pop a specific element from the stack
int StackManager::pop() {
	cout << " Deleted Element: " << headPtr->n << endl;
	headPtr = headPtr->next;
	return headPtr->n;
}

//Stack operation to move pointers or traverse through the stack
void StackManager::traverse() {
	Node* print = headPtr;
	cout << endl;
	cout << " Stack " << endl;

	while (print != 0) {
		cout << print->n << endl;
		print = print->next;
	}
}

int main() {

	// STACK OPERATIONS
	StackManager* stackManager = new StackManager();
	// Insert 10 elements
	for (int i = 0; i < 10; i++) {

		stackManager->insert(i);
	}

	//Pop the 3 elements
	stackManager->pop();
	stackManager->pop();
	stackManager->pop();

	//Print by calling traverse function
	stackManager->traverse();
}
