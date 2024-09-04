package com.company.timesheets.view.mytimeentry;


import com.company.timesheets.app.TimeEntrySupport;
import com.company.timesheets.entity.TimeEntry;
import com.company.timesheets.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "my-time-entry-list-view", layout = MainView.class)
@ViewController("ts_MyTimeEntryListView")
@ViewDescriptor("my-time-entry-list-view.xml")
public class MyTimeEntryListView extends StandardView {

    @ViewComponent
    private DataGrid<TimeEntry> timeEntriesDataGrid;
    @Autowired
    private TimeEntrySupport timeEntrySupport;

    @Subscribe("timeEntriesDataGrid.copy")
    public void onTimeEntriesDataGridCopy(final ActionPerformedEvent event) {
        TimeEntry selectedItem = timeEntriesDataGrid.getSingleSelectedItem();
        if (selectedItem == null) {
            return;
        }
        TimeEntry copiedEntity = timeEntrySupport.copy(selectedItem);

        //todo open detail view
    }
}