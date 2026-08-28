package Com.DemoWebShop_Generic_Utility;

import java.time.LocalDateTime;

public class JavaUtility {

	public String localDateAndTime() {

		String value = LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
		return value;

	}

}
