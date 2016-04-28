package hu.bme.dszenasi.circleandroid.vmlist.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cz.cesnet.cloud.occi.core.Entity;
import cz.cesnet.cloud.occi.infrastructure.Compute;
import hu.bme.dszenasi.circleandroid.R;

/**
 * Created by mszenasi on 2016-04-28.
 */
public class VmAdapter extends ArrayAdapter<Entity> {

    Context context;
    public VmAdapter(Context context, int resource, List<Entity> objects) {
        super(context, resource, objects);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.vmlist_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.hostname = (TextView) convertView.findViewById(R.id.hostname);
            viewHolder.status = (TextView) convertView.findViewById(R.id.status);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();

        }

        Entity entity=getItem(position);
        viewHolder.hostname.setText(entity.getValue(Compute.HOSTNAME_ATTRIBUTE_NAME));
        viewHolder.status.setText(entity.getValue(Compute.STATE_ATTRIBUTE_NAME));

        return convertView;
    }

    public class ViewHolder{
        TextView hostname;
        TextView status;
    }
}
