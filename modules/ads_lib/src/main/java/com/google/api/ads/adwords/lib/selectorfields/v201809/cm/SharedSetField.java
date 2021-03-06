// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.selectorfields.v201809.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code SharedSet}.
 */
public enum SharedSetField implements EntityField {

  // Fields constants definitions

  /**
   * The number of entities in the shared set.
   */
  MemberCount(false),

  /**
   * Shared Sets must have names that are unique among active shared sets of the same type.
   */
  @Filterable
  Name(true),

  /**
   * The number of campaigns that actively use the shared set.
   */
  ReferenceCount(false),

  /**
   * 
   */
  @Filterable
  SharedSetId(true),

  /**
   * The status of the shared set.
   */
  @Filterable
  Status(true),

  /**
   * 
   */
  @Filterable
  Type(true),

  ;

  private final boolean isFilterable;

  private SharedSetField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
