package com.novoda.viewmodel.kata.home.presenter;

import com.novoda.viewmodel.kata.data.Note;

import java.util.List;

interface HomeDisplayer {

    void attach(HomeActionListener actionListener);

    void display(List<Note> notes);
}
