package Tasks;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestReport implements ITestListener
{
	 //Task_Common CT = new Task_Common();
	 public static StringBuffer trs = new StringBuffer();
	
	
	@Override

    public void onStart(ITestContext arg0) {
 
        System.out.println("**********************<<<<< Test Logs/Report : Start >>>>>***************************************");
		System.out.println("\nStart Of Execution(TEST) : "+arg0.getName());
		trs.append("Start Of Execution(TEST) : "+arg0.getName());
    }
 
    @Override
 
    public void onTestStart(ITestResult arg0) {
 
        System.out.println("	Test Started : "+arg0.getName());
    	trs.append("\n	Test Started : "+arg0.getName());
    }
 
    @Override
 
    public void onTestSuccess(ITestResult arg0) {
 
        System.out.println("		Test Completed : "+arg0.getName());
    	trs.append("\n		Test Completed : "+arg0.getName());
    }
 
    @Override
 
    public void onTestFailure(ITestResult arg0) {
 
       System.out.println("		Test Failed : "+arg0.getName());
    	trs.append("\n		Test Failed : "+arg0.getName());
    	//CT.screenShot(System.setProperty("user.dir", "//FailedTestReportScreenShots"));
    }
 
    @Override
 
    public void onTestSkipped(ITestResult arg0) {
 
        System.out.println("		Test Skipped : "+arg0.getName());
    	trs.append("\n		Test Skipped : "+arg0.getName());
    }
 
    @Override
 
    public void onFinish(ITestContext arg0) {
 
    		System.out.println("END Of Execution(TEST) : "+arg0.getName());
    		System.out.println("**********************<<<<< Test Logs/Report : END >>>>>***************************************");
    		trs.append("\nEND Of Execution(TEST) : "+arg0.getName());
    }
 
    @Override
 
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
 
    	System.out.println("TestFailedButWithinSuccessPercentage) : "+arg0.getName());
 
    }
}
