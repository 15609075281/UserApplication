package user.joker.com.libs_base;

import android.app.Application;
import android.content.res.Configuration;
import android.graphics.Point;
import android.view.WindowManager;
import org.xutils.x;

/**
 * Created by Administrator on 2018/4/21 0021.
 * mark:joker
 */
public class MyApplication extends Application {

    private MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        //xUtils
        xUtils(myApplication);
        //pt
        resetDensity();
    }

    /**
     * xUtils
     *
     * @param myApplication
     */
    private void xUtils(MyApplication myApplication) {
        x.Ext.init(myApplication);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        resetDensity();
    }
    public final static float DESIGN_WIDTH = 375;
    public void resetDensity(){
        Point size = new Point();
        ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay().getSize(size);

        getResources().getDisplayMetrics().xdpi = size.x/DESIGN_WIDTH*72f;
    }


}
