/**
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright IBM Corporation 2019
 */

package org.zowe.integrationtest

import java.util.logging.Level

class Constants {
    /**
     * Default logging level
     */
    static Level DEFAULT_LOGGING_LEVEL = Level.INFO;

    /**
     * The folder name which we hold all integration test jobs into
     */
    static final String INTEGRATION_TEST_JENKINS_FOLDER = 'jenkins-library-integration-tests'
}
