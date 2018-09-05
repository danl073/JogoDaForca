package br.com.senaijandira.jogodaforca;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class InicioActivity extends Activity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        mediaPlayer = MediaPlayer.create(this, R.raw.gta_san_andreas);


        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    protected void onPause(){
        super.onPause();

        mediaPlayer.pause();
    }

    protected void onResume(){
        super.onResume();

        if(!mediaPlayer.isPlaying())
            mediaPlayer.start();
    }

    public void iniciarJogo (View v){

        mediaPlayer.stop();
        //Abrir uma nova tela(Activity)
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);

        finish();
    }
};
