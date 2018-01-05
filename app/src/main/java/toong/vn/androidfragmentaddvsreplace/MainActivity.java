package toong.vn.androidfragmentaddvsreplace;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_go_to_fragment_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragment(Fragment1.newInstance());
            }
        });
    }

    public void goToFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.frame, fragment).addToBackStack("").commit();
//                ft.add(R.id.frame, fragment).addToBackStack("").commit();
    }

    public void pop() {
        getFragmentManager().popBackStack();
    }
}
