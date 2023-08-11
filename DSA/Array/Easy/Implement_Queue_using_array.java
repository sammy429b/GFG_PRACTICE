class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int size = 100005;

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(rear==size) return;
	    arr[rear++] = x;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		if(rear == front) return -1;
		int ans = arr[front++];
		return ans;
	} 
}