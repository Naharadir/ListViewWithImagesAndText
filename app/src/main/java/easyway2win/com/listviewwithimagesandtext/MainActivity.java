package easyway2win.com.listviewwithimagesandtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Car> myCars = new ArrayList<Car>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateCarList();
        populateListView();

    }

    private void populateCarList(){
        myCars.add(new Car("Ford", 1940 , R.drawable.help ,"Needing work"));
        myCars.add(new Car("Toyota", 1994 , R.drawable.heart ,"Lovable"));
        myCars.add(new Car("Honda", 1999 , R.drawable.fish ,"Wet"));
        myCars.add(new Car("Porche", 2005 , R.drawable.lightning ,"Fast!"));
        myCars.add(new Car("Jeep", 200 , R.drawable.star ,"Awesome"));
        myCars.add(new Car("Rust-Bucket", 2010 , R.drawable.bug ," Not very good"));
        myCars.add(new Car("Moon Lander", 1971 , R.drawable.up ,"Out of this world"));
    }

    private void populateListView() {
        ArrayAdapter adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.carsListView);
        list.setAdapter(adapter);
    }


}
