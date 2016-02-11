package robojeff;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerIT {
  @Test
  public void newCustomer() {
    assertThat(new Customer(new ArrayList<Address>()), is(not(nullValue())));
  }
}
