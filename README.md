# Androidx_Preference_V2
### LATEST-VERSION

[![](https://jitpack.io/v/alphatech-apps/Androidx_Preference_V2.svg)](https://jitpack.io/#alphatech-apps/Androidx_Preference_V2)

## Install
Add it in your root `build.gradle` at the end of repositories:
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency:
```gradle
dependencies {
	          implementation 'com.github.alphatech-apps:Androidx_Preference_V2:LATEST-VERSION'
	}
```

## Features
* Day Night
* Compact/Material Design

## Usage


Add view to your prefferences layout: 
#### res/xml/preferences.xml:


### 1 Compact
```xml
    <PreferenceCategory
    android:layout="@layout/preference_layout_compact_category_big"
    app:allowDividerAbove="false"
    app:allowDividerBelow="false"/>

<PreferenceCategory
android:layout="@layout/preference_layout_compact_category_small"
app:allowDividerAbove="true"
app:allowDividerBelow="true"/>

<SwitchPreferenceMaterial
android:layout="@layout/preference_layout_compact_switch_material"/>

<CheckBoxPreference
android:layout="@layout/preference_layout_compact_checkbox"/>

<ListPreference
android:layout="@layout/preference_layout_compact_double"/>

<MultiSelectListPreference
android:layout="@layout/preference_layout_compact_double"/>

<EditTextPreference
android:layout="@layout/preference_layout_compact_double"/>

<SeekBarPreference
android:layout="@layout/preference_layout_compact_seekbar"/>

<DropDownPreference
android:layout="@layout/preference_layout_compact_dropdown"/>

<Preference
android:layout="@layout/preference_layout_compact_double"/>

<Preference
android:layout="@layout/preference_layout_compact_double_red"/>

 ```


### 2 Compact No Icon
```xml
    <PreferenceCategory
    android:layout="@layout/preference_layout_compact_noicon_category_big"
    app:allowDividerAbove="false"
    app:allowDividerBelow="false"/>

    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_noicon_category_small"
        app:allowDividerAbove="true"
        app:allowDividerBelow="true"/>
        
    <SwitchPreferenceMaterial
        android:layout="@layout/preference_layout_compact_noicon_switch_material"/>

    <CheckBoxPreference
        android:layout="@layout/preference_layout_compact_noicon_checkbox"/>

    <ListPreference
        android:layout="@layout/preference_layout_compact_noicon_double"/>

    <MultiSelectListPreference
        android:layout="@layout/preference_layout_compact_noicon_double"/>
        
        <EditTextPreference
            android:layout="@layout/preference_layout_compact_noicon_double"/>

        <SeekBarPreference
            android:layout="@layout/preference_layout_compact_noicon_seekbar"/>

        <DropDownPreference
            android:layout="@layout/preference_layout_compact_noicon_dropdown"/>

        <Preference
            android:layout="@layout/preference_layout_compact_noicon_double"/>

            <Preference
            android:layout="@layout/preference_layout_compact_noicon_double_red"/>

 ```


### 3 Material
```xml
    <PreferenceCategory
    android:layout="@layout/preference_layout_compactmaterial_category_big"
    app:allowDividerAbove="false"
    app:allowDividerBelow="false"/>

    <PreferenceCategory
        android:layout="@layout/preference_layout_material_category_small"
        app:allowDividerAbove="true"
        app:allowDividerBelow="true"/>
        
    <SwitchPreferenceMaterial
        android:layout="@layout/preference_layout_material_switch_material"/>

    <CheckBoxPreference
        android:layout="@layout/preference_layout_material_checkbox"/>

    <ListPreference
        android:layout="@layout/preference_layout_material_double"/>

    <MultiSelectListPreference
        android:layout="@layout/preference_layout_material_double"/>
        
        <EditTextPreference
            android:layout="@layout/preference_layout_material_double"/>

        <SeekBarPreference
            android:layout="@layout/preference_layout_material_seekbar"/>

        <DropDownPreference
            android:layout="@layout/preference_layout_material_dropdown"/>

        <Preference
            android:layout="@layout/preference_layout_material_double"/>

            <Preference
            android:layout="@layout/preference_layout_material_double_red"/>

 ```


### 4 Material No Icon
```xml
    <PreferenceCategory
    android:layout="@layout/preference_layout_material_noicon_category_big"
    app:allowDividerAbove="false"
    app:allowDividerBelow="false"/>

    <PreferenceCategory
        android:layout="@layout/preference_layout_material_noicon_category_small"
        app:allowDividerAbove="true"
        app:allowDividerBelow="true"/>
        
    <SwitchPreferenceMaterial
        android:layout="@layout/preference_layout_material_noicon_switch_material"/>

    <CheckBoxPreference
        android:layout="@layout/preference_layout_material_noicon_checkbox"/>

    <ListPreference
        android:layout="@layout/preference_layout_material_noicon_double"/>

    <MultiSelectListPreference
        android:layout="@layout/preference_layout_material_noicon_double"/>
        
        <EditTextPreference
            android:layout="@layout/preference_layout_material_noicon_double"/>

        <SeekBarPreference
            android:layout="@layout/preference_layout_material_noicon_seekbar"/>

        <DropDownPreference
            android:layout="@layout/preference_layout_material_noicon_dropdown"/>

        <Preference
            android:layout="@layout/preference_layout_material_noicon_double"/>

            <Preference
            android:layout="@layout/preference_layout_material_noicon_double_red"/>

 ```


## Full activity for example
.....................
### res/xml/preferences.xml:
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.preference.PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <ListPreference
        android:defaultValue="system"
        android:entries="@array/theme_options"
        android:entryValues="@array/theme_options_values"
        android:icon="@drawable/round_signal_wifi_statusbar_connected_no_internet_4_24"
        android:key="theme_select"
        android:layout="@layout/preference_layout_compact_double"
        android:title="App Theme" />

    <MultiSelectListPreference
        android:defaultValue="@array/weekdays_values"
        android:dialogTitle="Choose weekdays"
        android:entries="@array/weekdays_entries"
        android:entryValues="@array/weekdays_values"
        android:icon="@drawable/round_signal_wifi_statusbar_connected_no_internet_4_24"
        android:key="weekdays_selected"
        android:layout="@layout/preference_layout_compact_double"
        android:title="Select weekdays" />


    <Preference
        android:icon="@drawable/outline_ads_click_24"
        android:layout="@layout/preference_layout_compact_double"
        android:summary="Note: This method is caany subclass initialization. Nidden methods will get called"
        android:title="Compact Preference" />

    <Preference
        android:icon="@drawable/outline_ads_click_24"
        android:layout="@layout/preference_layout_compact_double"
        android:summary="Note: This method is caany subclass initialization. Nidden methods will get called"
        android:title="Compact Preference" />

    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_category_big"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <SwitchPreferenceMaterial
            android:defaultValue="1"
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_switch_material"
            android:summary="This is SwitchPreferenceMaterial summary"
            android:title="This is SwitchPreferenceMaterial" />

        <CheckBoxPreference
            android:defaultValue="false"
            android:icon="@drawable/outline_alarm_24"
            android:layout="@layout/preference_layout_compact_checkbox"
            android:summary="This is CheckBoxPreference summary"
            android:title="This is CheckBoxPreference" />

        <ListPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_backup_24"
            android:key="list_compact"
            android:layout="@layout/preference_layout_compact_double"
            android:summary="This is ListPreference summary"
            android:title="This is ListPreference" />

        <MultiSelectListPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_alarm_24"
            android:key="multilist_compact"
            android:layout="@layout/preference_layout_compact_double"
            android:summary="This is MultiSelectListPreference summary"
            android:title="This is MultiSelectListPreference" />
    </PreferenceCategory>

    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_category_small"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="true"
        app:allowDividerBelow="true">

        <EditTextPreference
            android:icon="@drawable/outline_backup_24"
            android:key="edittext_compact"
            android:layout="@layout/preference_layout_compact_double"
            android:summary="This is EditTextPreference summary"
            android:title="This is EditTextPreference" />

        <SeekBarPreference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_seekbar"
            android:summary="This is SeekBarPreference summary"
            android:title="This is SeekBarPreference" />

        <DropDownPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_cell_tower_24"
            android:layout="@layout/preference_layout_compact_dropdown"
            android:summary="This is DropDownPreference summary"
            android:title="This is DropDownPreference" />
    </PreferenceCategory>
    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_category_small"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_double"
            android:summary="Note: This method is caany subclass initialization. Nidden methods will get called"
            android:title="Compact Preference" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_double"
            android:summary="Note: This method is caany subclass initialization. Note: This method is called from the constructor. Overridden methods will get called
     * before any subclass initialization."
            android:title="This is Preference" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_double"
            android:title="This is Preference only Tittle" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_double_red"
            android:title="This is Preference" />

    </PreferenceCategory>


    <Preference
        android:icon="@drawable/outline_ads_click_24"
        android:layout="@layout/preference_layout_compact_noicon_double"
        android:summary="Note: This method is caany subclass initialization. Nidden methods will get called"
        android:title="Compact Preference" />


    <Preference
        android:icon="@drawable/outline_ads_click_24"
        android:layout="@layout/preference_layout_compact_noicon_double"
        android:summary="Note: This method is caany subclass initialization. Nidden methods will get called"
        android:title="Compact Preference" />

    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_noicon_category_big"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <SwitchPreferenceMaterial
            android:defaultValue="1"
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_noicon_switch_material"
            android:summary="This is SwitchPreferenceMaterial summary"
            android:title="This is SwitchPreferenceMaterial" />

        <CheckBoxPreference
            android:defaultValue="false"
            android:icon="@drawable/outline_alarm_24"
            android:layout="@layout/preference_layout_compact_noicon_checkbox"
            android:summary="This is CheckBoxPreference summary"
            android:title="This is CheckBoxPreference" />

        <ListPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_backup_24"
            android:key="list_compact"
            android:layout="@layout/preference_layout_compact_noicon_double"
            android:summary="This is ListPreference summary"
            android:title="This is ListPreference" />

        <MultiSelectListPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_alarm_24"
            android:key="multilist_compact"
            android:layout="@layout/preference_layout_compact_noicon_double"
            android:summary="This is MultiSelectListPreference summary"
            android:title="This is MultiSelectListPreference" />
    </PreferenceCategory>

    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_noicon_category_small"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="true"
        app:allowDividerBelow="true">

        <EditTextPreference
            android:icon="@drawable/outline_backup_24"
            android:key="edittext_compact"
            android:layout="@layout/preference_layout_compact_noicon_double"
            android:summary="This is EditTextPreference summary"
            android:title="This is EditTextPreference" />

        <SeekBarPreference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_noicon_seekbar"
            android:summary="This is SeekBarPreference summary"
            android:title="This is SeekBarPreference" />

        <DropDownPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_cell_tower_24"
            android:layout="@layout/preference_layout_compact_noicon_dropdown"
            android:summary="This is DropDownPreference summary"
            android:title="This is DropDownPreference" />
    </PreferenceCategory>
    <PreferenceCategory
        android:layout="@layout/preference_layout_compact_noicon_category_small"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_noicon_double"
            android:summary="Note: This method is caany subclass initialization. Nidden methods will get called"
            android:title="This is Preference" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_noicon_double"
            android:summary="Note: This method is caany subclass initialization. Note: This method is called from the constructor. Overridden methods."
            android:title="This is Preference" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_noicon_double"
            android:title="This is Preference only Tittle" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_compact_noicon_double_red"
            android:title="This is Preference" />

    </PreferenceCategory>


    <SwitchPreferenceMaterial
        android:defaultValue="1"
        android:icon="@drawable/outline_ads_click_24"
        android:layout="@layout/preference_layout_material_switch_material"
        android:summary="This is SwitchPreferenceMaterial summary"
        android:title="This is SwitchPreferenceMaterial" />

    <CheckBoxPreference
        android:defaultValue="false"
        android:icon="@drawable/outline_alarm_24"
        android:layout="@layout/preference_layout_material_checkbox"
        android:summary="This is CheckBoxPreference summary"
        android:title="This is CheckBoxPreference" />

    <ListPreference
        android:entries="@array/theme_options"
        android:entryValues="@array/theme_options_values"
        android:icon="@drawable/outline_backup_24"
        android:key="list_compact"
        android:layout="@layout/preference_layout_material_double"
        android:summary="This is ListPreference summary"
        android:title="This is ListPreference" />

    <MultiSelectListPreference
        android:entries="@array/theme_options"
        android:entryValues="@array/theme_options_values"
        android:icon="@drawable/outline_alarm_24"
        android:key="multilist_compact"
        android:layout="@layout/preference_layout_material_double"
        android:summary="This is MultiSelectListPreference summary"
        android:title="This is MultiSelectListPreference" />

    <PreferenceCategory
        android:layout="@layout/preference_layout_material_category"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <EditTextPreference
            android:icon="@drawable/outline_backup_24"
            android:key="edittext_compact"
            android:layout="@layout/preference_layout_material_double"
            android:summary="This is EditTextPreference summary"
            android:title="This is EditTextPreference" />

        <SeekBarPreference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_seekbar"
            android:summary="This is SeekBarPreference summary"
            android:title="This is SeekBarPreference" />

        <DropDownPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_cell_tower_24"
            android:layout="@layout/preference_layout_material_dropdown"
            android:summary="This is DropDownPreference summary"
            android:title="This is DropDownPreference" />
    </PreferenceCategory>
    <PreferenceCategory
        android:layout="@layout/preference_layout_material_category"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_double"
            android:summary="Note: This method is caany subclass initialization. Note: This method is called from the constructor. Overridden methods will get called
     * before any subclass initialization."
            android:title="This is Preference" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_double"
            android:title="This is Preference only Tittle" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_double_red"
            android:title="This is Preference" />

    </PreferenceCategory>


    <SwitchPreferenceMaterial
        android:defaultValue="1"
        android:icon="@drawable/outline_ads_click_24"
        android:layout="@layout/preference_layout_material_noicon_switch_material"
        android:summary="This is SwitchPreferenceMaterial summary"
        android:title="This is SwitchPreferenceMaterial" />

    <CheckBoxPreference
        android:defaultValue="false"
        android:icon="@drawable/outline_alarm_24"
        android:layout="@layout/preference_layout_material_noicon_checkbox"
        android:summary="This is CheckBoxPreference summary"
        android:title="This is CheckBoxPreference" />

    <ListPreference
        android:entries="@array/theme_options"
        android:entryValues="@array/theme_options_values"
        android:icon="@drawable/outline_backup_24"
        android:key="list_compact"
        android:layout="@layout/preference_layout_material_noicon_double"
        android:summary="This is ListPreference summary"
        android:title="This is ListPreference" />

    <MultiSelectListPreference
        android:entries="@array/theme_options"
        android:entryValues="@array/theme_options_values"
        android:icon="@drawable/outline_alarm_24"
        android:key="multilist_compact"
        android:layout="@layout/preference_layout_material_noicon_double"
        android:summary="This is MultiSelectListPreference summary"
        android:title="This is MultiSelectListPreference" />

    <PreferenceCategory
        android:layout="@layout/preference_layout_material_noicon_category"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <EditTextPreference
            android:icon="@drawable/outline_backup_24"
            android:key="edittext_compact"
            android:layout="@layout/preference_layout_material_noicon_double"
            android:summary="This is EditTextPreference summary"
            android:title="This is EditTextPreference" />

        <SeekBarPreference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_noicon_seekbar"
            android:summary="This is SeekBarPreference summary"
            android:title="This is SeekBarPreference" />

        <DropDownPreference
            android:entries="@array/theme_options"
            android:entryValues="@array/theme_options_values"
            android:icon="@drawable/outline_cell_tower_24"
            android:layout="@layout/preference_layout_material_noicon_dropdown"
            android:summary="This is DropDownPreference summary"
            android:title="This is DropDownPreference" />
    </PreferenceCategory>
    <PreferenceCategory
        android:layout="@layout/preference_layout_material_noicon_category"
        android:title="This is PreferenceCategory"
        app:allowDividerAbove="false"
        app:allowDividerBelow="false">

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_noicon_double"
            android:summary="Note: This method is caany subclass initialization. Note: This method is called from the constructor. Overridden methods will get called
     * before any subclass initialization."
            android:title="This is Preference" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_noicon_double"
            android:title="This is Preference only Tittle" />

        <Preference
            android:icon="@drawable/outline_ads_click_24"
            android:layout="@layout/preference_layout_material_noicon_double_red"
            android:title="This is Preference" />

    </PreferenceCategory>

</androidx.preference.PreferenceScreen>
 ```

.....................
### SettingsActivity:
```java

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

 ```

## Screenshots

### 1 Compact
![](https://github.com/alphatech-apps/Androidx_Preference_V2/blob/master/Screenshots/1.png)
### 2 Compact without icon:
![](https://github.com/alphatech-apps/Androidx_Preference_V2/blob/master/Screenshots/2.png)
### 3 Material
![](https://github.com/alphatech-apps/Androidx_Preference_V2/blob/master/Screenshots/3.png)
### 4 Material without icon:
![](https://github.com/alphatech-apps/Androidx_Preference_V2/blob/master/Screenshots/4.png)

