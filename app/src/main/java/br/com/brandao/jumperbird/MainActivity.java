package br.com.brandao.jumperbird;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout container = (FrameLayout) findViewById(R.id.container);
        Game game = new Game(this);
        container.addView(game);

    }
        @Override
        protected void onPause () {
            super.onPause();
            game.cancela();
        }

        @Override
        protected void onResume () {
            super.onResume();
            game.inicia();
            new Thread(game).start();
        }

}

