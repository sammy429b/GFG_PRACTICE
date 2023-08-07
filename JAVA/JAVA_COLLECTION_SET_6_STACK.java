import java.util.Stack;

public class JAVA_COLLECTION_SET_6_STACK {
    static Stack<Integer> deleteMid(int n, Stack<Integer> st) {
    Stack<Integer> stack = new Stack<>();
    int size = st.size();
    int mid = size / 2;
    
    // Pop and push elements until we reach the middle of the stack
    for (int i = 0; i < mid; i++) {
        stack.push(st.pop());
    }

    // Pop the middle element (skip it)
    st.pop();

    // Pop elements from the stack and push them back
    // into the original stack from the temporary stack
    while (!stack.isEmpty()) {
        st.push(stack.pop());
    }

    return st;
}
