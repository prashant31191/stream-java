package io.getstream.client.model.beans;

import java.util.List;

/**
 * Map Stream's API object response.
 *
 * @param <T> Type of the items included in the response.
 */
public class StreamResponse<T> {

    private String duration;

    private List<T> results;

    private String next;

    private long unread;

    private long unseen;

    public List<T> getResults() {
        return results;
    }

    public String getDuration() {
        return duration;
    }

    public String getNext() {
        return next;
    }

    public long getUnread() {
        return unread;
    }

    public long getUnseen() {
        return unseen;
    }
}
