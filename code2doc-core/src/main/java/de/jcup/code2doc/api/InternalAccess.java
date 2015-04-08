/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.*/
package de.jcup.code2doc.api;

/**
 * Internal access to API package private parts - NOT for normal use, only for internal usage. It could be removed in later releases!
 * 
 * @author de-jcup
 * @deprecated - only for internal usage! Could be changed in future.
 */
public class InternalAccess {

	public static void setExampleURL(UseCase useCase, String exampleURL){
		useCase.exampleURL=exampleURL;
	}
}
