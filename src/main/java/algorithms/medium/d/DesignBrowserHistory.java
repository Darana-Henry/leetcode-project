//https://leetcode.com/problems/design-browser-history/
package algorithms.medium.d;

import java.util.Stack;

public class DesignBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"

        // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        System.out.println("Output:\t" + browserHistory.back(1));

        // You are in "facebook.com", move back to "google.com" return "google.com"
        System.out.println("Output:\t" + browserHistory.back(1));

        // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        System.out.println("Output:\t" + browserHistory.forward(1));

        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"

        // You are in "linkedin.com", you cannot move forward any steps.
        System.out.println("Output:\t" + browserHistory.forward(2));

        // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        System.out.println("Output:\t" + browserHistory.back(2));

        // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
        System.out.println("Output:\t" + browserHistory.back(7));
    }
}

class BrowserHistory {
    Stack<String> history = new Stack<>();
    Stack<String> future = new Stack<>();

    public BrowserHistory(String homepage) {
        visit(homepage);
    }

    public void visit(String url) {
        history.push(url);
        future.clear();
    }

    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            future.push(history.pop());
            steps--;
        }

        return history.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !future.isEmpty()) {
            history.push(future.pop());
            steps--;
        }

        return history.peek();
    }
}