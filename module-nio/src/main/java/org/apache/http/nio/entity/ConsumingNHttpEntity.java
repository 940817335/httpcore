/*
 * $HeadURL:$
 * $Revision:$
 * $Date:$
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

package org.apache.http.nio.entity;

import org.apache.http.HttpEntity;

/**
 * A non-blocking entity that allows content to be consumed from a decoder.
 *
 * If external code wants to be notified when more content is available, it
 * should install a ContentListener on the entity via
 * {@link #setContentListener(org.apache.http.nio.entity.ConsumingNHttpEntity.ContentListener)}.
 * When content becomes available, implementations must notify the listener.
 * <p>
 * All blocking methods throw an {@link UnsupportedOperationException}.
 *
 * @author <a href="mailto:sberlin at gmail.com">Sam Berlin</a>
 */
public interface ConsumingNHttpEntity extends HttpEntity {

    ContentListener getContentListener();

}
