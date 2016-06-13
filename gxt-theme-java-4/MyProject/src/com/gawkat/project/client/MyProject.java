package com.gawkat.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyProject implements EntryPoint {

  @Override
  public void onModuleLoad() {
    TextButton button = new TextButton("Test Button");
    RootPanel.get().add(button);
  }

}
