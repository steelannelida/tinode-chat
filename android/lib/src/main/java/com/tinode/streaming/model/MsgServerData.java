/*****************************************************************************
 *
 * Copyright 2014, Tinode, All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *  File        :  MsgServerData.java
 *  Author      :  Gene Sokolov
 *  Created     :  18-May-2014
 *
 *****************************************************************************
 *
 *  Description : 
 *
 *   Server to client data packet with generic payload <T> 
 *
 *****************************************************************************/
package com.tinode.streaming.model;

public class MsgServerData<T> {
    public String id;
    public String topic;
    public String origin;
    public T content;

    public String toString() {
        StringBuilder buff = new StringBuilder();
        buff.append("{topic:").append(topic).append(",");
        if (origin != null && origin.length()>0) {
            buff.append("from:")
                    .append(origin)
                    .append(",");
        }
        buff.append(content.getClass().getName())
                .append(":")
                .append(content.toString())
                .append("}");

        return buff.toString();
    }
}
