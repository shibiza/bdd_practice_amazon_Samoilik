package org.example.properties.converters;

import org.example.enumeration.SupportedBrowsers;

public final class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {

        switch (webBrowser){
            case "local_chrome" : return SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox": return SupportedBrowsers.LOCAL_FIREFOX;
            case "remote_chrome": return SupportedBrowsers.REMOTE_CHROME;
            default: throw new IllegalArgumentException("No appropriate browser found");
        }
    }
}
