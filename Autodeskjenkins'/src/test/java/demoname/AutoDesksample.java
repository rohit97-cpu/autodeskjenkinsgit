package demoname;

public class AutoDesksample {
    public static void main(String[] args) {
		System.out.println("hi");
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		System.out.println(browser);
		System.out.println(url);
		String os = System.getProperty("os.name");
            System.out.println(os);
	}
}
