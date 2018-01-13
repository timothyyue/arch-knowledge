/*
 * Copyright (C) 2017 jumei, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package me.arch.cluster.loadbalance;

import java.util.List;

/**
 * Function: Please Descrip This Class.
 * <p>
 * Created by timothy on 13/01/2018.
 * Copyright (c) 2017,baolingy@jumei.com All Rights Reserved.
 */
public abstract class AbstractLoadBlance implements LoadBalance {


    public <T extends Resource> T select(List<T> resources) {
        if (resources == null || resources.size() == 0) {
            return null;
        }
        if (resources.size() == 1)
            return resources.get(0);


        return null;
    }

    protected abstract <T extends Resource> T doSelect(List<T> resources);

    protected <T extends Resource> int getWeight(T resource) {

        return resource.getWeight();
    }
}
