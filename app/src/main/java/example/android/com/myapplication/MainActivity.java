package example.android.com.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    private boolean mShouldFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
        if (mShouldFinish) {
            finish();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        mShouldFinish = true;
        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("XXX",
                this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[2]
                        .getMethodName());
    }


}
