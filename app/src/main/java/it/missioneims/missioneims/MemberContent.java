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
        addItem(new MemberItem(R.drawable.brenda,"brenda", "singer"));
        addItem(new MemberItem(R.drawable.dafne,"dafne", "dancer"));
        addItem(new MemberItem(R.drawable.davide,"davide", "musicists"));
        addItem(new MemberItem(R.drawable.fabiana,"fabiana", "photographer"));
        addItem(new MemberItem(R.drawable.francesca_anastasio,"francesca", "dancer"));
        addItem(new MemberItem(R.drawable.isidoro,"isidoro", "manager"));
        addItem(new MemberItem(R.drawable.jolanda,"jolanda", "singer"));
        addItem(new MemberItem(R.drawable.julieta,"julieta", "singer"));
        addItem(new MemberItem(R.drawable.liliana,"liliana", "manager"));
        addItem(new MemberItem(R.drawable.ludovica,"ludovica", "dancer"));
        addItem(new MemberItem(R.drawable.mirko,"mirko", "dancer"));
        addItem(new MemberItem(R.drawable.miguel,"miguel", "musicist"));
        addItem(new MemberItem(R.drawable.sandy,"sandy", "singer"));
        addItem(new MemberItem(R.drawable.thomas,"thomas", "rapper"));
        addItem(new MemberItem(R.drawable.valeria,"valeria", "dancer"));
        addItem(new MemberItem(R.drawable.robson,"robson", "IT tech"));
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