/**
 * Copyright (c) 2013, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */
package com.cloudera.science.ml.parallel.summary;

import java.io.Serializable;

class Entry implements Serializable {

  private long count;
  
  Entry() {
    this.count = 0;
  }
  
  long getCount() {
    return count;
  }
  
  public Entry inc() {
    return inc(1L);
  }
  
  public Entry inc(long count) {
    this.count += count;
    return this;
  } 
}