package com.lanier.remoteview.glance

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.background
import androidx.glance.appwidget.cornerRadius
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.lanier.remoteview.ui.theme.Purple200
import com.lanier.remoteview.ui.theme.Purple500
import com.lanier.remoteview.ui.theme.White

/**
 * Create by Eric
 * on 2022/4/6
 */
class TestGlanceWidget: GlanceAppWidget() {
    @Composable
    override fun Content() {
           Column(modifier = GlanceModifier
                .fillMaxSize()
                .background(day = Purple200, night = Purple500)
                .cornerRadius(10.dp)
                .padding(8.dp)
            ) {
                 Text(
                   text = "风追烟花雨",
                   modifier = GlanceModifier.fillMaxWidth(),
                   style = TextStyle(fontWeight = FontWeight.Bold, color = ColorProvider(White)),
                  )
                }
    }
}