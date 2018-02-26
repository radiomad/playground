/*
 * Copyright (c) 2018 Nova Ordis LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.novaordis.playground.openshift.applications.restservice.command;

import io.novaordis.playground.openshift.applications.restservice.Context;

/**
 * @author Ovidiu Feodorov <ovidiu@novaordis.com>
 * @since 2/26/18
 */
public class Version extends CommandBase {

    // Constants -------------------------------------------------------------------------------------------------------

    // Static ----------------------------------------------------------------------------------------------------------

    // Attributes ------------------------------------------------------------------------------------------------------

    // Constructors ----------------------------------------------------------------------------------------------------

    public Version(Context context) {

        super(context);
    }

    // Public ----------------------------------------------------------------------------------------------------------

    // Command implementation ------------------------------------------------------------------------------------------

    @Override
    public void execute() {
        throw new RuntimeException("execute() NOT YET IMPLEMENTED");
    }

    // Package protected -----------------------------------------------------------------------------------------------

    // Protected -------------------------------------------------------------------------------------------------------

    // Private ---------------------------------------------------------------------------------------------------------

    // Inner classes ---------------------------------------------------------------------------------------------------

}
