package rom.kidsgame.kidslearninggame;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class maths_quiz_result extends AppCompatActivity {

    Button playagain,home;
    TextView score;
//    MediaPlayer congrats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_quiz_result);
//        congrats = MediaPlayer.create(maths_quiz_result.this,R.raw.congratulations_by_alex);
//        congrats.start();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width= dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int) (width*.7),(int)(height*.6));
        WindowManager.LayoutParams params=getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x=0;
        params.y=-20;

        playagain=(Button) findViewById(R.id.button7);
        home=(Button) findViewById(R.id.button9);
        score=(TextView) findViewById(R.id.textView17);
        score.setText(getIntent().getIntExtra("score",0)+"");

        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextintent=new Intent(maths_quiz_result.this, maths_quiz.class);
                startActivity(nextintent);
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}