package cn.huida.burt.zsxs.page;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import cn.huida.burt.zsxs.R;
import cn.huida.burt.zsxs.activity.BaseActivity;

/**
 * Created by Burt on 2017/7/2 0002.
 */

public abstract class BaseFragment extends Fragment {
    public LayoutInflater inflater;
    public BaseActivity baseActivity;
    public FrameLayout mFrameLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        this.inflater=inflater;
        View mView=inflater.inflate(R.layout.empty_layout,null);
        mFrameLayout = (FrameLayout) mView.findViewById(R.id.fragment_container);
        addView();
        return mView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        baseActivity= (BaseActivity) context;

    }

    public abstract void addView();
}
