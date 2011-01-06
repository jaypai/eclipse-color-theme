package com.github.fhd.eclipsecolortheme.themepreferencemapper;

import java.util.*;

/** Maps color themes to preferences for Eclipse's Java properties editor. */
public class JavaPropertiesEditorMapper extends ThemePreferenceMapper {
    /** Creates a new color theme mapper. */
    public JavaPropertiesEditorMapper() {
        super("org.eclipse.jdt.ui");
    }

    @Override
    public void map(Map<String, String> theme) {
        putPreference("pf_coloring_comment", theme.get("singleLineComment"));
        putPreference("pf_coloring_key", theme.get("foreground"));
        putPreference("pf_coloring_assignment", theme.get("foreground"));
        putPreference("pf_coloring_value", theme.get("string"));
        putPreference("pf_coloring_argument", theme.get("keyword"));
    }

    @Override
    protected void putDependentEntries(String key) {
    }

    @Override
    public void clear() {
        preferences.remove("pf_coloring_comment");
        preferences.remove("pf_coloring_key");
        preferences.remove("pf_coloring_assignment");
        preferences.remove("pf_coloring_value");
        preferences.remove("pf_coloring_argument");
    }
}
