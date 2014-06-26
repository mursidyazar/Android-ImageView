package org.kod5.android;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	//Bu k�s�mda bile�enlerimizi tan�ml�yoruz.
	private ImageView imageView;
	private Button button;
	private int kontrol2=0;//hangi resim oldu�unu kontrol etmek i�in 

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama a��ld���nda �al��t�r�lan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bu k�s�mda yukar�da tan�mlad���m�z bile�enlerle xml olarak haz�rlad���m�z bile�enleri birbirlerine ba�l�yoruz. 
        imageView = (ImageView)findViewById(R.id.imageView1);        
        button = (Button)findViewById(R.id.button1);
        
        imageView.setVisibility(View.INVISIBLE);//resmin g�r�n�rl�۟n� kapat�yoruz.
        
        button.setOnClickListener(new OnClickListener() {  
			
			@Override
			public void onClick(View v) { //Burada Buttona t�kland���nda �al��t�r�lacak kodlar yer al�yor.
			  
				int kontrol = imageView.getVisibility();
				if(kontrol==0)
					imageView.setVisibility(View.INVISIBLE);
				else
					imageView.setVisibility(View.VISIBLE);
				  			
			}
		});
        
        imageView.setOnClickListener(new OnClickListener() {//resme t�kland���nda �al��acak kodlar bu k�s�mda
			
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
