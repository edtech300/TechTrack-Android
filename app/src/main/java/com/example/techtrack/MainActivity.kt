
package com.example.techtrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.techtrack.ui.theme.TechTrackTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateListOf

data class Device(
    val name: String,
    val type: String,
    val manufacturer: String,
    val model: String,
    val ipAddress: String
)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TechTrackTheme {
                TechTrackHome()
            }
        }
    }
}

@Composable
fun TechTrackHome() {
    var showAddDevice by remember { mutableStateOf(false) }
    var deviceName by remember { mutableStateOf("") }
    var deviceType by remember { mutableStateOf("") }
    var manufacturer by remember { mutableStateOf("") }
    var model by remember { mutableStateOf("") }
    var ipAddress by remember { mutableStateOf("") }

    val devices = remember {
        mutableStateListOf<Device>()
    }
    if (showAddDevice) {
        AlertDialog(
            onDismissRequest = { showAddDevice = false },
            title = { Text("Add Device") },

            text = {
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    OutlinedTextField(
                        value = deviceName,
                        onValueChange = { deviceName = it },
                        label = { Text("Device Name") },
                        singleLine = true
                    )

                    OutlinedTextField(
                        value = deviceType,
                        onValueChange = { deviceType = it },
                        label = { Text("Device Type") },
                        singleLine = true
                    )

                    OutlinedTextField(
                        value = manufacturer,
                        onValueChange = { manufacturer = it },
                        label = { Text("Manufacturer") },
                        singleLine = true
                    )

                    OutlinedTextField(
                        value = model,
                        onValueChange = { model = it },
                        label = { Text("Model") },
                        singleLine = true
                    )

                    OutlinedTextField(
                        value = ipAddress,
                        onValueChange = { ipAddress = it },
                        label = { Text("IP Address") },
                        singleLine = true
                    )
                }
            },

            confirmButton = {
                TextButton(
                    onClick = {
                        devices.add(
                            Device(
                                name = deviceName.trim(),
                                type = deviceType.trim(),
                                manufacturer = manufacturer.trim(),
                                model = model.trim(),
                                ipAddress = ipAddress.trim()
                            )
                        )

                        deviceName = ""
                        deviceType = ""
                        manufacturer = ""
                        model = ""
                        ipAddress = ""
                        showAddDevice = false
                    },
                    enabled = deviceName.isNotBlank()
                ) {
                    Text("Save Device")
                }
            }
        )
    }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                showAddDevice = true
            }) {
                Text("+")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "TechTrack",
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "IT Equipment Inventory",
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "My Devices",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(16.dp))


            if (devices.isEmpty()) {
                Text(
                    text = "No devices added yet.",
                    style = MaterialTheme.typography.bodyMedium
                )
            } else {
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.verticalScroll(rememberScrollState())
                ) {
                    devices.forEach { device ->
                        Card(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(
                                    text = device.name,
                                    style = MaterialTheme.typography.titleMedium
                                )
                                Text("Type: ${device.type}")
                                Text("Manufacturer: ${device.manufacturer}")
                                Text("Model: ${device.model}")
                                Text("IP Address: ${device.ipAddress}")
                            }
                        }
                    }
                }
            }

        }
    }
}
