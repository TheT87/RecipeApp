package com.example.view


import javafx.scene.paint.Color
import tornadofx.*

/**
 * recipe categories overview
 */
class RecipeByCategoryView : View("My View") {
    private val categoryImages = listOf("main_dish.jpg", "dessert.jpg")
    private val categoryTitles = listOf("Hauptgerichte","Nachspeisen")
    override val root = vbox{

        datagrid(categoryImages) {
            cellHeightProperty.set(150.0)
            cellWidthProperty.set(200.0)
            cellCache {
                stackpane {
                    imageview(it)


                    label(categoryTitles[0]) {
                        style {
                            
                            stroke = Color.BLACK
                            textFill = Color.WHITE

                        }
                    }
                }

            }
        }
    }
}


