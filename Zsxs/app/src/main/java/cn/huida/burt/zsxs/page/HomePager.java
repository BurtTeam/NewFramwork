
package cn.huida.burt.zsxs.page;


import cn.huida.burt.zsxs.R;

/**
 * Created by Administrator on 2017/3/28.
 */

public class HomePager extends BaseFragment  {
    @Override
    public void addView() {
        mFrameLayout.addView(inflater.inflate(R.layout.home_layout,null));
    }
}

