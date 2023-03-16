package ly.img.cesdk.dock.options.fillstroke

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ly.img.cesdk.core.components.ColorButton
import ly.img.cesdk.core.components.color_picker.ColorPickerButton
import ly.img.cesdk.core.components.color_picker.fillAndStrokeColors

@Composable
fun ColorOptions(
    enabled: Boolean,
    selectedColor: Color,
    onNoColorSelected: () -> Unit,
    onColorSelected: (Color) -> Unit,
    openColorPicker: () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ColorButton(color = null, selected = !enabled, onClick = onNoColorSelected)
        fillAndStrokeColors.forEach { color ->
            ColorButton(color = color, selected = color == selectedColor && enabled, onClick = {
                onColorSelected(color)
            })
        }
        ColorPickerButton(color = selectedColor, onClick = openColorPicker)
    }
}