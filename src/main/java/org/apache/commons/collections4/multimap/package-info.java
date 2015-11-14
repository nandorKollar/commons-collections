/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * This package contains implementations of the {@link org.apache.commons.collections4.MultiValuedMap} interfaces.
 * A MultiValuedMap holds a collection of values against each key.
 * <p>
 * The following implementations are provided in the package:
 * <ul>
 *   <li>MultiValuedHashMap - implementation that uses a HashMap to store the data
 *   <li>ListValuedHashMap  - implementation of a ListValuedMap using a HashMap as data store
 *   <li>SetValuedHashMap   - implementation of a SetValuedMap using a HashMap as data store
 * </ul>
 * <p>
 * The following decorators are provided in the package:
 * <ul>
 *   <li>Transformed - transforms elements added to the MultiValuedMap
 *   <li>Unmodifiable - ensures the collection cannot be altered
 * </ul>
 *
 * @version $Id$
 */
package org.apache.commons.collections4.multimap;