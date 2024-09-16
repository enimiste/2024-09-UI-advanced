package com.company.timesheets.components.slider;

import com.vaadin.flow.component.html.Div;
import io.jmix.flowui.kit.meta.StudioComponent;
import io.jmix.flowui.kit.meta.StudioProperty;
import io.jmix.flowui.kit.meta.StudioUiKit;

import static io.jmix.flowui.kit.meta.StudioPropertyType.*;

@StudioUiKit
public interface SliderKit {

    @StudioComponent(
            name = "Slider",
            classFqn = "com.company.timesheets.components.slider.Slider",
            category = "Components",
            xmlElement = "slider",
            xmlnsAlias = "app",
            xmlns = "http://company.com/schema/app-ui-components",
            properties = {
                    @StudioProperty(xmlAttribute = "alignSelf", type = ENUMERATION,
                            classFqn = "com.vaadin.flow.component.orderedlayout.FlexComponent$Alignment",
                            defaultValue = "AUTO",
                            options = {"START", "END", "CENTER", "STRETCH", "BASELINE", "AUTO"}),
                    @StudioProperty(xmlAttribute = "colspan", type = INTEGER),
                    @StudioProperty(xmlAttribute = "max", type = INTEGER),
                    @StudioProperty(xmlAttribute = "min", type = INTEGER),
                    @StudioProperty(xmlAttribute = "value", type = INTEGER),
                    @StudioProperty(xmlAttribute = "height", type = SIZE),
                    @StudioProperty(xmlAttribute = "id", type = COMPONENT_ID),
                    @StudioProperty(xmlAttribute = "maxHeight", type = SIZE),
                    @StudioProperty(xmlAttribute = "maxWidth", type = SIZE),
                    @StudioProperty(xmlAttribute = "minHeight", type = SIZE),
                    @StudioProperty(xmlAttribute = "minWidth", type = SIZE),
                    @StudioProperty(xmlAttribute = "visible", type = BOOLEAN, defaultValue = "true"),
                    @StudioProperty(xmlAttribute = "width", type = SIZE)
            }
    )
    void slider();

}