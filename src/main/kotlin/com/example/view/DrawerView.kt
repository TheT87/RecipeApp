package com.example.view

import tornadofx.*

/**
 * main drawer containing all functionality at this moment
 */
class DrawerView : View("My View") {

    private val recipeByCategoryView : RecipeByCategoryView by inject()
    override val root = drawer{
        setMinSize(800.0,500.0)


        item("Rezeptvorschlag", expanded = true){

        }

        item("Alle Rezepte") {
            this.children.add(recipeByCategoryView.root)
        }
        item("Zutaten") {

        }
    }
}
