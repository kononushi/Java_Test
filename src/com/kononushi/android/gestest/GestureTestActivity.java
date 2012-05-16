package com.kononushi.android.gestest;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class GestureTestActivity extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    /** Called when the activity is first created. */

	GestureDetector gestureDetector;


	//たくさんのコメントを追加！

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        gestureDetector = new GestureDetector(this, this);

    }

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		gestureDetector.onTouchEvent(event);

		switch(event.getAction()){
		case MotionEvent.ACTION_DOWN:

		}

		return false;
	}

	public boolean onDoubleTap(MotionEvent e) {
		Toast.makeText(this, "ダブルタップ", Toast.LENGTH_LONG).show();

		return false;
	}

	public boolean onSingleTapConfirmed(MotionEvent e) {
		Toast.makeText(this, "シングルタップコンファーム()", Toast.LENGTH_LONG).show();
		return false;
	}

	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		Toast.makeText(this, "オンフリング", Toast.LENGTH_LONG).show();
		return false;
	}

	public void onLongPress(MotionEvent e) {
		Toast.makeText(this, "オンロングプレス", Toast.LENGTH_LONG).show();
	}

	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
//		Toast.makeText(this, "オンスクロール", Toast.LENGTH_LONG).show();
		return false;
	}

	public boolean onDown(MotionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public void onShowPress(MotionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public boolean onSingleTapUp(MotionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	public boolean onDoubleTapEvent(MotionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}