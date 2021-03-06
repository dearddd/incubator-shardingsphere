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

package org.apache.shardingsphere.core.parse.sql.segment.dml.order.item;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.shardingsphere.core.constant.OrderDirection;
import org.apache.shardingsphere.core.parse.sql.segment.SQLSegment;

/**
 * Order by item segment.
 * 
 * @author duhongjun
 */
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class OrderByItemSegment implements SQLSegment {
    
    private final int startIndex;
    
    private final int stopIndex;
    
    private final OrderDirection orderDirection;
    
    private final OrderDirection nullOrderDirection;
    
    private int index = -1;
    
    @Override
    public final boolean equals(final Object obj) {
        if (null == obj || !(obj instanceof OrderByItemSegment)) {
            return false;
        }
        OrderByItemSegment orderByItemSegment = (OrderByItemSegment) obj;
        return orderDirection == orderByItemSegment.getOrderDirection() && index == orderByItemSegment.getIndex();
    }
}
