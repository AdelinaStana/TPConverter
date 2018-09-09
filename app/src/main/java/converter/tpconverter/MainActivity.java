package converter.tpconverter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    private ImageView imageViewRound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewRound=(ImageView)findViewById(R.id.imageView_round);


        Bitmap icon = BitmapFactory.decodeResource(getResources(),R.drawable.ima);

        imageViewRound.setImageBitmap(icon);

        TextView tv1=(TextView)findViewById(R.id.textView2);
        Typeface face= Typeface.createFromAsset(getAssets(), "font.ttf");
        tv1.setTypeface(face);

    }

}
