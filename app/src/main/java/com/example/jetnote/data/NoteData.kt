package com.example.jetnote.data

import com.example.jetnote.model.Note

class NoteData {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Hello world!", description = "One description"),
            Note(title = "To-DO List", description = "Buy milk, do laundry, go to the gym"),
            Note(title = "Doctor's appointment", description = "Dental cleaning appointment tomorrow at 10:00 AM."), Note(title = "Work meeting", description = "Meeting with the marketing team to discuss the new advertising campaign."),
            Note(title = "Project idea", description = "App concept to help users find vegan restaurants."),
            Note(title = "Blog post inspiration", description = "Article about the mental and physical health benefits of meditation."),
            Note(title = "Recipe: Chocolate cake", description = "Ingredients: 1 cup flour, 1/2 cup cocoa powder, 1 teaspoon baking soda, 1/2 teaspoon salt, 1 cup sugar, 1/2 cup butter, 2 eggs")
        )
    }
}