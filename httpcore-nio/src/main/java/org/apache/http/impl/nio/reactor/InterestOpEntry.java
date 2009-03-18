/*
 * $HeadURL$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.http.impl.nio.reactor;

/**
 * Helper class, representing an element on an {@link java.nio.channels.SelectionKey#interestOps(int) 
 * interestOps(int)} queue.
 */
class InterestOpEntry {

    public static final int OPERATION_TYPE_SET_EVENT_MASK = 0;

    public static final int OPERATION_TYPE_SET_EVENT = 1;

    public static final int OPERATION_TYPE_CLEAR_EVENT = 2;

    private final IOSessionImpl ioSession;
    private final int operationType;
    private final int operationArgument;

    public InterestOpEntry(IOSessionImpl ioSession, int operationType, int operationArgument) {
        // initialize instance members
        this.ioSession = ioSession;
        this.operationType = operationType;
        this.operationArgument = operationArgument;
    }

    public IOSessionImpl getIoSession() {
        return ioSession;
    }

    public int getOperationType() {
        return operationType;
    }

    public int getOperationArgument() {
        return operationArgument;
    }

}
