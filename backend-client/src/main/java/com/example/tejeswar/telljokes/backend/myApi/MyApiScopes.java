/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.tejeswar.telljokes.backend.myApi;

public class MyApiScopes {

  public static final String USERINFO_EMAIL = "https://www.googleapis.com/auth/userinfo.email";

  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(USERINFO_EMAIL);
    return java.util.Collections.unmodifiableSet(set);
  }

  private MyApiScopes() {
  }
}
