package com.example.sharanya.MyPassbook;

import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;
/**
 * Created by Sharanya on 4/05/2018.
 */

public class BlogPostId {
    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }
}
