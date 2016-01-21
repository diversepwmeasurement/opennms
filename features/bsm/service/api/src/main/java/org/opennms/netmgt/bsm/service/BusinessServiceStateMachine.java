/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2009-2015 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2015 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.bsm.service;

import java.util.List;
import java.util.Map;

import org.opennms.netmgt.bsm.persistence.api.BusinessServiceEntity;
import org.opennms.netmgt.model.OnmsAlarm;
import org.opennms.netmgt.model.OnmsMonitoredService;
import org.opennms.netmgt.model.OnmsSeverity;

public interface BusinessServiceStateMachine {

    /**
     * Sets the list of Business Services that need to managed by the state machine.
     *
     * @param businessServices list of services to manage
     */
    public void setBusinessServices(List<BusinessServiceEntity> businessServices);

    /**
     * Retrieves the list of Business Services that are currently managed by the state machine.
     *
     * @return list of managed services
     */
    public List<BusinessServiceEntity> getBusinessServices();

    /**
     * Retrieves the current operational status of a Business Service.
     *
     * @param businessService service to query for
     * @return the current operational status, or null if the service if not managed by the state machine
     */
    public OnmsSeverity getOperationalStatus(BusinessServiceEntity businessService);

    /**
     * Retrieves the current operational status of an IP-Service associated with a Business Service.
     *
     * @param ipService service to query for
     * @return the current operational status, or null if the IP-service is not monitored by the state machine
     */
    public OnmsSeverity getOperationalStatus(OnmsMonitoredService ipService);

    /**
     * Updates the states of the Business Services.
     */
    public void handleNewOrUpdatedAlarm(OnmsAlarm alarm);

    /**
     * Registers a state change handler.
     *
     * @param handler handler to register
     * @param attributes map of service attributes, required for compatibility with the ONMS-OSGi bridge.
     */
    public void addHandler(BusinessServiceStateChangeHandler handler, Map<String, String> attributes);

    /**
     * Unregisters a state change handler.
     *
     * @param handler handler to unregister
     * @param attributes map of service attributes, required for compatibility with the ONMS-OSGi bridge.
     * @return true of the handler was previously registered, and false otherwise
     */
    public boolean removeHandler(BusinessServiceStateChangeHandler handler, Map<String, String> attributes);
}
