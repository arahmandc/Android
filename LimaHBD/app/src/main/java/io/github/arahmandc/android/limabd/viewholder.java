package io.github.arahmandc.android.limabd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder{

    //    ImageView img;
    TextView t1;
    public viewholder(@NonNull View itemView)
    {
        super(itemView);
//        img=(ImageView)itemView.findViewById(R.id.img1);
        t1=(TextView)itemView.findViewById(R.id.t1);
//        t2=(TextView)itemView.findViewById(R.id.t2);
    }
}
