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

    private final Map<Integer, Set<Feed>> feedsByUser;
    private final Map<Integer, Set<Integer>> followersByUser;

    public Twitter() {
        this.feedsByUser = new HashMap<>();
        this.followersByUser = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        var userFeeds = Objects.requireNonNullElse(this.feedsByUser.get(userId), new HashSet<Feed>());
        userFeeds.add(new Feed(tweetId));
        this.feedsByUser.put(userId, userFeeds);
    }

    public List<Integer> getNewsFeed(int userId) {
        var totalFeeds = new ArrayList<>(Objects.requireNonNullElse(feedsByUser.get(userId), new HashSet<>()));

        followersByUser.getOrDefault(userId, new HashSet<>())
                .forEach(followeeId -> totalFeeds.addAll(feedsByUser.getOrDefault(followeeId, new HashSet<>())));

        return List.of();
    }

    public void follow(int followerId, int followeeId) {
        var followers = Objects.requireNonNullElse(followersByUser.get(followerId), new HashSet<Integer>());
        followers.add(followerId);
        followersByUser.put(followerId, followers);
    }

    public void unfollow(int followerId, int followeeId) {
        var followers = Objects.requireNonNullElse(followersByUser.get(followerId), new HashSet<Integer>());
        followers.remove(followeeId);
        followersByUser.put(followerId, followers);
    }

    private static class Feed {
        private final int tweetId;
        private final LocalDateTime timestamp;

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
