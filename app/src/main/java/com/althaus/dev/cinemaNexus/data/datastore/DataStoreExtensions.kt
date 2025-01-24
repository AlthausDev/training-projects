package com.althaus.dev.cinemaNexus.data.datastore

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

// Extensión global para DataStore
val Context.dataStore by preferencesDataStore(name = "settings")
