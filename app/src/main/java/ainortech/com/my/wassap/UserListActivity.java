package ainortech.com.my.wassap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UserListActivity extends AppCompatActivity {

    ArrayList<String> users = new ArrayList<>();

    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        ListView userListView = findViewById(R.id.userListView);

        users.add("Asad");
        users.add("Affan");
        users.add("Azka");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);

        userListView.setAdapter(arrayAdapter);


    }
}
