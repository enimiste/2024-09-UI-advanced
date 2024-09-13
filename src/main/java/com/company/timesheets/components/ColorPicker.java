package com.company.timesheets.components;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Tag;

@Tag("input")
public class ColorPicker extends AbstractSinglePropertyField<ColorPicker, String> {
    public ColorPicker() {
        super("value", "", false);
        getElement().setAttribute("type", "color");

        setSynchronizedEvent("change");
    }
}
