package com.company.timesheets.app;

import com.vaadin.flow.component.UI;
import org.springframework.stereotype.Component;

@Component("ts_GoogleSearchRedirector")
public class GoogleSearchRedirector {


    public String redirectToGoogleSearch(){
        String url = "https://google.com";
        UI.getCurrent().getPage().open(url);

        return url;
    }
}