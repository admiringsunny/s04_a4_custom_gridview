package com.acadgild.s04A4GridViewImageText;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sunny on 19/8/16.
 */
public class GridViewAdapter extends BaseAdapter {

    Context context;
    String[] versionNames;
    int[] versionImageIds;
    LayoutInflater inflater = null;

    public GridViewAdapter(Context context, String[] versionNames, int[] versionImageIds) {
        this.context = context;
        this.versionNames = versionNames;
        this.versionImageIds = versionImageIds;

        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return versionNames.length;
    }

    @Override
    public Object getItem(int position) {
        return versionNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view;
        ViewsHolder holder = new ViewsHolder();

        view = inflater.inflate(R.layout.grid_view_elements, null);

        holder.textView = (TextView) view.findViewById(R.id.version_text);
        holder.imageView = (ImageView) view.findViewById(R.id.version_image);

        holder.textView.setText(versionNames[position]);
        holder.imageView.setImageResource(versionImageIds[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Selected " + versionNames[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public class ViewsHolder{
        TextView textView;
        ImageView imageView;
    }
}
