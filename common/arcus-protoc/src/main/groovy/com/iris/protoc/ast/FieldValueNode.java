/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.protoc.ast;

public class FieldValueNode extends ValueNode {
   private final FieldNode field;

   public FieldValueNode(FieldNode field) {
      this.field = field;
   }

   @Override
   public String getValue() {
      return field.getName();
   }

   @Override
   public TypeNode getType(Aliasing resolver) {
      return field.getType(resolver);
   }

   @Override
   public String toString() {
      return "field:" + field;
   }
}
