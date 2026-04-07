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
        if (this.backward.empty()) {
            return this.current;
        }

        for (int i = 0; i < steps; i++) {
            String url = this.backward.pop();
            this.forward.push(url);
            this.current = url;
        }

        return this.current;
    }

    public String forward(int steps) {
        if (this.forward.empty()) {
            return this.current;
        }

        for (int i = 0; i < steps; i++) {
            String url = this.forward.pop();
            this.backward.push(url);
            this.current = url;
        }

        return this.current;
    }
}
