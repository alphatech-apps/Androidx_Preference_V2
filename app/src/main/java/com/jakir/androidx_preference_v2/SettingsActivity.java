package com.jakir.androidx_preference_v2;


import android.os.Bundle;
import android.text.TextUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(androidx.preference.R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(androidx.preference.R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar toolbar = findViewById(androidx.preference.R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Settings");
            actionBar.setHomeAsUpIndicator(androidx.preference.R.drawable.round_arrow_back_ios_24);
        }

        // Load Settings Fragment
        getSupportFragmentManager().beginTransaction().replace(androidx.preference.R.id.container, new SettingsFragment()).commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.preferences, rootKey);

            ListPreference themePref = findPreference("theme_select");
            if (themePref != null) {
                themePref.setSummary(themePref.getEntry());

                themePref.setOnPreferenceChangeListener((preference, newValue) -> {
                    int index = themePref.findIndexOfValue(newValue.toString());
                    if (index >= 0) themePref.setSummary(themePref.getEntries()[index]);
                    return true;
                });
            }

            MultiSelectListPreference weekdayPref = findPreference("weekdays_selected");
            if (weekdayPref != null) {
                setSummaryText(weekdayPref, weekdayPref.getValues());

                weekdayPref.setOnPreferenceChangeListener((preference, newValue) -> {
                    Set<String> selectedValues = (Set<String>) newValue;
                    setSummaryText(weekdayPref, selectedValues);
                    return true;
                });
            }


        }

        private void setSummaryText(MultiSelectListPreference pref, Set<String> selectedValues) {
            CharSequence[] entries = pref.getEntries();
            CharSequence[] entryValues = pref.getEntryValues();

            List<String> selectedLabels = new ArrayList<>();

            for (int i = 0; i < entryValues.length; i++) {
                if (selectedValues.contains(entryValues[i].toString())) {
                    selectedLabels.add(entries[i].toString());
                }
            }

            if (selectedLabels.size() == entryValues.length) {
                pref.setSummary("Everyday"); // All 7 days selected
            } else if (selectedLabels.isEmpty()) {
                pref.setSummary("No weekdays selected");
            } else {
                pref.setSummary(TextUtils.join(", ", selectedLabels));
            }
        }

        @Override
        public boolean onPreferenceTreeClick(Preference preference) {
            String key = preference.getKey();
            return super.onPreferenceTreeClick(preference);
        }

    }

}