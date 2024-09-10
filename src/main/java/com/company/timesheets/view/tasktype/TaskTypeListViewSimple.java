package com.company.timesheets.view.tasktype;

import com.company.timesheets.entity.TaskType;
import com.company.timesheets.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "taskTypes-simple", layout = MainView.class)
@ViewController("ts_TaskType_simple.list")
@ViewDescriptor("task-type-list-view-simpe.xml")
@LookupComponent("taskTypesDataGrid")
@DialogMode(width = "64em")
public class TaskTypeListViewSimple extends StandardListView<TaskType> {
}