package com.example.todoapp.presentation.screens.edit.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todoapp.R
import com.example.todoapp.presentation.screens.edit.EditScreenAction
import com.example.todoapp.presentation.themes.AppTheme
import com.example.todoapp.presentation.themes.mainTheme.MainTheme
import com.example.todoapp.presentation.themes.themeColors

@Composable
fun EditDeleteBtn(
    modifier: Modifier = Modifier,
    enabled: Boolean,
    screenAction: (EditScreenAction) -> Unit,
) {
    val deleteBtnDescription = stringResource(id = R.string.deleteBtnDescription)
    val buttonDisabledDescription = stringResource(id = R.string.buttonDisabledDescription)
    TextButton(
        onClick = {
            screenAction(EditScreenAction.OnTaskDelete)
        },
        enabled = enabled,
        colors = ButtonDefaults.textButtonColors(
            contentColor = themeColors.colorRed,
            disabledContentColor = themeColors.labelDisable
        ),
        modifier = modifier
            .clearAndSetSemantics { this.contentDescription =
                "$deleteBtnDescription. ${if (!enabled) buttonDisabledDescription else ""}"
            }
    ) {
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = null,
        )
        Text(
            text = stringResource(id = R.string.delete),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .padding(start = 12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun EditDeleteBtnPreview() {
    AppTheme(theme = MainTheme) {
        EditDeleteBtn(
            enabled = true,
            screenAction = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun EditDeleteBtnDisablePreview() {
    AppTheme(theme = MainTheme) {
        EditDeleteBtn(
            enabled = false,
            screenAction = {},
        )
    }
}
