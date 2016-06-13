package com.sencha.gxt.theme.triton.custom.client.field;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.triton.client.base.field.Css3RadioAppearance;

public class TritonRadioAppearance extends Css3RadioAppearance {

  public interface TritonRadioResources extends Css3RadioResources {

    @Override
    @Source({"com/sencha/gxt/theme/triton/client/base/field/Css3ValueBaseField.gss",
            "com/sencha/gxt/theme/triton/client/base/field/Css3CheckBox.gss",
            "com/sencha/gxt/theme/triton/client/base/field/Css3Radio.gss", "TritonRadio.gss"})
    TritonRadioStyle style();
  }

  public interface TritonRadioStyle extends Css3RadioStyle {
  }

  public TritonRadioAppearance() {
    super(GWT.<TritonRadioResources> create(TritonRadioResources.class));
  }
}