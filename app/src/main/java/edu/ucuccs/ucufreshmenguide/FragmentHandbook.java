package edu.ucuccs.ucufreshmenguide;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FragmentHandbook extends Fragment {


    public static final String TAG = "handbook";

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_handbook,
                container, false);

        expListView = (ExpandableListView) rootView.findViewById(R.id.listView);

        prepareListData();

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader,
                listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView arg0, View arg1,
                                        int arg2, long arg3) {
                // TODO Auto-generated method stub
                return false;
            }

        });

        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override

            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int  childPosition, long id) {
                // TODO Auto-generated method stub
				/**/
                listDataHeader.get(groupPosition);
                listDataChild.get(childPosition);

                switch (groupPosition) {

                    case 0:
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 0;

                                i.putExtra("index_key", index);
                                startActivity(i);

                                break;

                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 1;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 2: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 2;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 3: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 3;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }

                        }
                        break;
                    case 1:
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 4;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 5;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 2: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 6;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 3: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 7;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 4: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 8;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 5: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 9;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                        }
                        break;
                    case 2: {
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 10;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 11;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 2: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 12;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 3: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 13;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 4: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 14;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 5: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 15;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 6: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 16;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 7: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 17;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                        }
                        break;
                    }

                    case 3: {
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 18;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 19;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                        }
                        break;
                    }

                    case 4: {
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 20;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;
                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 21;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 2: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 22;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 3: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 23;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 4: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 24;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 5: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 25;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 6: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 26;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 7: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 27;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 8: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 28;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 9: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 29;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 10: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 30;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 11: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 31;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }

                        }
                        break;
                    }
                    case 5: {
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 32;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 33;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 2: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 34;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 3: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 35;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }

                        }
                        break;
                    }
                    case 6: {
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 36;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 37;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }

                        }
                        break;
                    }
                    case 7: {
                        switch (childPosition) {
                            case 0: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 38;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 1: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 39;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }
                            case 2: {
                                Intent i = new Intent(getActivity(),
                                        PolicyViewing.class);
                                int index = 40;
                                i.putExtra("index_key", index);
                                startActivity(i);
                                break;

                            }

                        }
                        break;
                    }

                }

                return false;
            }
        });

        expListView.expandGroup(0);

        return rootView;
    }
    private void prepareListData() {
        // TODO Auto-generated method stub
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<>();

        listDataHeader.add("Primer");
        listDataHeader.add("Admission and Retention");
        listDataHeader.add("Academic Rules and Regulations");
        listDataHeader.add("Academic Freedom and Student Duties and Responsibilities");
        listDataHeader.add("Student Services");
        listDataHeader.add("Student Publication");
        listDataHeader.add("Campus Organizations");
        listDataHeader.add("Code of Discipline");

        List<String> primir = new ArrayList<String>();
        primir.add("Brief History");
        primir.add("Vision, Mision, Goal and Objectives");
        primir.add("University Seal");
        primir.add("UCU Programs");

        List<String> s1 = new ArrayList<String>();
        s1.add("A. Admission");
        s1.add("B. Academic Retention");
        s1.add("C. Registration Procedures");
        s1.add("D. Curriculum Revision and Implementation");
        s1.add("E. Classification of Students");
        s1.add("F. Scholarship and Grants for Students");

        List<String> s2 = new ArrayList<String>();
        s2.add("A. School Terms");
        s2.add("B. Class Hours");
        s2.add("C. Academic Load");
        s2.add("D. Grading System");
        s2.add("E. Graduation Requirements");
        s2.add("F. Citations/Awards");
        s2.add("G. School Credentials");
        s2.add("H. Tuition and Miscellaneous Fees");

        List<String> s3 = new ArrayList<String>();
        s3.add("A. Academic Freedom as the Right of an Individual Student");
        s3.add("B. Duties and Responsibilities of Students");

        List<String> s4 = new ArrayList<String>();
        s4.add("A. Office of Student Affairs(OSA)");
        s4.add("B. Guidance Office");
        s4.add("C. Library");
        s4.add("D. Multi-Media Library");
        s4.add("E. Audio-Visual Room");
        s4.add("F. Laboratories");
        s4.add("G. Enhancement Services");
        s4.add("H. Sports Development Services");
        s4.add("I. Medical/Dental/Nursing Services");
        s4.add("J. Security Services");
        s4.add("K. Janitotial Services");
        s4.add("L. Canteen");

        List<String> s5 = new ArrayList<String>();
        s5.add("I. Definition");
        s5.add("II. Recognition");
        s5.add("III. Printing and Circulation");
        s5.add("IV. Editorial Board and Staff Selection");

        // Adding child data for Section6
        List<String> s6 = new ArrayList<String>();
        s6.add("A. General Policies");
        s6.add("B. Specific Policies");

        // Adding child data for Sectio7
        List<String> s7 = new ArrayList<String>();
        s7.add("I. General Policy");
        s7.add("II. Student Discipline");
        s7.add("III. Types of Offenses");

        listDataChild.put(listDataHeader.get(0), primir);
        listDataChild.put(listDataHeader.get(1), s1);
        listDataChild.put(listDataHeader.get(2), s2);
        listDataChild.put(listDataHeader.get(3), s3);
        listDataChild.put(listDataHeader.get(4), s4);
        listDataChild.put(listDataHeader.get(5), s5);
        listDataChild.put(listDataHeader.get(6), s6);
        listDataChild.put(listDataHeader.get(7), s7);

    }

}



