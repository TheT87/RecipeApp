package com.example.view

import javafx.scene.layout.BorderPane
import tornadofx.*

/**
 * layer on top of DrawerView in case there needs to be more than a drawer in the MainView
 *
 * */
class MainView : View("TornadoFX Info Browser") {

    override val root : BorderPane = borderpane {
        center<DrawerView>()

    }
}




