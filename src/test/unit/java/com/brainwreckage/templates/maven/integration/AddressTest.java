
package com.brainwreckage.templates.maven.integration;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddressTest {
  @Test
  public void newAddress() {
    assertThat(new Address(), is(not(nullValue())));
  }
}
