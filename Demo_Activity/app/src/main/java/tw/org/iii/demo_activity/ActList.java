package tw.org.iii.demo_activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by iii on 2017/7/18.
 */

public class ActList extends ListActivity {
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.i("Listdemo", String.valueOf(position));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] customers = {"Marco", "Tom", "Jason", "Selina", "Mark", "July",
                "Mary", "Tony", "Jessie", "Kiki", "May", "Japster",
                "Marian", "Bill", "Jacky", "Wang", "Matt"};

        ListAdapter adap = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, customers
        );
        setListAdapter(adap);
    }
}
