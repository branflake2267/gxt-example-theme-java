package com.sencha.gxt.theme.triton.custom.client.button;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.sencha.gxt.theme.triton.client.base.button.Css3ButtonCellAppearance;
import com.sencha.gxt.theme.triton.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import com.sencha.gxt.theme.triton.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;

public class TritonButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  public interface TritonButtonStyle extends Css3ButtonStyle {
  }

  public TritonButtonCellAppearance() {
    this(GWT.<Css3ButtonCellAppearance.Css3ButtonResources> create(Css3ButtonResources.class));
  }

  public TritonButtonCellAppearance(Css3ButtonResources resources) {
    super(resources);
  }

  @Override
  protected boolean applyMenuArrowClass() {
    return true;
  }
}
