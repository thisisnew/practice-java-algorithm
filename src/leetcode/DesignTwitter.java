package leetcode;

import java.io.IOException;
import java.util.*;

public class DesignTwitter {
    public static void main(String[] args) throws IOException {
        Twitter twitter = new Twitter();
    }
}

class Twitter {

    private final Map<Integer, Set<Feed>> feedsByUser;
    private final Map<Integer, Set<Integer>> followersByUser;
    private int sequence;

    public Twitter() {
        this.feedsByUser = new HashMap<Integer, Set<Feed>>();
        this.followersByUser = new HashMap<Integer, Set<Integer>>();
        this.sequence = 0;
    }

    public void postTweet(int userId, int tweetId) {
        Set<Feed> userFeeds = this.feedsByUser.get(userId);
        if (userFeeds == null) {
            userFeeds = new HashSet<Feed>();
        }

        userFeeds.add(new Feed(tweetId, sequence++));
        this.feedsByUser.put(userId, userFeeds);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Feed> totalFeeds = new ArrayList<Feed>();

        Set<Feed> myFeeds = feedsByUser.get(userId);
        if (myFeeds != null) {
            totalFeeds.addAll(myFeeds);
        }

        Set<Integer> followees = followersByUser.get(userId);
        if (followees != null) {
            for (Integer followeeId : followees) {
                Set<Feed> followeeFeeds = feedsByUser.get(followeeId);
                if (followeeFeeds != null) {
                    totalFeeds.addAll(followeeFeeds);
                }
            }
        }

        Collections.sort(totalFeeds, new Comparator<Feed>() {
            @Override
            public int compare(Feed a, Feed b) {
                return b.timestamp - a.timestamp;
            }
        });

        List<Integer> result = new ArrayList<Integer>();
        int limit = Math.min(10, totalFeeds.size());

        for (int i = 0; i < limit; i++) {
            result.add(totalFeeds.get(i).tweetId);
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {
        Set<Integer> followees = followersByUser.get(followerId);
        if (followees == null) {
            followees = new HashSet<Integer>();
        }

        followees.add(followeeId);
        followersByUser.put(followerId, followees);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followees = followersByUser.get(followerId);
        if (followees == null) {
            followees = new HashSet<Integer>();
        }

        followees.remove(followeeId);
        followersByUser.put(followerId, followees);
    }

    private static class Feed {
        private final int tweetId;
        private final int timestamp;

        public Feed(int tweetId, int timestamp) {
            this.tweetId = tweetId;
            this.timestamp = timestamp;
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

        @Override
        public int hashCode() {
            return Integer.valueOf(tweetId).hashCode();
        }
    }
}