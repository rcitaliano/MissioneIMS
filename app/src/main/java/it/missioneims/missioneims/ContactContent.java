package it.missioneims.missioneims;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ContactContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ContactItem> ITEMS = new ArrayList<ContactItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<Integer, ContactItem> ITEM_MAP = new HashMap<Integer, ContactItem>();

    private static final int COUNT = 25;

    static {
        addItem(new ContactItem(R.mipmap.ic_facebook_logo,1,R.string.ims_fb_page,R.string.ims_fb_page_smalltext));
        addItem(new ContactItem(R.mipmap.ic_facebook_logo,1,R.string.shoek_fb_page,R.string.shoek_fb_page_smalltext));
        addItem(new ContactItem(R.drawable.youtube,1,R.string.shoek_youtube,R.string.shoek_youtube_smalltext));
    }

    private static void addItem(ContactItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

}
