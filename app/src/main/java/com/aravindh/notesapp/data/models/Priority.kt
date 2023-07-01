package com.aravindh.notesapp.data.models

import androidx.compose.ui.graphics.Color
import com.aravindh.notesapp.ui.theme.HighPriorityColor
import com.aravindh.notesapp.ui.theme.LowPriorityColor
import com.aravindh.notesapp.ui.theme.MediumPriorityColor
import com.aravindh.notesapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}