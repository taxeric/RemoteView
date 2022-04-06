package com.lanier.remoteview.glance

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.background
import androidx.glance.appwidget.cornerRadius
import androidx.glance.layout.*
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.lanier.remoteview.R
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
            .fillMaxWidth()
            .wrapContentHeight()
            .background(day = Purple200, night = Purple500)
            .cornerRadius(10.dp)
            .padding(10.dp)
        ) {
            Row (
                modifier = GlanceModifier.fillMaxWidth().fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = GlanceModifier.width(70.dp).height(70.dp).cornerRadius(10.dp),
                    provider = ImageProvider(R.drawable.ic_avatar),
                    contentDescription = "avatar"
                )
                Spacer(modifier = GlanceModifier.width(10.dp))
                Column (modifier = GlanceModifier.fillMaxSize()) {
                    Text(
                        text = "风追烟花雨 🎇",
                        modifier = GlanceModifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = ColorProvider(White)
                        ),
                    )
                    Spacer(modifier = GlanceModifier.height(10.dp))
                    Text(
                        text = "氤氲冉作霜",
                        modifier = GlanceModifier.fillMaxWidth(),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = ColorProvider(White)
                        )
                    )
                }
            }
        }
    }
}