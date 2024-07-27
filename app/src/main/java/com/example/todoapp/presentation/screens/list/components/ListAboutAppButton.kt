package com.example.todoapp.presentation.screens.list.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapp.R
import com.example.todoapp.presentation.themes.themeColors

@Composable
fun ListAboutAppButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    IconButton(
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = themeColors.colorBlue
        ),
        onClick = { onClick() },
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_info_24),
            contentDescription = stringResource(id = R.string.hideDoneTaskBtnDescription),
            modifier = Modifier.padding()
        )
    }
}

@Preview
@Composable
private fun ListAboutAppButtonPreview() {
    ListAboutAppButton(
        onClick = {},
    )
}
