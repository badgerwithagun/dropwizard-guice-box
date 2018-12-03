package com.gruelbox.tools.dropwizard.guice.services;

import com.google.common.util.concurrent.Service;

import io.dropwizard.lifecycle.Managed;

/**
 * Allows a {@link Service} to be managed by DropWizard lifecycle.
 */
final class ManagedServiceTask implements Managed {

  private final Service task;

  public ManagedServiceTask(Service task) {
    this.task = task;
  }

  @Override
  public void start() throws Exception {
    task.startAsync().awaitRunning();
  }

  @Override
  public void stop() throws Exception {
    task.stopAsync().awaitTerminated();
  }
}