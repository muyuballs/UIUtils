package info.breezes.android.uiutils;

import android.util.Log;
import android.view.Menu;

import java.lang.reflect.Method;

/**
 * Created by Qiao on 2014/9/10.
 */
public class MenuHelper {
    public static void setIconEnable(Menu menu, boolean enable) {
        try {
            Class<?> clazz = Class.forName("com.android.internal.view.menu.MenuBuilder");
            Method m = clazz.getDeclaredMethod("setOptionalIconsVisible", boolean.class);
            m.setAccessible(true);
            m.invoke(menu, enable);
        } catch (Exception e) {
            Log.w(null, e);
        }
    }
}
