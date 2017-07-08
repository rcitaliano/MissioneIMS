package it.missioneims.missioneims;

/**
 * Created by developer on 08/07/2017.
 */


import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

/**
 * A ContactItem representing a piece of content.
 */
public class ContactItem {
    public final int id;
    public final @StringRes int  title;
    public final @StringRes int  description;
    public final @DrawableRes int image;

    public ContactItem(@DrawableRes int image, int id, @StringRes int title, @StringRes int description) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return title +": "+ description;
    }
}
