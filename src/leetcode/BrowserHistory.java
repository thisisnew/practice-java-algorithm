package leetcode;

import java.io.IOException;
import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) throws IOException {
        var browser = new Browser("leetcode.com");
    }
}

class Browser {

    private final Stack<String> backward;
    private final Stack<String> forward;
    private String current;

    public Browser(String homepage) {
        this.backward = new Stack<>();
        this.forward = new Stack<>();
        this.current = homepage;
    }

    public void visit(String url) {
        this.backward.push(this.current);
        this.forward.clear();
        this.current = url;
    }

    public String back(int steps) {
        for (int i = 0; i < steps; i++) {
            if (this.backward.empty()) {
                return this.current;
            }

            this.forward.push(this.current);
            this.current = this.backward.pop();
        }

        return this.current;
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (this.forward.empty()) {
                return this.current;
            }

            this.backward.push(this.current);
            this.current = this.forward.pop();
        }

        return this.current;
    }
}
