package ru.msokolov.cryptomessenger.bottom_navigation

import ru.msokolov.cryptomessenger.R
import ru.msokolov.cryptomessenger.navigation.NavCommand
import javax.inject.Inject

class BottomNavigationImpl @Inject constructor(): BottomNavigation {
    override val toHome: NavCommand = NavCommand(R.id.action_feature_crypto_list)
}