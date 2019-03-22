package vgroup.hello.qlnhanvien;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.menuDangKy){
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.layout_dangky);
            dialog.setTitle(R.string.titleDangKy);
            dialog.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
