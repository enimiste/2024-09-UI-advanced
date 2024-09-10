package com.company.timesheets.security;

import com.company.timesheets.entity.TimeEntry;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "TimeEntriesReader", code = TimeEntriesReaderRole.CODE, scope = "UI")
public interface TimeEntriesReaderRole {
    String CODE = "time-entries-reader";

    @MenuPolicy(menuIds = "ts_MyTimeEntryListView")
    @ViewPolicy(viewIds = {"ts_MyTimeEntryListView", "ts_TimeEntry.detail"})
    void screens();

    @EntityAttributePolicy(entityClass = TimeEntry.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = TimeEntry.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE, EntityPolicyAction.DELETE})
    void timeEntry();
}