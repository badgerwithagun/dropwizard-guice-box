package com.gruelbox.tools.dropwizard.guice;

/*-
 * ===============================================================================L
 * com.gruelbox:dropwizard-guice-box
 * ================================================================================
 * Copyright (C) 2018 Gruelbox
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===============================================================================E
 */


import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Multi-bind classes implementing this interface to access the
 * {@link Environment} during the
 * {@link Application#run(io.dropwizard.Configuration, Environment)} phase of
 * application startup.
 *
 * <p>
 * You may inject the application configuration if you need it. The
 * {@link Environment} is also available for injection, but is provided here for
 * convenience and historical reasons.
 * </p>
 *
 * @author Graham Crockford
 */
public interface EnvironmentInitialiser {

  /**
   * Called during application startup and allows code to modify the
   * {@link Environment}.
   *
   * @param environment The application {@link Environment}.
   */
  public void init(Environment environment);

}