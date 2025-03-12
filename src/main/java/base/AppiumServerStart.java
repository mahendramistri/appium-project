package base;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import static io.appium.java_client.service.local.flags.GeneralServerFlag.*;
public class AppiumServerStart {
    public static AppiumDriverLocalService service;
    public static AppiumServiceBuilder builder;
    public static void startServer() {
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1").usingPort(4723).withArgument(BASEPATH, "/wd/hub").withArgument(USE_DRIVERS, "uiautomator2").withArgument(SESSION_OVERRIDE);
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Is Service Running:  " + service.isRunning());
    }
    public static void stopServer() {
        service.stop();
    }
}
