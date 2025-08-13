package androidx.preference;

import static androidx.annotation.RestrictTo.Scope.LIBRARY;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

import com.google.android.material.materialswitch.MaterialSwitch;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class SwitchPreferenceMaterial extends TwoStatePreference {

    private final Listener mListener = new Listener();

    // Switch text for on and off states
    private CharSequence mSwitchOn;
    private CharSequence mSwitchOff;

    public SwitchPreferenceMaterial(@NonNull Context context, @Nullable AttributeSet attrs,
                                    int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        setWidgetLayoutResource(R.layout.preference_layout_compact_switch_material); // ✅ Use custom layout with MaterialSwitch

        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.SwitchPreference, defStyleAttr, defStyleRes);

        setSummaryOn(TypedArrayUtils.getString(a, R.styleable.SwitchPreference_summaryOn,
                R.styleable.SwitchPreference_android_summaryOn));

        setSummaryOff(TypedArrayUtils.getString(a, R.styleable.SwitchPreference_summaryOff,
                R.styleable.SwitchPreference_android_summaryOff));

        setSwitchTextOn(TypedArrayUtils.getString(a,
                R.styleable.SwitchPreference_switchTextOn,
                R.styleable.SwitchPreference_android_switchTextOn));

        setSwitchTextOff(TypedArrayUtils.getString(a,
                R.styleable.SwitchPreference_switchTextOff,
                R.styleable.SwitchPreference_android_switchTextOff));

        setDisableDependentsState(TypedArrayUtils.getBoolean(a,
                R.styleable.SwitchPreference_disableDependentsState,
                R.styleable.SwitchPreference_android_disableDependentsState, false));

        a.recycle();
    }

    public SwitchPreferenceMaterial(@NonNull Context context, @Nullable AttributeSet attrs,
                                    int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public SwitchPreferenceMaterial(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, TypedArrayUtils.getAttr(context,
                R.attr.switchPreferenceStyle,
                android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreferenceMaterial(@NonNull Context context) {
        this(context, null);
    }

    @Override
    public void onBindViewHolder(@NonNull PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        View switchView = holder.findViewById(AndroidResources.ANDROID_R_SWITCH_WIDGET);
        syncSwitchView(switchView);
        syncSummaryView(holder);
    }

    public void setSwitchTextOn(@Nullable CharSequence onText) {
        mSwitchOn = onText;
        notifyChanged();
    }

    public void setSwitchTextOff(@Nullable CharSequence offText) {
        mSwitchOff = offText;
        notifyChanged();
    }

    public @Nullable CharSequence getSwitchTextOn() {
        return mSwitchOn;
    }

    public void setSwitchTextOn(int resId) {
        setSwitchTextOn(getContext().getString(resId));
    }

    public @Nullable CharSequence getSwitchTextOff() {
        return mSwitchOff;
    }

    public void setSwitchTextOff(int resId) {
        setSwitchTextOff(getContext().getString(resId));
    }

    @RestrictTo(LIBRARY)
    @Override
    protected void performClick(@NonNull View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    private void syncViewIfAccessibilityEnabled(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager)
                getContext().getSystemService(Context.ACCESSIBILITY_SERVICE);
        if (!accessibilityManager.isEnabled()) {
            return;
        }

        View switchView = view.findViewById(AndroidResources.ANDROID_R_SWITCH_WIDGET);
        syncSwitchView(switchView);

        View summaryView = view.findViewById(android.R.id.summary);
        syncSummaryView(summaryView);
    }

    // ✅ Updated to use MaterialSwitch instead of Switch
    private void syncSwitchView(View view) {
        if (view instanceof MaterialSwitch) {
            final MaterialSwitch switchView = (MaterialSwitch) view;
            switchView.setOnCheckedChangeListener(null);
            switchView.setChecked(mChecked);
            switchView.setTextOn(mSwitchOn);
            switchView.setTextOff(mSwitchOff);
            switchView.setOnCheckedChangeListener(mListener);
        } else if (view instanceof Checkable) {
            ((Checkable) view).setChecked(mChecked);
        }
    }

    private class Listener implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (!callChangeListener(isChecked)) {
                // Listener didn't like it, change it back.
                // CompoundButton will make sure we don't recurse.
                buttonView.setChecked(!isChecked);
                return;
            }
            SwitchPreferenceMaterial.this.setChecked(isChecked);
        }
    }
}
