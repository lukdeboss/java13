
package com.tnenewboston.travis;

import android.app.List.Activity;
import ... arrayAdapter

public class Menu extends ListAvtivity {

  String classes[] = {"startingPoint", "lukasz1", "lukasz2"};

  @Override
  protection void onCreate(Bundle savedInstanceState
    super.onCreate(savedInstanceState);
    setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1 , classes));
  }
 
  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    String cheese = classes[position];
    super.onListItemClick(1, v, position, id);
    try {
    |
    dodalismy na wypadek gdyby klasa startngPoint nie byla znaleziona
    Class ourClass = Class.forName("com.thenewboston.travis." + cheese );
    Intent ourIntent = new Intent(Menu.this, ourClass);
    startActivity(ourIntent);
    } catch(ClasssNotFoundException e) {
      e.printStackTrace();
      }
  }


}

