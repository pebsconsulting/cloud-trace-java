// Copyright 2016 Google Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.cloud.trace;

import com.google.cloud.trace.core.SpanContext;
import com.google.cloud.trace.core.SpanContextHandle;

/**
 * A SpanContextHandle that is not associated with the current context. Calling detach() will have
 * no effect.
 */
public class DetachedSpanContextHandle implements SpanContextHandle {
  private final SpanContext spanContext;

  public DetachedSpanContextHandle(SpanContext spanContext) {
    this.spanContext = spanContext;
  }

  @Override
  public SpanContext getCurrentSpanContext() {
    return spanContext;
  }

  @Override
  public void detach() {}
}
