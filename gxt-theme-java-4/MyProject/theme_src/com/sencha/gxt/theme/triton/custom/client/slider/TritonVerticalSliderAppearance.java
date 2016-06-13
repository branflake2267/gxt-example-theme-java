package com.sencha.gxt.theme.triton.custom.client.slider;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.sencha.gxt.theme.triton.client.base.slider.Css3VerticalSliderAppearance;

public class TritonVerticalSliderAppearance extends Css3VerticalSliderAppearance {

  public interface TritonVerticalSliderResources extends Css3VerticalSliderResources {

    @Source({"com/sencha/gxt/theme/triton/client/base/slider/Css3HorizontalSlider.gss",
            "com/sencha/gxt/theme/triton/client/base/slider/Css3VerticalSlider.gss",
            "TritonSlider.gss", "TritonVerticalSlider.gss"})
    TritonVerticalSliderStyle style();

    @ImageOptions(height = 20, width = 20)
    ImageResource sliderThumbVertical();
  }

  public interface TritonVerticalSliderStyle extends Css3VerticalSliderStyle {
  }

  public TritonVerticalSliderAppearance() {
    this(GWT.<TritonVerticalSliderResources> create(TritonVerticalSliderResources.class));
  }

  public TritonVerticalSliderAppearance(TritonVerticalSliderResources resources) {
    super(resources);
  }
}
