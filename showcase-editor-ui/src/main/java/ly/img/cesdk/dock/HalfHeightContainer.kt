package ly.img.cesdk.dock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HalfHeightContainer(
    content: @Composable BoxScope.() -> Unit
) {
    BoxWithConstraints() {
        Box(Modifier.heightIn(max = maxHeight / 2)) {
            content()
        }
    }
}