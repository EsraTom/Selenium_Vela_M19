package Com.DemoWebShop_Generic_Utility;

public interface FrameWorkConstants {

	JavaUtility javaUtility = new JavaUtility();

	static String propertyFilePath = "./src/test/resources/testData/commonData.properties";

	static String excelFilePath = "./src/test/resources/testData/testScriptData.xlsx";

	static String screenShotsPath = "./src/main/resources/screenshots/" + javaUtility.localDateAndTime() + ".png";

	static String reportsPath = "./src/main/resources/reports/" + javaUtility.localDateAndTime() + ".html";

}
