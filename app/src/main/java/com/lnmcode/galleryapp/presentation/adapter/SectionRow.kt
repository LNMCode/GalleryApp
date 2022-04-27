package com.lnmcode.galleryapp.presentation.adapter

data class SectionRow(
    var section: Int = 0,
    var row: Int = 0,
) {

    fun nextSection() {
        this.section++
        this.row = 0
    }

    fun nextRow() = row++

}