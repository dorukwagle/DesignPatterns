package momento;

import java.util.Stack;

public class EditorHistory {
    Stack<EditorState> states;

    public EditorHistory() {
        states = new Stack<>();
    }

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
