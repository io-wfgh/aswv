package mgks.os.swv;

/*
 * Android Smart WebView is an Open Source Project available on GitHub (https://github.com/mgks/Android-SmartWebView).
 * Initially developed by Ghazi Khan (https://github.com/mgks), under MIT Open Source License.
 * This program is free to use for private and commercial purposes.
 * Enhance Smart WebView with plugins - https://voinsource.github.io/#plugins (Google Login, Background Services, Vision API, Advance Notifications, PQL etc).
 * Please mention project source or credit developers in your Application's License(s) Wiki.
 * Giving right credit to developers encourages them to create better projects :)
 */

class SmartWebView {

	/* -- PERMISSION VARIABLES -- */
	static boolean ASWP_JSCRIPT       = true;         // enable JavaScript for webview
	static boolean ASWP_FUPLOAD       = true;         // upload file from webview
	static boolean ASWP_CAMUPLOAD     = true;         // enable upload from camera for photos
	static boolean ASWP_ONLYCAM       = false;        // incase you want only camera files to upload
	static boolean ASWP_MULFILE       = true;         // upload multiple files in webview
	static boolean ASWP_LOCATION      = true;         // track GPS locations
	static boolean ASWP_CP            = true;        // enable copy/paste within webview

	static boolean ASWP_RATINGS       = true;         // show ratings dialog; auto configured ; edit method get_rating() for customizations

	static boolean ASWP_PULLFRESH     = true;         // pull refresh current url
	static boolean ASWP_PBAR          = true;         // show progress bar in app
	static boolean ASWP_ZOOM          = false;        // zoom control for webpages view
	static boolean ASWP_SFORM         = false;        // save form cache and auto-fill information
	static boolean ASWP_OFFLINE       = false;        // whether the loading webpages are offline or online
	static boolean ASWP_EXTURL        = true;         // open external url with default browser instead of app webview

	static boolean ASWP_TAB           = true;         // instead of default browser, open external URLs in chrome tab
	static boolean ASWP_ADMOB         = true;         // to load admob or not

	static boolean ASWP_EXITDIAL	  = true;         // confirm to exit app on back press

	/* -- SECURITY VARIABLES -- */
	static boolean ASWP_CERT_VERI     = true;         // verify whether HTTPS port needs certificate verification


	/* -- CONFIG VARIABLES -- */
	// orientation setting
	static int ASWV_ORIENTATION	  	  = 1;		      // change device orientation to portrait (1)(default) or landscape (2) or unspecified (0)

	// layout selection
	static int ASWV_LAYOUT            = 1;            // default=0; for clear fullscreen layout, and =1 for drawer layout

	// URL configs
	static String ASWV_URL_ONLINE	  = "https://realty.arcadia.global/?arcapp";	// if online URL is not provided, offline URL will be loaded by default BK https://apps.mgks.dev/swv/?android=true
	static String ASWV_URL_OFFLINE	  = "file:///android_asset/offline.html";	// if ASWP_OFFLINE is set false or ASWV_URL_ONLINE is empty
	static String ASWV_URL;	// complete URL of your website or offline webpage "file:///android_asset/offline.html"; ++ Manual override

	static {
		if (ASWV_URL_ONLINE != null) {
			ASWV_URL_ONLINE.length();
		}
		ASWV_URL = ASWP_OFFLINE ? ASWV_URL_OFFLINE : ASWV_URL_ONLINE;
	}

	static String ASWV_SEARCH         = "https://www.google.com/search?q=";         // search query will start by the end of the present string
	static String ASWV_SHARE_URL      = ASWV_URL + "?share=";                       // URL where you process external content shared with the app

	// domains allowed to be opened inside webview
	static String ASWV_EXC_LIST       = "realty.arcadia.global";       //separate domains with a comma (,)

	// custom user agent defaults
	static boolean POSTFIX_USER_AGENT       = true;         // set to true to append USER_AGENT_POSTFIX to user agent
	static boolean OVERRIDE_USER_AGENT      = false;        // set to true to use USER_AGENT instead of default one
	static String USER_AGENT_POSTFIX        = "ArcApp"; // useful for identifying traffic, e.g. in Google Analytics
	static String CUSTOM_USER_AGENT         = "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Mobile Safari/537.36";    // custom user-agent

	// to upload any file type using "*/*"; check file type references for more
	static String ASWV_F_TYPE         = "*/*";

	// admob config
	static String ASWV_ADMOB          = "pub-1828034508174448";		// your unique publishers ID


	/* -- RATING SYSTEM VARIABLES -- */
	static int ASWR_DAYS      = 3;            // after how many days of usage would you like to show the dialog
	static int ASWR_TIMES     = 10;           // overall request launch times being ignored
	static int ASWR_INTERVAL  = 2;            // reminding users to rate after days interval

}
