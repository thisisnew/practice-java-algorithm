package leetcode;

import java.io.IOException;
import java.util.*;

public class DesignTwitter {
    public static void main(String[] args) throws IOException {
        var twitter = new Twitter();


    }
}

class Twitter {

    private Map<Integer, Set<Integer>> follower;

    public Twitter() {
        this.follower = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

    }

    public List<Integer> getNewsFeed(int userId) {
        return List.of();
    }

    public void follow(int followerId, int followeeId) {
        var followers = Objects.requireNonNullElse(follower.get(followerId), new HashSet<Integer>());
        followers.add(followerId);
        follower.put(followerId, followers);
    }

    public void unfollow(int followerId, int followeeId) {
        var followers = Objects.requireNonNullElse(follower.get(followerId), new HashSet<Integer>());
        followers.remove(followeeId);
        follower.put(followerId, followers);
    }
}
