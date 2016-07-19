package apitest.nht.com.multiapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_http)
    TextView tvHttp;
    @BindView(R.id.bt_http)
    Button btHttp;
    @BindView(R.id.iv_http)
    ImageView ivHttp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        TextView tv = (TextView) findViewById(R.id.tv_http);
//        tv.setText(GlobalVar.dateIp);
        tvHttp.setText(GlobalVar.dateIp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.tv_http, R.id.bt_http, R.id.iv_http})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_http:
                tvHttp.setText("123213");
                break;
            case R.id.bt_http:
                break;
            case R.id.iv_http:
                break;
        }
    }
}
