package com.althaus.dev.cinemaNexus.ui.splash

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.althaus.dev.cinemaNexus.R
import com.althaus.dev.cinemaNexus.ui.theme.components.AppImage
import com.althaus.dev.cinemaNexus.ui.theme.components.BaseLayout
import com.althaus.dev.cinemaNexus.ui.theme.components.PrimaryButton

@Composable
fun SplashView(
    viewModel: SplashViewModel,
    navigateToLogin: () -> Unit,
    navigateToGoogleLogin: () -> Unit
) {
    BaseLayout(
        verticalArragement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        showAppBar = false,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Caja para el logo
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            AppImage(
                painter = painterResource(id = R.drawable.default_profile),
                contentDescription = "Logo de la aplicación",
                size = 150.dp
            )
        }

        // Caja para los botones
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PrimaryButton(
                    text = "Iniciar Sesión",
                    onClick = navigateToLogin
                )

                Spacer(modifier = Modifier.height(16.dp))

                PrimaryButton(
                    text = "Iniciar con Google",
                    onClick = navigateToGoogleLogin,
                    icon = painterResource(id = R.drawable.google)
                )
            }
        }
    }
}

@Preview
@Composable
fun SplashViewPreview() {
    SplashView(
        viewModel = SplashViewModel(),
        navigateToLogin = {},
        navigateToGoogleLogin = {}
    )
}
