package user.joker.com.libs_base;

import android.app.Application;
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



}
