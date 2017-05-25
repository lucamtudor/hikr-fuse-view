package com.shiftstudio.fuseviewtest;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.fuse.views.ExportedViews;
import com.fuse.views.FuseViewsActivity;
import com.fuse.views.ViewHandle;

public class MainActivity extends FuseViewsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewHandle fuseHandle = ExportedViews.instantiate("HikrAppView");

        final FrameLayout root = (FrameLayout) findViewById(R.id.fuse_root);
        final View fuseApp = fuseHandle.getView();
        root.addView(fuseApp);
    }
}
