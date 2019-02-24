/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create ArrayList for english words
        ArrayList<Word> english_words = new ArrayList<>();
        english_words.add(new Word("one", "lutti", R.mipmap.miwok1));
        english_words.add(new Word("two", "otiiko",R.mipmap.miwok2));
        english_words.add(new Word("three", "tolookosu",R.mipmap.miwok3));
        english_words.add(new Word("four", "oyyisa",R.mipmap.miwok4));
        english_words.add(new Word("five", "massakko",R.mipmap.miwok5));
        english_words.add(new Word("six", "temmokka",R.mipmap.miwok6));
        english_words.add(new Word("seven", "kenekaku",R.mipmap.miwok7));
        english_words.add(new Word("eight", "kawinta",R.mipmap.miwok8));
        english_words.add(new Word("nine", "wo'e",R.mipmap.miwok9));
        english_words.add(new Word("ten", "na'aacha",R.mipmap.miwok10));

        ArrayAdapter<Word> wordAdapter = new WordAdapter(this, english_words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
