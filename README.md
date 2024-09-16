Project for UI advanced training

**Integrating JavaScript library**

Library - https://jqueryui.com/slider/

Steps:

* Create `slider.js` in the frontend/src/component/slider directory
* Create `Slider.java` class in the com.company.timesheets.components.slider package
* Add new element to XSD schema file - `app-iu-components.xsd`
* Implement loader - `SliderLoader.java`
* Register `SliderLoader` in components registry - main application class
* Test it - add slider into `initialLayout` in the main view 
IMPORTANT: Navigate to http://localhost:8080/ manually! 
* Test slider change event, too. Method added to main view controller


**Integrating Vaadin add-on**

All addons:  https://vaadin.com/directory/
Add-on to integrate: https://vaadin.com/directory/component/pdf-viewer

To include the Vaadin add-on in your application, add the Vaadin Add-ons maven repository and the add-on dependency to the project’s build.gradle.

* Add test PDF file to the resources/META-INF/resources/files directory
* Create a test view - `PdfTestView.java`
* Add add-on usage (check in view)
* Restart application and test))

Q&A

* **Q:** What will happen if we put a vbox inside virtual list
* **A:** Nothing can be placed inside virtual list


* **Q:** Can we create a reusable component using fragments? for example MyCustomComponent then use it in XML descriptor as <my-custom-component/>
* **A:** Fragment is not a custom component, it is different thing. Fragment can be reused in views using <fragment/> tag


* **Q:** How to add event handlers generation to this custom component?
* **A:** There is no way to do it right now, created an issue to add such support in future


* **Q:** Can we annotate many interfaces with the @StudioUiKit?
* **A:** Yes, it can be done like this, check in current project version

