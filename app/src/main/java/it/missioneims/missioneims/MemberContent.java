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
public class MemberContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<MemberItem> ITEMS = new ArrayList<MemberItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, MemberItem> ITEM_MAP = new HashMap<String, MemberItem>();

    static {
        // Add some sample items.
        addItem(new MemberItem("image","brenda", "singer"));
        addItem(new MemberItem("image","dafne", "dancer"));
        addItem(new MemberItem("image","davide", "musicists"));
        addItem(new MemberItem("image","fabiana", "photographer"));
        addItem(new MemberItem("image","francesca", "dancer"));
        addItem(new MemberItem("image","isidoro", "manager"));
        addItem(new MemberItem("image","jolanda", "singer"));
        addItem(new MemberItem("image","julieta", "singer"));
        addItem(new MemberItem("image","ludovica", "dancer"));
        addItem(new MemberItem("image","mirko", "dancer"));
        addItem(new MemberItem("image","miguel", "musicist"));
        addItem(new MemberItem("image","sandy", "singer"));
        addItem(new MemberItem("image","thomas", "rapper"));
        addItem(new MemberItem("image","valeria", "dancer"));
        addItem(new MemberItem("image","robson", "IT tech"));
    }

    private static void addItem(MemberItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.member_name, item);
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