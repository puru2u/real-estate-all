package com.zawadz88.realestate.util;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Class providing a set of utility methods related to a device
 *
 * @author Piotr Zawadzki
 */
public class DeviceUtils {

    /**
     * Checks if OS version is greater and/or equal than HoneyComb
     * @return true if OS version is greater and/or equal than HoneyComb
     */
    public static boolean isEqualOrHigherThanHoneycomb() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
    }

    /**
     * Checks if OS version is greater and/or equal than Ice Cream Sandwich
     * @return true if OS version is greater and/or equal than Ice Cream Sandwich
     */
    public static boolean isEqualOrHigherThanICS() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    /**
     * Checks if device is online
     * @param context
     * @return true if device is connected to the internet, false otherwise
     */
    public static boolean isOnline(final Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float convertDpToPixel(final float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, metrics);
        return px;
    }

    /**
     * This method converts device specific pixels to density independent pixels.
     *
     * @param px A value in px (pixels) unit. Which we need to convert into db
     * @return A float value to represent dp equivalent to px value
     */
    public static float convertPixelsToDp(final float px) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f);
        return dp;
    }

}
