import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightresercation.model.business.manager.AllBusinessTests;
import com.flightreservation.model.domain.AllDomainTests;
import com.flightreservation.model.services.AllServiceTests;

@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllDomainTests.class, AllServiceTests.class})
public class ApplicationTestSuite {

}
