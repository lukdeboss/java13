
package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;	
public class Splash extends Activirty {
  MediaPlayer ourSong;|

  @Override
  protected void onCreate(Bundle TravisLoveBacon) {
    super.onCreate(TravisLoveBacon);
    setContentView(R.layout.splash);
    ourSong = MediaPlayer.create(Splash.this, R.raw.splashsound);
    ourSong.start();
    Thread timer = new Therad(){
      public void run() {
        try {
          sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Intent oopenStartingPoint = new Intent("com.thenewboston.travis.MENU")
            startActivity(openStartingPoint);
        }
      }
    };
    timer.start();
  }
}


