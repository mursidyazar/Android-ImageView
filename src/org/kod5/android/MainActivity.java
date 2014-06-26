package org.kod5.android;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	//Bu k›s›mda bileﬂenlerimizi tan›ml›yoruz.
	private ImageView imageView;
	private Button button;
	private int kontrol2=0;//hangi resim oldu€unu kontrol etmek için 

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama aç›ld›€›nda çal›ﬂt›r›lan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bu k›s›mda yukar›da tan›mlad›€›m›z bileﬂenlerle xml olarak haz›rlad›€›m›z bileﬂenleri birbirlerine ba€l›yoruz. 
        imageView = (ImageView)findViewById(R.id.imageView1);        
        button = (Button)findViewById(R.id.button1);
        
        imageView.setVisibility(View.INVISIBLE);//resmin görünürlü€ünü kapat›yoruz.
        
        button.setOnClickListener(new OnClickListener() {  
			
			@Override
			public void onClick(View v) { //Burada Buttona t›kland›€›nda çal›ﬂt›r›lacak kodlar yer al›yor.
			  
				int kontrol = imageView.getVisibility();
				if(kontrol==0)
					imageView.setVisibility(View.INVISIBLE);
				else
					imageView.setVisibility(View.VISIBLE);
				  			
			}
		});
        
        imageView.setOnClickListener(new OnClickListener() {//resme t›kland›€›nda çal›ﬂacak kodlar bu k›s›mda
			
			@Override
			public void onClick(View v) {
				
				if(kontrol2==0){
					imageView.setImageResource(R.drawable.resim2);
					kontrol2=1;
				}else{
					imageView.setImageResource(R.drawable.resim1);
					kontrol2=0;
				}
			}
		});
    }
}
