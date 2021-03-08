package io.github.arahmandc.android.limabd;



//from help

//https://www.youtube.com/watch?v=6Y9fVNII9_U
//https://square.github.io/picasso/
//https://www.101apps.co.za/articles/gridview-tutorial-using-the-picasso-library.html
// also
//https://captaincodes.blogspot.com/2017/10/simple-gridview-tutorial-android-studio.html
//https://www.loopwiki.com/application/create-gallery-android-application/
//https://codinginflow.com/tutorials/android/picasso-image-slider

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public Integer[] images = {R.drawable.lm1,R.drawable.lm2,R.drawable.lm3,R.drawable.lm4,
            R.drawable.lm5,R.drawable.lm6,R.drawable.lm7,R.drawable.lm8,R.drawable.lm9,
            R.drawable.lm10,R.drawable.lm11,R.drawable.lm12,R.drawable.lm13,R.drawable.lm14,
            R.drawable.lm15,R.drawable.lm16,R.drawable.lm17,R.drawable.lm18,R.drawable.lm19,
            R.drawable.lm20,R.drawable.lm21,R.drawable.lm22,R.drawable.lm23,R.drawable.lm24,
            R.drawable.lm25,R.drawable.lm26,R.drawable.lm27,R.drawable.lm28,R.drawable.lm29,
            R.drawable.lm30,R.drawable.lm31,R.drawable.lm32,R.drawable.lm33,R.drawable.lm34,
            R.drawable.lm35,R.drawable.lm36,R.drawable.lm37,R.drawable.lm38,R.drawable.lm39,
            R.drawable.lm40,R.drawable.lm41,R.drawable.lm42,R.drawable.lm43,R.drawable.lm44,
            R.drawable.lm45,R.drawable.lm46,R.drawable.lm47,R.drawable.lm48,R.drawable.lm19,
            R.drawable.lm50,
            R.drawable.lm51,R.drawable.lm52,R.drawable.lm53,R.drawable.lm54,
            R.drawable.lm55,R.drawable.lm56,R.drawable.lm57,R.drawable.lm58,R.drawable.lm59,
            R.drawable.lm60,R.drawable.lm61,R.drawable.lm62,
            R.drawable.lm63,R.drawable.lm64,R.drawable.lm65,R.drawable.lm66,R.drawable.lm67,
            R.drawable.lm68,R.drawable.lm69,R.drawable.lm70,R.drawable.lm71,R.drawable.lm72,
            R.drawable.lm73,R.drawable.lm74,R.drawable.lm75,R.drawable.lm76,R.drawable.lm77,
            R.drawable.lm78,R.drawable.lm79,R.drawable.lm80,R.drawable.lm81,R.drawable.lm82,
            R.drawable.lm83,R.drawable.lm84,R.drawable.lm85,R.drawable.lm86,R.drawable.lm87,
            R.drawable.lm88,R.drawable.lm89,R.drawable.lm90,R.drawable.lm91,R.drawable.lm92,
            R.drawable.lm93,R.drawable.lm94,R.drawable.lm95,R.drawable.lm96,R.drawable.lm97,
            R.drawable.lm98,R.drawable.lm99,R.drawable.lm100,R.drawable.lm101,R.drawable.lm102,
            R.drawable.lm103,R.drawable.lm104,R.drawable.lm105,R.drawable.lm106,
            R.drawable.lm107,R.drawable.lm108,R.drawable.lm109,R.drawable.lm110

    };

//    public Integer[] images ={};

    public ImageAdapter (Context c){
        context = c;

    }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        if (convertView==null){
            imageView =new ImageView(context);
        }else {
            imageView =(ImageView)convertView;
        }

        Picasso.get()
                .load(images[position])
                .resize(320, 320)
                .centerCrop()
                .into(imageView);
        return imageView;

    }

}
