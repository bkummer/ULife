package com.limerick.cs4028.ulife;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class ClubsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.saved_tabs, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.list);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {"American Football", "Archery", "Athletics", "Badminton","Basketball","Boxing","GAA","Handball","Kayaking","Hockey",
                "Rugby","Mountain Biking","Rowing","Skydiving","Soccer","Swimming","Trampoline","Ultimate Frisbee"};

        private String[][] children = {{"The UL American Fooball team is the UL Vikings"}, {"ULAC is the colleges archery club"}, {"The UL Wolves athletic club"},
                {"UL Wolves Badminton club"},{"UL Wolves Basketball club"},{"UL Wolves Boxing club"},{"UL Wolves GAA club"},{"UL Wolves handball club"},
                {"UL Wolves Kayaking club"},{"UL Wolves Hockey club"},{"UL Wolves rugby club"},{"UL Wolves Mountain biking club"},{"UL Wolves rowing club"},
                {"UL Wolves skydiving club"},{"UL Wolves Soccer club"},{"UL Wolves swimming club"},{"UL Wolves trampoline club"},{"UL Wolves Ultimate frisbee club"}};

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(ClubsFragment.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setPadding(100, 0, 0, 0);
            textView.setTextColor(Color.BLUE);
            textView.setTextSize(30);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(ClubsFragment.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            textView.setPadding(100, 0, 0, 0);
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(20);
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }

}