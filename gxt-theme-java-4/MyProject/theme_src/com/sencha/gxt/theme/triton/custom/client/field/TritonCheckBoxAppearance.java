package com.sencha.gxt.theme.triton.custom.client.field;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.triton.client.base.field.Css3CheckBoxAppearance;

public class TritonCheckBoxAppearance extends Css3CheckBoxAppearance {

  public interface TritonCheckBoxResources extends Css3CheckBoxResources {
    @Override
    @Source({"com/sencha/gxt/theme/triton/client/base/field/Css3ValueBaseField.gss",
            "com/sencha/gxt/theme/triton/client/base/field/Css3CheckBox.gss", "TritonCheckBox.gss"})
    TritonCheckBoxStyle style();
  }

  public interface TritonCheckBoxStyle extends Css3CheckBoxStyle {
  }

  public TritonCheckBoxAppearance() {
    super(GWT.<TritonCheckBoxResources> create(TritonCheckBoxResources.class));
  }
}
