package me.vponomarenko.modular.navigation.leaderboard.api

import androidx.navigation.fragment.NavHostFragment
import me.vponomarenko.modular.navigation.common.BaseNavigator

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

interface ModuleBinder {
    fun provideNavHost(): NavHostFragment
    fun provideNavigator(): BaseNavigator
}