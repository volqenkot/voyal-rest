package io.volqe.utils;

import java.awt.*;

public interface StringUtil {
    static String prefix = Color.WHITE + "[VOYAL-REST] ";
    static String enabled = prefix  + Color.GREEN + "Enabled";
    static String disabled = prefix + Color.RED + "Disabled";
    static String online = prefix + Color.GREEN + "is now Online";
    static String offline = prefix + Color.RED + "is now Offline";
    static String prefixError = Color.RED + "[VOYAL-REST] » " + Color.RED + "Error: ";
}
