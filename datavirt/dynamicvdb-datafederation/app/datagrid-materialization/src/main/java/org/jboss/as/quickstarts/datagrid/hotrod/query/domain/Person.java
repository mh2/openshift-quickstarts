/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.datagrid.hotrod.query.domain;

import java.util.List;
import org.infinispan.protostream.annotations.ProtoField;


/**
 * @author Adrian Nistor
 */
public class Person {

   @ProtoField(number = 2, required = true)
   public String name;
   @ProtoField(number = 1, required = true)
   public int id;
   @ProtoField(number = 3)
   public String email;
   private List<PhoneNumber> phones;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public List<PhoneNumber> getPhones() {
      return phones;
   }

   public void setPhones(List<PhoneNumber> phones) {
      this.phones = phones;
   }

   @Override
   public String toString() {
      return "Person{" +
            "id=" + id +
            ", name='" + name +
            "', email='" + email + '\'' +
            ", phones=" + phones +
            '}';
   }
}
