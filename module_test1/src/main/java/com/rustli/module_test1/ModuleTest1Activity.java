package com.rustli.module_test1;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.rustli.lib_common.CommonUtils;
import com.rustli.lib_common.base.BaseActivity;

public class ModuleTest1Activity extends BaseActivity {
    private static final String TAG = "ModuleTest1Activity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_test1);
        String str = CommonUtils.getCommonStr();
//        Toast.makeText(this, "this is test1" + str, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: str is " + str);
    }
}
