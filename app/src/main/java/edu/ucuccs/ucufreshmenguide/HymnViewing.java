package edu.ucuccs.ucufreshmenguide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class HymnViewing extends Activity {

	VideoView video;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hymn_viewing);

		video = (VideoView) findViewById(R.id.video);
		video.setVideoPath("android.resource://" + getApplicationContext().getPackageName() + "/" + R.raw.hymn);
		video.setKeepScreenOn(true);
		video.start();
		MediaController myController = new MediaController(this);

		video.setMediaController(myController);
		myController.show();
	}

}
