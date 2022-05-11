package com.mjc.mokkoji;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MoItemViewHolder {

    public ImageView ivIcon;

    public TextView tvItem;

    public MoItemViewHolder(View a_view) {
        ivIcon = a_view.findViewById(R.id.iv_icon);
        tvItem = a_view.findViewById(R.id.tv_Item);
    }
}