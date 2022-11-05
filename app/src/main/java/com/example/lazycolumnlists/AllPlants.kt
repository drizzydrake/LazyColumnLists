package com.example.lazycolumnlists

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items // was not there before
import androidx.compose.material.MaterialTheme // was not there before
import androidx.compose.material.Scaffold // was not there before
import androidx.compose.material.Text // was not there before
import androidx.compose.material.TopAppBar // was not there before
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment // was not there before
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//   @OptIn(ExperimentalMaterial3Api:class)
    @Composable
    fun AllPlants(platList: List<Plant>) {

        Scaffold(
            topBar = {
                TopAppBar(
                    backgroundColor = MaterialTheme.colors.primary,
                    title = { Text(stringResource(R.string.app_name)) }
                )
            }
        )
        {

            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 25.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "\uD83C\uDF3F  Plants in Cosmetics",
                            style = MaterialTheme.typography.h3
                        )
                    }
                }
                items(platList) { plant ->
                    PlantCard(plant.name, plant.description, plant.imageRes)
                }
            }
        }
    }