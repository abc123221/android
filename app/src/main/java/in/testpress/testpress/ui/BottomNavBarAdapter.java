package in.testpress.testpress.ui;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import in.testpress.testpress.R;

public class BottomNavBarAdapter extends BaseAdapter {
    private Context mContext;
    private final int[] mItemsImageId;
    private int selectedPosition;

    public BottomNavBarAdapter(Context context, int[] menuItemImageId) {
        mContext = context;
        mItemsImageId = menuItemImageId;
    }

    @Override
    public int getCount() {
        return mItemsImageId.length;
    }

    @Override
    public Object getItem(int position) {
        return mItemsImageId[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.bottom_nav_bar_item, null);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.menu_icon);
        imageView.setImageResource(mItemsImageId[position]);
        if (selectedPosition == position) {
            imageView.setColorFilter(ContextCompat.getColor(mContext, R.color.primary));
        } else {
            imageView.setColorFilter(ContextCompat.getColor(mContext,
                    R.color.bottom_bar_unselected_item));
        }
        return convertView;
    }

    public void setSelectedPosition(int selectedPosition) {
        this.selectedPosition = selectedPosition;
    }
}