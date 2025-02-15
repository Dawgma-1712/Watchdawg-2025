//2022 Mark and Micheal(Officer). Excel Oliver(The Excel God)
//2023 Micheal, Andy, and Simon(Oliver II). Excel Oliver(The Excel God)(Officer)
//2024 Simon(Officer)(Oliver II) and Luka. Excel Ivan. UI design Mason
//2025 Simon(Officer)(Oliver II). Excel Ivan. UI design Mason. Git managment Terrence

package com.example.frcscoutingapp2022;

import android.graphics.Bitmap;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public static Bitmap bitmap;
    private static boolean qrReady = false;

    //Set up Varibles
    public static String teamNumber;
    public static String matchNumber;
    public static String scoutName;
    public static int alliance = 0;
    public static EditText teamNumText;
    public static EditText matchNumText;
    public static EditText scoutNameText;

    //Varibles we need but I don't know what they do
    public static int[][] buttonData;
    public static int[] checkBoxData;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private save saveFragment;

    //Defense Varibles
    public static int playedDefense = 0;
    public static int defendedOn = 0;
    public static String defendedOnByNumber = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);

        tabLayout.setupWithViewPager(viewPager);

        //Makes Pages work I think though I don't know how
        VPadapter vpAdapter = new VPadapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        vpAdapter.addFragment(new Auto(), "Auto");
        vpAdapter.addFragment(new Teleop(), "Teleop");
        vpAdapter.addFragment(new endgame(), "Endgame");
        vpAdapter.addFragment(new save(), "Save");
        viewPager.setAdapter(vpAdapter);

        //Some Set up things
        teamNumText = (EditText) findViewById(R.id.teamNum);
        matchNumText = (EditText) findViewById(R.id.matchNum);
        scoutNameText = (EditText) findViewById(R.id.name);

        //defense
        playedDefense = 0;
        defendedOn = 0;




    }

    public static void editMatchData(int ind0, int ind1, int value) {
        buttonData[ind0][ind1] = value;
    }

    public void onCheckBoxClicked(View view) {
        // Is view checked
        boolean checked = ((CheckBox) view).isChecked();

        // Check which one clicked
        switch (view.getId()) {
            case R.id.playedDefenseCheckBox:
                //MainActivity.checkBoxData[2] = checked ? 1 : 0;
                MainActivity.playedDefense = checked ? 1 : 0;

                break;
            case R.id.GotDefendedCheckBox:
                //MainActivity.checkBoxData[3] = checked ? 1 : 0;
                MainActivity.defendedOn = checked ? 1 : 0;

                break;


            case R.id.LeaveCheckBox:
                //MainActivity.checkBoxData[16] = checked ? 1 : 0;
                Auto.leave = checked ? 1 : 0;

                break;
            case R.id.penalized:
                //MainActivity.checkBoxData[17] = checked ? 1 : 0;
                endgame.penalty = checked ? 1 : 0;

                break;
            case R.id.deadBot:
                //MainActivity.checkBoxData[18] = checked ? 1 : 0;
                endgame.deadBot = checked ? 1 : 0;

                break;

        }


    }

    public void onRadioButtonClicked(View view) {
       RadioGroup EndgameRadioGroup = (RadioGroup)findViewById(R.id.EndgameRadioGroup);
       RadioGroup AutoRadioGroup = (RadioGroup)findViewById(R.id.AutoRadioGroup);

        //run all radio buttons
        switch (view.getId()) {
            case R.id.blue:
                MainActivity.alliance = 1;
                System.out.println(MainActivity.alliance);
                break;

            case R.id.red:
                MainActivity.alliance = 0;
                System.out.println(MainActivity.alliance);
                break;


            case R.id.Shallow:
                if(endgame.Shallow ==1){
                    EndgameRadioGroup.clearCheck();
                    endgame.Shallow =0;
                }
                else{
                    endgame.Shallow =1;
                    endgame.Parking =0;
                    endgame.Deep=0;
                System.out.println(endgame.Shallow);
                System.out.println(endgame.Parking);}
                break;
            case R.id.Parking:
                if(endgame.Parking==1){
                    EndgameRadioGroup.clearCheck();
                    endgame.Parking=0;
                }
                else{
                    endgame.Shallow =0;
                    endgame.Parking =1;
                    endgame.Deep = 0;
                System.out.println(endgame.Shallow);
                System.out.println(endgame.Parking);}
                break;
            case R.id.Deep:
                if(endgame.Deep==1){
                    EndgameRadioGroup.clearCheck();
                    endgame.Deep=0;
                }
                else{
                    endgame.Shallow =0;
                    endgame.Parking =0;
                    endgame.Deep = 1;
                    System.out.println(endgame.Shallow);
                    System.out.println(endgame.Parking);}
                break;
        }

        boolean checked = ((RadioButton) view).isChecked();
    }

}
