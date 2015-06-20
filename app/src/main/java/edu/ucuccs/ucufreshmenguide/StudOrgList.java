package edu.ucuccs.ucufreshmenguide;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;


public class StudOrgList extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stud_org_list);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

       FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentByTag(ViewPagerTabFragmentParentFragment.FRAGMENT_TAG) == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.fragment, new ViewPagerTabFragmentParentFragment(), ViewPagerTabFragmentParentFragment.FRAGMENT_TAG);
            ft.commit();
            fm.executePendingTransactions();
        }
    }


}
