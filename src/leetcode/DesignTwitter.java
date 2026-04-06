package leetcode;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class DesignTwitter {
    public static void main(String[] args) throws IOException {
        var twitter = new Twitter();


    }
}

class Twitter {

    private Map<Integer, Set<Feed>> feed;
    private Map<Integer, Set<Integer>> follower;

    public Twitter() {
        this.feed = new HashMap<>();
        this.follower = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        var userFeeds = Objects.requireNonNullElse(this.feed.get(userId), new HashSet<Feed>());
        userFeeds.add(new Feed(tweetId));
        this.feed.put(userId, userFeeds);
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

    private static class Feed {
        private int tweetId;
        private LocalDateTime timestamp;

        public Feed(int tweetId) {
            this.tweetId = tweetId;
            this.timestamp = LocalDateTime.now();
        }

        public LocalDateTime timestamp() {
            return timestamp;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            Feed other = (Feed) obj;
            return this.tweetId == other.tweetId;
        }
    }
}
