package com.sus.kumar.autocompletetextview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Customized_List_View extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;

    int[] animalImages = { R.drawable.one,R.drawable.two,R.drawable.three,
                          R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven};

    String[] animalNames = {"Tiger","LION","elephant","Dog","Cat","Pig","Snake"};

    int [] animalPower = {100,200,300,400,500,600,700};
    int [] animalspeed = {100,200,300,400,500,600,700 };


    public Customized_List_View(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService
                ( Context.LAYOUT_INFLATER_SERVICE );

    }

    @Override
    public int getCount() {
        return animalImages.length;
    }

    @Override
    public Object getItem(int position) {
        return animalImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

         view = layoutInflater.inflate( R.layout.customized_view,null);

        ImageView imageView = (ImageView)view.findViewById( R.id.imageView );
        final TextView name = (TextView)view.findViewById( R.id.txtAnimalName );
        TextView power = (TextView)view.findViewById( R.id.txtAnimalPower );
        TextView speed = (TextView)view.findViewById( R.id.txtAnimalSpeed );

        String oldTxtAnimalPower= power.getText().toString();
        String oldTxtAnimalSpeed= speed.getText().toString();

        //imageView.setImageResource( animalImages[position] );
        //name.setText( animalNames[position] );

        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 4;
        Bitmap bm = BitmapFactory.decodeResource(context.getResources(),animalImages[position]
                ,options);
        imageView.setImageBitmap(bm);
         return view;
    }
}
