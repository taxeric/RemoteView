package com.lanier.remoteview.broadcast

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import com.lanier.remoteview.glance.TestGlanceWidget

/**
 * Create by Eric
 * on 2022/4/6
 */
class RemoteReceiver(
    override val glanceAppWidget: GlanceAppWidget = TestGlanceWidget()
) : GlanceAppWidgetReceiver()