
package cn.huida.burt.zsxs.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import cn.huida.burt.zsxs.R;


/**
 * Created by Administrator on 2017/3/28.
 */

public class MyClassPager extends BaseFragment {
    @Override
    public void addView() {
        mFrameLayout.addView(inflater.inflate(R.layout.class_layout,null));
    }
}
