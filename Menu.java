
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
    super.onListItemClick(1, v, position, id);
    Class ourClass = Class.forName("com.thenewboston.travis.startingPoint");
                                    |
                                    to jest referencja do pliku startingPoint.java
    Intent ourIntent = new Intent(Menu.this, ourClass);
                                   |         |
                                   |         nazwa klasy
                                   to jest context, czyli ze w klasie Menu
    startActivity(ourIntent);
  }


}

