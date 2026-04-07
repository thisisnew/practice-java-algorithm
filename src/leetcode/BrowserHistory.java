package leetcode;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    public static void main(String[] args) throws IOException {
        var browser = new Browser("leetcode.com");
    }
}

class Browser {

    private final Deque<String> history;

    public Browser(String homepage) {
        this.history = new ArrayDeque<>();
    }

    public void visit(String url) {
        history.addFirst(url);
    }

    public String back(int steps) {
        if (history.isEmpty()) return "";

        String url = history.removeFirst();
        history.addLast(url);
        return url;
    }

    public String forward(int steps) {
        if (history.isEmpty()) return "";

        String url = history.removeLast();
        history.addFirst(url);
        return url;
    }
}
