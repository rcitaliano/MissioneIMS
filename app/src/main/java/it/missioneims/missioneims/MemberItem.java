package it.missioneims.missioneims;

/**
 * Created by developer on 08/07/2017.
 */

/**
 * A dummy item representing a piece of content.
 */
public class MemberItem {
    public final String id;
    public final String content;
    public final String details;

    public MemberItem(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }
}