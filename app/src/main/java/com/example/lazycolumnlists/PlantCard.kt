package com.example.lazycolumnlists

import android.content.res.Configuration
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun PlantCard(name: String, description: String, image: Int) {
    Card(
        modifier = Modifier
            // The space between each card and the other
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        //elevation = 5.dp,
        //backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            androidx.compose.foundation.Image(
                painter = painterResource(id = image),

                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit,
            )
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = name,
                    //style = MaterialTheme.typography.h2,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .fillMaxWidth(),
                    //color = MaterialTheme.colors.onSurface,
                )
                Text(
                    text = description,
                    // style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}
