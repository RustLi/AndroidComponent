package com.rustli.module_test2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.rustli.lib_common.CommonUtils;
import com.rustli.lib_common.base.BaseActivity;

public class ModuleTest2Activity extends BaseActivity {
    private static final String TAG = "ModuleTest2Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_test2);
        String str = CommonUtils.getCommonStr();
//        Toast.makeText(this, "this is test2" + str, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: str is " + str);
    }
}
