package cn.huida.burt.zsxs.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import java.util.ArrayList;
import cn.huida.burt.zsxs.R;
import cn.huida.burt.zsxs.page.BaseFragment;
import cn.huida.burt.zsxs.page.ClassPager;
import cn.huida.burt.zsxs.page.HomePager;
import cn.huida.burt.zsxs.page.MyClassPager;
import cn.huida.burt.zsxs.page.PersonPager;
import cn.huida.burt.zsxs.utils.LogUtils;

import static com.ashokvarma.bottomnavigation.BottomNavigationBar.BACKGROUND_STYLE_STATIC;
import static com.ashokvarma.bottomnavigation.BottomNavigationBar.MODE_FIXED;

/**
 * Created by Burt on 2017/7/2 0002.
 */

public abstract class BaseActivity extends FragmentActivity {
    public BaseActivity mActivity;
    public FragmentManager mFragMann;
    public BottomNavigationBar navigationBar;
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initFragment();
    }

    private void initFragment() {
        ArrayList<BaseFragment> pagerList=new ArrayList<BaseFragment>();
        pagerList.add(new HomePager());
        pagerList.add(new MyClassPager());
        pagerList.add(new ClassPager());
        pagerList.add(new PersonPager());
        MainActivity.PagerAdapter adapter = new PagerAdapter(mFragMann, pagerList);
        LogUtils.log("数组没问题");
        viewPager.setAdapter(adapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override
            public void onPageSelected(int position) {
                navigationBar.selectTab(position);
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        initData();
    }
    public abstract void initData();

    private void initViews() {
        mActivity=this;
        mFragMann=BaseActivity.this.getSupportFragmentManager();
        viewPager = (ViewPager) findViewById(R.id.vp_main);
        navigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        navigationBar
                .setMode(MODE_FIXED)
                .setBackgroundStyle(BACKGROUND_STYLE_STATIC)
                .setActiveColor(R.color.colorGreen)
                .addItem(new BottomNavigationItem(R.drawable.home_selector, "首页"))
                .addItem(new BottomNavigationItem(R.drawable.class_selector, "选课"))
                .addItem(new BottomNavigationItem(R.drawable.myclass_selector, "我的课"))
                .addItem(new BottomNavigationItem(R.drawable.mycenter_selector, "个人中心"))
                .setFirstSelectedPosition(0)
                .initialise();

        navigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener(){
            @Override
            public void onTabSelected(int position) {
                PopToast(position);
                viewPager.setCurrentItem(position);
            }
            @Override
            public void onTabUnselected(int position) {}
            @Override
            public void onTabReselected(int position) {}
        });
    }

    public void PopToast(Object info){
        Toast.makeText(mActivity,"Info"+info,Toast.LENGTH_SHORT).show();
    }

    class PagerAdapter extends FragmentPagerAdapter {
        private ArrayList<BaseFragment> pagerList;
        public PagerAdapter(FragmentManager fm, ArrayList<BaseFragment> pagerList) {
            super(fm);
            this.pagerList=pagerList;
        }
        @Override
        public int getCount() {
            return pagerList.size();
        }
        @Override
        public Fragment getItem(int position) {
            return pagerList.get(position);
        }
    }
}