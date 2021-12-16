package com.example.noteslister.feature_note.domain.use_case

import com.example.noteslister.feature_note.domain.use_case.AddNote
import com.example.noteslister.feature_note.domain.use_case.DeleteNote
import com.example.noteslister.feature_note.domain.use_case.GetNote
import com.example.noteslister.feature_note.domain.use_case.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
