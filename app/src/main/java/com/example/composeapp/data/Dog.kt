package com.example.composeapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.composeapp.R


data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int
)

val dogs = listOf(
    Dog(R.drawable.dog_tinky, R.string.tingky),
    Dog(R.drawable.dog_winky, R.string.wingky),
    Dog(R.drawable.dog_dipsy, R.string.dipsy),
    Dog(R.drawable.dog_lala, R.string.lala),
    Dog(R.drawable.dog_pooh, R.string.pooh),
    Dog(R.drawable.dog_sepooh, R.string.sepooh),
    Dog(R.drawable.dog_piglet, R.string.piglet),
    Dog(R.drawable.dog_rabbit, R.string.rabbit),
    Dog(R.drawable.dog_tiger, R.string.tiger)
)