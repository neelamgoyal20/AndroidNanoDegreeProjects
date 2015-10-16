package appportfolio.learn.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class LinkToMyAppsActivity extends AppCompatActivity implements View.OnClickListener {
    private Toast btnClickToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_to_my_apps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * method to show toast when user click on any button.
     *
     * @param msg Message to be displayed in toast.
     */
    private void showToast(String msg) {
        if (btnClickToast == null) {
            btnClickToast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        } else {
            btnClickToast.setText(msg);
        }
        btnClickToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_link_to_my_apps, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, getString(R.string.msg_setting_clicked), Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View clickedView) {
        switch (clickedView.getId()) {
            case R.id.btn_spotify_streamer: {
                showToast(getString(R.string.msg_spotify_streamer_clicked));
                break;
            }
            case R.id.btn_scores_app: {
                showToast(getString(R.string.msg_scores_app_clicked));
                break;
            }
            case R.id.btn_library_app: {
                showToast(getString(R.string.msg_library_app_clicked));
                break;
            }
            case R.id.btn_build_it_bigger: {
                showToast(getString(R.string.msg_build_it_bigger_clicked));
                break;
            }
            case R.id.btn_xyz_reader: {
                showToast(getString(R.string.msg_xyz_reader_clicked));
                break;
            }
            case R.id.btn_capstone: {
                showToast(getString(R.string.msg_capstone_clicked));
                break;
            }
            default:
                showToast(getString(R.string.msg_random_click));
        }
    }
}
