/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.rule.jaxb.loader.statement;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public final class SQLStatementRuleDefinitionEntityLoaderTest {
    
    @Test
    public void assertLoad() {
        assertFalse(new SQLStatementRuleDefinitionEntityLoader().load("META-INF/parsing-rule-definition/sharding/mysql/sql-statement-rule-definition.xml").getRules().isEmpty());
    }
    
    @Test(expected = NullPointerException.class)
    public void assertLoadWithNotExistedPath() {
        new SQLStatementRuleDefinitionEntityLoader().load("not-existed.xml");
    }
}
