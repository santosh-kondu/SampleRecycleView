package com.example.santoshkondu.samplerecyclerlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by Santosh Kondu on 7/6/2016.
 */

public class ListRowViewHolder extends RecyclerView.ViewHolder {

    protected NetworkImageView thumbnail;
    protected TextView title;
    protected TextView subreddit;
    protected TextView author;
    protected TextView url;
    protected RelativeLayout relativeLayout;

    public ListRowViewHolder(View view) {
        super(view);
        this.thumbnail = (NetworkImageView) view.findViewById(R.id.network_image);
        this.title = (TextView) view.findViewById(R.id.title);
        this.subreddit = (TextView) view.findViewById(R.id.subreddit);
        this.author = (TextView) view.findViewById(R.id.author);
        this.url = (TextView) view.findViewById(R.id.url);
        this.relativeLayout = (RelativeLayout) view.findViewById(R.id.relLayout);
        view.setClickable(true);
    }

}
