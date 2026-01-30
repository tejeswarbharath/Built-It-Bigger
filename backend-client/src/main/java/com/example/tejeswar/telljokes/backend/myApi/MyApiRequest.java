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

@SuppressWarnings("javadoc")
public abstract class MyApiRequest<T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

  public MyApiRequest(
      MyApi client, String method, String uriTemplate, Object content, Class<T> responseClass) {
    super(
        client,
        method,
        uriTemplate,
        content,
        responseClass);
  }

  @com.google.api.client.util.Key
  private java.lang.String alt;

  public java.lang.String getAlt() {
    return alt;
  }

  public MyApiRequest<T> setAlt(java.lang.String alt) {
    this.alt = alt;
    return this;
  }

  @com.google.api.client.util.Key
  private java.lang.String fields;

  public java.lang.String getFields() {
    return fields;
  }

  public MyApiRequest<T> setFields(java.lang.String fields) {
    this.fields = fields;
    return this;
  }

  @com.google.api.client.util.Key
  private java.lang.String key;

  public java.lang.String getKey() {
    return key;
  }

  public MyApiRequest<T> setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  @com.google.api.client.util.Key("oauth_token")
  private java.lang.String oauthToken;

  public java.lang.String getOauthToken() {
    return oauthToken;
  }

  public MyApiRequest<T> setOauthToken(java.lang.String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  @com.google.api.client.util.Key
  private java.lang.Boolean prettyPrint;

  public java.lang.Boolean getPrettyPrint() {
    return prettyPrint;
  }

  public MyApiRequest<T> setPrettyPrint(java.lang.Boolean prettyPrint) {
    this.prettyPrint = prettyPrint;
    return this;
  }

  @com.google.api.client.util.Key
  private java.lang.String quotaUser;

  public java.lang.String getQuotaUser() {
    return quotaUser;
  }

  public MyApiRequest<T> setQuotaUser(java.lang.String quotaUser) {
    this.quotaUser = quotaUser;
    return this;
  }

  @com.google.api.client.util.Key
  private java.lang.String userIp;

  public java.lang.String getUserIp() {
    return userIp;
  }

  public MyApiRequest<T> setUserIp(java.lang.String userIp) {
    this.userIp = userIp;
    return this;
  }

  @Override
  public final MyApi getAbstractGoogleClient() {
    return (MyApi) super.getAbstractGoogleClient();
  }

  @Override
  public MyApiRequest<T> setDisableGZipContent(boolean disableGZipContent) {
    return (MyApiRequest<T>) super.setDisableGZipContent(disableGZipContent);
  }

  @Override
  public MyApiRequest<T> setRequestHeaders(com.google.api.client.http.HttpHeaders headers) {
    return (MyApiRequest<T>) super.setRequestHeaders(headers);
  }

  @Override
  public MyApiRequest<T> set(String parameterName, Object value) {
    return (MyApiRequest<T>) super.set(parameterName, value);
  }
}
