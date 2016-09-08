package bistu.rookie.u_nity.androidproject_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
/*
    protected void onCreate(Bundle savedInstanceState);
    protected void onStart();
    protected void onRestart();
    protected void onResume();
    protected void onPause();
    protected void onStop();
    protected void onDestroy();
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("ActivityLife", "Activity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        Log.i("ActivityLife", "Activity Start");
        super.onStart();
    }

    protected void onRestart() {
        Log.i("ActivityLife", "Activity Restart");
        super.onRestart();
    }

    protected void onResume() {
        Log.i("ActivityLife", "Activity Resume");
        super.onResume();
    }

    protected void onPause() {
        Log.i("ActivityLife", "Activity Pause");
        super.onPause();
    }

    protected void onStop() {
        Log.i("ActivityLife", "Activity Stop");
        super.onStop();
    }

    protected void onDestroy() {
        Log.i("ActivityLife", "Activity Destory");
        super.onDestroy();
    }

}
