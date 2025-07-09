package com.didichuxing.doraemonkit.kit.filemanager

import android.app.Activity
import android.content.Context
import com.didichuxing.doraemonkit.R
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.google.auto.service.AutoService

@AutoService(AbstractKit::class)
class NetWorkMock2Kit : AbstractKit() {
    override val name: Int
        get() = R.string.dk_kit_file_network_mock
    override val icon: Int
        get() = R.mipmap.dk_net_mock

    override fun onClickWithReturn(activity: Activity): Boolean {
        startUniversalActivity(NetWorkMockSyncFragment::class.java, activity)
        return true
    }

    override fun onAppInit(context: Context?) {
    }

    override val isInnerKit: Boolean
        get() = true

    override fun innerKitId(): String {
        return "dokit_sdk_platform_ck_networkmock"
    }
}
