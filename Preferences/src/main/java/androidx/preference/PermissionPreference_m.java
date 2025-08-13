package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class PermissionPreference_m extends Preference {

    private String requestText = "Allow Access";
    private String acceptedText = "Allowed";

    private TextView txtAllowed;
    private TextView txtAllow;
    private boolean allowed = false;

    public PermissionPreference_m(Context context) {
        this(context, null);
    }

    public PermissionPreference_m(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(R.layout.preference_layout_material_permission);

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PermissionPreference);
            String rt = a.getString(R.styleable.PermissionPreference_requestText);
            String at = a.getString(R.styleable.PermissionPreference_acceptedText);
            allowed = a.getBoolean(R.styleable.PermissionPreference_allowed, false);  // default false
            if (rt != null) requestText = rt;
            if (at != null) acceptedText = at;
            a.recycle();
        }
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        txtAllow = (TextView) holder.findViewById(R.id.txt_allow);
        txtAllowed = (TextView) holder.findViewById(R.id.txt_allowed);

        if (txtAllow != null) {
            txtAllow.setText(requestText);
//            txtAllow.setOnClickListener(v -> setAllowed(true));
        }
        if (txtAllowed != null) {
            txtAllowed.setText(acceptedText);
        }

        updateAllowedViews();
    }

    private void updateAllowedViews() {
        if (txtAllow == null || txtAllowed == null) return;

        if (allowed) {
            txtAllowed.setVisibility(TextView.VISIBLE);
            txtAllow.setVisibility(TextView.GONE);
        } else {
            txtAllowed.setVisibility(TextView.GONE);
            txtAllow.setVisibility(TextView.VISIBLE);
        }
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean isAllowed) {
        if (allowed != isAllowed) {
            allowed = isAllowed;
            notifyChanged();  // refresh UI
        }
    }

    public void setRequestText(String text) {
        requestText = text;
        if (txtAllow != null) {
            txtAllow.setText(text);
        }
    }

    public void setAcceptedText(String text) {
        acceptedText = text;
        if (txtAllowed != null) {
            txtAllowed.setText(text);
        }
    }

    // Optional: programmatically set title
    public void setTitleText(String title) {
        setTitle(title);
    }

    // Optional: programmatically set summary
    public void setSummaryText(String summary) {
        setSummary(summary);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }
}
