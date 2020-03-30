package br.com.brandao.jumperbird;

import android.content.Context;
import android.view.SurfaceView;

public class Game extends SurfaceView implements Runnable{

   private boolean isRunning = true;

    public Game(Context context) {
        super(context);
    }

    public void run(){
        //implementar o loop principal do nosso jogo
        while(isRunning) {
//Neste loop vamos gerenciar os elementos do Jumper.
        }
    }

    public void cancela() {
        this.isRunning = false;
    }

}

