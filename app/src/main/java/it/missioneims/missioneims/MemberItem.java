package it.missioneims.missioneims;

/**
 * Created by developer on 08/07/2017.
 */

import android.support.annotation.DrawableRes;

/**
 * A dummy item representing a piece of content.
 */
public class MemberItem {
    public final String member_name;
    public final String member_role;
    public final @DrawableRes int member_image;

    public MemberItem( @DrawableRes int member_image, String member_name, String member_role) {
        this.member_name = member_name;
        this.member_role = member_role;
        this.member_image = member_image;
    }

    @Override
    public String toString() {
        return member_name;
    }
}